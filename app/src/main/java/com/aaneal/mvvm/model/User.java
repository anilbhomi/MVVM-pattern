package com.aaneal.mvvm.model;

public class User {
    public String username;
    public String password;
    public String usernameHint;
    public String passwordHint;

    public User(String usernameHint,String passwordHint) {
        this.usernameHint = usernameHint;
        this.passwordHint = passwordHint;
    }
}
