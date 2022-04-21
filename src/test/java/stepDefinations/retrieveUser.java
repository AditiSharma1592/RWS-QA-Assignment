package stepDefinations;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.hamcrest.Matchers;
import org.junit.Assert;

import helpers.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class retrieveUser {



	public BaseClass Base;
	public retrieveUser(BaseClass Base) {
		this.Base = Base;
	}
	
	
	@When("I try to get all users")
	public void i_try_to_get_all_users() {
		Base.response= BaseClass.GETall();
		
	}
	
	
	@Then("The response should return a {int} status code")
	public void the_response_should_return_a_status_code(int statusCode) {
		 Assert.assertEquals(statusCode, Base.response.getStatusCode());
	}


	@Then("The response should match with schema at {string}")
	public void the_response_should_match_with_schema_at(String schemaPath) {
			Base.response.then().body(matchesJsonSchemaInClasspath(schemaPath));
	}


	@When("I try to get user with userId {string}")
	public void i_try_to_get_user_with_user_id(String id) {
		Base.response =	BaseClass.GETwithId(id);
		
	}





}
