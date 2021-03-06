package com.certificacion.automation.stepdefinitions;

import com.certificacion.automation.models.LoginData;
import com.certificacion.automation.questions.MessagePopPup;
import com.certificacion.automation.tasks.EnterDataLogin;
import com.certificacion.automation.tasks.OpenBrowser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Login {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void SetUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        OnStage.theActorCalled("Elvis");
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
    public void userShouldSeeMessageElvis(String login) throws InterruptedException {

        System.out.println("prueba 1 " + login);
        Thread.sleep(2000);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                com.certificacion.automation.questions.Login.message(),
                org.hamcrest.Matchers.equalTo(login)));
    }

    @Then("^user should see the alert message (.*)$")
    public void userShouldSeeTheAlertMessage(String descriptionPoPup) throws Exception {
        Thread.sleep(5000);
        Alert alert = myBrowser.switchTo().alert();
        theActorInTheSpotlight().should(seeThat(MessagePopPup.message(alert.getText()),
                org.hamcrest.Matchers.is(descriptionPoPup)));
    }

    @After
    public void closeScenari() {
        OnStage.drawTheCurtain();
    }

}
