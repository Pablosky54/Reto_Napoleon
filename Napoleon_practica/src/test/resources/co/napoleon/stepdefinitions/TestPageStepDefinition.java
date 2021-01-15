package co.napoleon.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import co.napoleon.task.OpenTheBrowser;
import co.napoleon.ui.HomePage;
import co.napoleon.ui.LinksPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

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
	public void iChoseOptionIFramesTestAndThenChoseOptionWindowOpenTest() {
		
		theActorInTheSpotlight().attemptsTo(Click.on(LinksPage.IFRAME_LINK)
				//,WaitUntil.the(LinksPage.TABLE_LINK, isCurrentlyVisible())
				//,Scroll.to(LinksPage.TABLE_LINK)
				,Click.on(LinksPage.TABLE_LINK));
				
	    
	}

	@Then("^I verify correct open page$")
	public void iVerifyCorrectOpenPage() throws Exception {
	   
	}



}
