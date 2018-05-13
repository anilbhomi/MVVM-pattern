package com.aaneal.mvvm.viewmodel;

import android.databinding.BaseObservable;

import com.aaneal.mvvm.R;
import com.aaneal.mvvm.model.User;

public class UserModel extends BaseObservable {

    private String username;
    private String password;
    private String usernameHint;
    private String passwordHint;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(R.id.userText);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passText);
    }

    public String getUsernameHint() {
        return usernameHint;
    }

    public void setUsernameHint(String usernameHint) {
        this.usernameHint = usernameHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public UserModel(User user) {
        this.usernameHint = user.usernameHint;
        this.passwordHint = user.passwordHint;
    }
}
