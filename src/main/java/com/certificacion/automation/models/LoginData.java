package com.certificacion.automation.models;

public class LoginData {

    private String username;
    private String password;

    public LoginData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getusername() {
        return username;
    }

}
