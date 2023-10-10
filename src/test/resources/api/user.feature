Feature: User
  As a user
  I want to see list of user
  So that I can create new user

  Scenario: GET - As a user I want to get all post data
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive all post data

  Scenario: GET - As a user I want to get specific post data by ID
    Given I set another GET endpoint
    When I send GET method
    Then I receive valid HTTP response code 200
    And I receive a specific post data by ID
