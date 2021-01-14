package co.napoleon.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src\\main\\resources\\features\\testPage.feature",
        glue="co.napoleon.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true)
public class TestPage {

}
