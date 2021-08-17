package com.certificacion.automatizacion.wappi.stepdefinitions;

import com.certificacion.automatizacion.wappi.models.LoginData;
import com.certificacion.automatizacion.wappi.questions.Login;
import com.certificacion.automatizacion.wappi.tasks.EnterDataLogin;
import com.certificacion.automatizacion.wappi.tasks.OpenBrowser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginDemoSite {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));

        theActorCalled("Elvis");
    }

    @Given("^that Elvis is in the portal$")
    public void thatElvisIsInThePortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }

    @When("^he enters the credentials$")
    public void heEntersTheCredentials(List<LoginData> loginData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterDataLogin.withData(loginData.get(0)));
    }

    @Then("^user should see message (.*)$")
    public void userShouldSeeMessage(String login) {
        theActorInTheSpotlight().should(seeThat(Login.message(),
                org.hamcrest.Matchers.is(login)));
    }

    @After
    public void cerrarEscenario() {
        OnStage.drawTheCurtain();
    }

}
