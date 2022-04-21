package stepDefinations;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import helpers.BaseClass;
import io.cucumber.java.en.When;



public class updateUser {
	public BaseClass Base;
	public updateUser(BaseClass Base) {
		this.Base = Base;
	}


@When("I try to update the user with userId {string}")
public void i_try_to_update_the_user_with_user_id(String userId) {

	  Map<String, Object> updateUserPayload = new HashMap<>();
	  updateUserPayload.put("first_name","Arhan");
	  updateUserPayload.put("last_name","Singh");

      Base.response = BaseClass.PUT(updateUserPayload, userId);
      


  }
}








