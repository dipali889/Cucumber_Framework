package com.stepDefination;

import com.Utils.IntractebleUtilsCF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NCStepDefination {

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		IntractebleUtilsCF.setup();
	}

	@When("User open URL {string}")
	public void user_open_url(String string) {
		IntractebleUtilsCF.getURL();
		String ActualTitle = IntractebleUtilsCF.getTitle();
		System.out.println("----"+ActualTitle+"----");
		System.out.println();  
		
		if(ActualTitle.contains("Login"))
			System.out.println("---User navigate to login----");
		else
			System.out.println("User not able to navigate login page");
		
	}

	@And("User entersEmail as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	    
	}

	@And("Click on Login")
	public void click_on_login() {
	    
	}

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    
	}

	@When("user clicks on {string} in to dashboard screen")
	public void user_clicks_on_in_to_dashboard_screen(String string) {
	    
	}

	@Then("verify catalog sub-category list is displayed in the dashboard screen")
	public void verify_catalog_sub_category_list_is_displayed_in_the_dashboard_screen() {
	    
	}

	@When("user click on {string} in to dashboard screen")
	public void user_click_on_in_to_dashboard_screen(String string) {
	    
	}
}


