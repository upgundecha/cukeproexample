Feature: Blog Posts

  Scenario: Get list of Posts
    When user request for list of Posts published on Blog
    Then status code should be 200
