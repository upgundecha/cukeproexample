Feature: Blog Posts

  Scenario: Get list of Posts
    When user request for list of posts published on blog
    Then status code should be 200
    And response should have a list of posts
