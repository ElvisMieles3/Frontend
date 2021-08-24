package com.certificacion.automation.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterfaces {

    public static final Target ENTER_THE_USERNAME = Target.
            the("Enter the username")
            .located(By.name("username"));

    public static final Target ENTER_THE_PASSWORD = Target.
            the("Enter the password")
            .located(By.name("password"));

    public static final Target SELECT_SAVE_BUTTON = Target.
            the("Select save button")
            .located(By.name("FormsButton2"));

    public static final Target RESPONSE_MESSAGE = Target.
            the("Response message Username")
            .locatedBy("//*[contains(text(),'The username:')]");
}
