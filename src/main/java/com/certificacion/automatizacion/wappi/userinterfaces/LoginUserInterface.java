package com.certificacion.automatizacion.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterface {


    public static final Target ENTER_THE_USERNAME = Target.
            the("Enter the username")
            .located(By.name("username"));

    public static final Target ENTER_THE_PASSWORD = Target.
            the("Enter the password")
            .located(By.name("password"));

    public static final Target SELECT_SAVE_BUTTON = Target.
            the("Select save Button")
            .located(By.name("FormsButton2"));

    public static final Target RESPONSE_MESSAGE = Target.
            the("Muestra el mensaje de las ofertas seleccionadas")
            .locatedBy("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/text()[1]");
}
