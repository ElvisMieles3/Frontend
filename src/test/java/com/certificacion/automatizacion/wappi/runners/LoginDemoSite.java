package com.certificacion.automatizacion.wappi.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature"
        , glue = "com.certificacion.automatizacion.wappi.stepdefinitions"
        , snippets = SnippetType.CAMELCASE )
public class LoginDemoSite {
}
