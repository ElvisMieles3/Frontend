package com.certificacion.automation.tasks;


import com.certificacion.automation.models.LoginData;
import com.certificacion.automation.userinterfaces.LoginUserInterfaces;
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
        actor.attemptsTo(Enter.theValue(loginData.getusername()).into(LoginUserInterfaces.ENTER_THE_USERNAME));
        actor.attemptsTo(Enter.theValue(loginData.getPassword()).into(LoginUserInterfaces.ENTER_THE_PASSWORD));
        actor.attemptsTo(Click.on(LoginUserInterfaces.SELECT_SAVE_BUTTON));
    }

    public static EnterDataLogin withData(LoginData loginData) {
        return new EnterDataLogin(loginData);
    }
}
