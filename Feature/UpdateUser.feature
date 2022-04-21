Feature: Update the user

Scenario: I want to update the users
	When I try to update the user with userId "1"
    Then The response should return a 200 status code
    And  The response should match with schema at "schema/updateUser.json"