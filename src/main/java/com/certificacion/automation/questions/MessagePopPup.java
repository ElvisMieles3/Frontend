package com.certificacion.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MessagePopPup implements Question<String> {
    private String message;

    public MessagePopPup(String message) {
        super();
        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    public static MessagePopPup message(String message) {

        return new MessagePopPup(message);
    }
}
