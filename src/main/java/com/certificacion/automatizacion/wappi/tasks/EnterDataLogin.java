package com.certificacion.automatizacion.wappi.tasks;

import com.certificacion.automatizacion.wappi.models.LoginData;
import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDataLogin implements Task {

    private LoginData loginData;

    public EnterDataLogin(LoginData loginData) {

        this.loginData = loginData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(loginData.getUsername()).into(LoginUserInterface.ENTER_THE_USERNAME));
        actor.attemptsTo(Click.on(LoginUserInterface.ENTER_THE_PASSWORD));
        actor.attemptsTo(Enter.theValue(loginData.getPassword()).into(LoginUserInterface.ENTER_THE_PASSWORD));
        actor.attemptsTo(Click.on(LoginUserInterface.SELECT_SAVE_BUTTON));

    }
    public static EnterDataLogin withData(LoginData loginData){

        return new EnterDataLogin(loginData);
    }
}
