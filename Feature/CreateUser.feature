Feature: Creating new User

Scenario: I want to create new user
	When I try to create a new user with basic valid data
    Then The response should return a 201 status code
    And  The response should match with schema at "schema/createUser.json"
	
	
	