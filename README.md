# RWS Assignment

This is a basic Rest API test framework for testing the create user , get user, delete user and update user sceanrio for https://reqres.in. Tests are written using a combination of
Rest Assured, Cucumber, Junit & Maven. The API for https://reqres.in/api doest not actually create user , so i could not create the complete flow by creating user , 
then retreiving the same user , updating it and then later deleteing the created user. So for the testing purpose i have user the user id which is already present . 

1. All the scenarios are defined in BDD style in seperate feature files which is available in Features folder.
2. All the step definations for these feature files are available under stepDefination package . There is seperate step defination class for each feature file.
3. The reusable methods are defined in BaseClass under helpers package.

## Tools

* Java
* Cucumber6:
  * Supports Behaviour Driven Development
* Hamcrest framework for customized assertion matchers
* RESTAssured library for writing simple yet powerful tests

## Test Cases Covered

The following tests were covered:

* Search User
1. Search for all the users.
2. Search for user with valid user id.
3. Search of user with non existing user id

* Create User
4. Create user with valid details.

* Delete User
5. Delete user with valid user id.

* Update User
6. Update the details of the existing user

## How to execute

Requirements to run test:
1. JDK 14.0.1 
2. Maven 3.8.5
3. To run through
(i) Terminal: execute command `mvn clean test` (after navigating to project on terminal).
(ii) Eclipse IDE: run TestRunner.java as a JUnit test.

## Test Reports

Following the execution of a test, an HTML Cucumber report is generated under  target/Extent-reports/Test-output <date and time stamp>/Reports.html
