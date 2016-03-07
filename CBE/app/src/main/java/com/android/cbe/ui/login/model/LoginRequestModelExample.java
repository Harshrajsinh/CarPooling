package com.android.cbe.ui.login.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Intern.harshrajT on 3/4/2016.
 */
public class LoginRequestModelExample {

    @SerializedName("username")
    public String userName;

    @SerializedName("password")
    public String passwoord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswoord() {
        return passwoord;
    }

    public void setPasswoord(String passwoord) {
        this.passwoord = passwoord;
    }
}
