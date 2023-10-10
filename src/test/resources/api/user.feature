Feature: User
  As a user
  I want to see list of user
  So that I can create new user

  Scenario: GET - As a user I want to get all post data
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive all post data

