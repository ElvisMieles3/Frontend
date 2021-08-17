package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((LoginUserInterface.RESPONSE_MESSAGE),
                WebElementStateMatchers.isVisible()));
        return Text.of(LoginUserInterface.RESPONSE_MESSAGE).viewedBy(actor).asString();
    }

    public static Login message() {

        return new Login();
    }
}
