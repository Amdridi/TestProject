package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("In Step I want to write a step with precondition");
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	  System.out.println("In Step I complete action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	    
	}



}
