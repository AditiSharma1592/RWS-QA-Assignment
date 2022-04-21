package stepDefinations;

import helpers.BaseClass;
import io.cucumber.java.en.When;


public class deleteUser {

	public BaseClass Base;
	public deleteUser(BaseClass Base) {
		this.Base = Base;
	}

	@When("I try to delete the user with userId {string}")
	public void i_try_to_delete_the_user_with_user_id(String userId) {
		Base.response = Base.DELETE(userId);
		
	}




}
