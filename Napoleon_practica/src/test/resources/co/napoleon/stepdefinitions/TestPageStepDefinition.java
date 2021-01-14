package co.napoleon.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.napoleon.task.OpenTheBrowser;
import co.napoleon.ui.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TestPageStepDefinition {
	
	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	//tag1
	
	@Given("^\"([^\"]*)\" open page$")
	public void openPage(String actor){
	   
		theActorCalled(actor).wasAbleTo(OpenTheBrowser.on(HomePage.newInstance()));
	}

	@When("^I chose option IFrames Test and then chose option Window Open Test$")
	public void iChoseOptionIFramesTestAndThenChoseOptionWindowOpenTest() throws Exception {
	    
	}

	@Then("^I verify correct open page$")
	public void iVerifyCorrectOpenPage() throws Exception {
	   
	}



}
