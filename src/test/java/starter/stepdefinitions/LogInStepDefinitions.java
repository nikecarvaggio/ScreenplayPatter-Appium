package starter.stepdefinitions;

import example.questions.ValidateLogin;
import example.tasks.DoLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^\"([^\"]*)\" wants to login in the app with username: \"([^\"]*)\" and password: \"([^\"]*)\"$")
    public void actor_wants_to_create_a_new_post(String actor, String username, String password) {
        OnStage.theActorCalled(actor).wasAbleTo(DoLogin.successfully(username, password));
    }

    @Then("Verifies if the login was successfull")
    public void verifies_is_login_was_successfull(){
        OnStage.theActorInTheSpotlight().asksFor(ValidateLogin.successfull());
    }
}
