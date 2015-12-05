package com.testomatic.cuke;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONArray;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by upgundecha on 05/12/15.
 */
public class StepDefs {

    Response response;

    @When("^user request for list of posts published on blog$")
    public void user_request_for_list_of_posts_published_on_blog() throws Throwable {
        response = get("http://jsonplaceholder.typicode.com/posts");
    }

    @Then("^status code should be (\\d+)$")
    public void status_code_should_be(int statusCode) throws Throwable {
        assertThat(response.getStatusCode(), equalTo(statusCode));
    }

    @Then("^response should have a list of posts$")
    public void response_should_have_a_list_of_posts() throws Throwable {
        JSONArray posts = new JSONArray(response.asString());
        assertThat(posts.length(), is(greaterThan(0)));
    }
}
