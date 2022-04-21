package stepDefinations;

import java.util.HashMap;
import java.util.Map;
import helpers.BaseClass;
import io.cucumber.java.en.When;


public class createUser {

	public BaseClass Base;
	public createUser(BaseClass Base) {
		this.Base = Base;
	}
	
	
	@When("I try to create a new user with basic valid data")
	public void i_try_to_create_a_new_user_with_basic_valid_data() {
		  Map<String, Object> newUserPayload = new HashMap<>();
		  newUserPayload.put("first_name","Arhan");
		  newUserPayload.put("last_name","Singh");
		  newUserPayload.put("email","Arhan@gmail.com");


	    Base.response = BaseClass.POST(newUserPayload);
	}




}
