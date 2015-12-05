package com.testomatic.cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Cucumber Runner
 * @author softshop
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(format="cucumber.pro.CucumberProFormatter", features = {"."})

public class RunCukeTestIT {
}