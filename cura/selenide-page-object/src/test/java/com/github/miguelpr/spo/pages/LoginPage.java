package com.github.miguelpr.spo.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        return this;
    }

    public void loginWithCredentials(String username, String password) {
        $("#txt-username").setValue(username);
        $("#txt-password").setValue(password);
        $("#btn-login").click();
    }
}
