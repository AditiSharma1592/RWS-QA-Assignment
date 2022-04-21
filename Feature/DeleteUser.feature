Feature: Delete the user

Scenario: I want to delete the users
	When I try to delete the user with userId "220"
    Then The response should return a 204 status code
