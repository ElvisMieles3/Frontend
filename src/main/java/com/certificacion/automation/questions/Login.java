package com.certificacion.automation.questions;

import com.certificacion.automation.userinterfaces.LoginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((LoginUserInterfaces.RESPONSE_MESSAGE),
                WebElementStateMatchers.isVisible()));
        return Text.of(LoginUserInterfaces.RESPONSE_MESSAGE).viewedBy(actor).asString();

    }

    public static Login message() {
        return new Login();
    }
}
