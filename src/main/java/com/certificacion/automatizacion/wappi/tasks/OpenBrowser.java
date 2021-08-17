package com.certificacion.automatizacion.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("http://thedemosite.co.uk/addauser.php"));

    }

    public static OpenBrowser browser() {

        return Tasks.instrumented(OpenBrowser.class);
    }

}
