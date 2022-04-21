Feature: Retrieve new User

Scenario: I want to retrieve all the users
	When I try to get all users
    Then The response should return a 200 status code
    And  The response should match with schema at "schema/getAllUsers.json"
    
	
Scenario: I want to retrieve specific users
	When I try to get user with userId "1"
    Then The response should return a 200 status code
    And  The response should match with schema at "schema/getSingleUser.json"
    

Scenario: I want to retrieve user with invalid user id
	When I try to get user with userId "220"
    Then The response should return a 404 status code
  