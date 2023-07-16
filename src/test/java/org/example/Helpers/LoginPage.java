package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Helper {

    By loginForm = By.id("login-form");
    By emailField = By.cssSelector("[placeholder=\"Email\"]");
    By passwordField = By.cssSelector("[placeholder=\"Password\"]");
    By loginButton = By.xpath("//button[.=' Login ']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        String email = "test@gmail.com";
        String password = "password";
        clickOnVisibleElement(loginForm);
        fillField(email, emailField);
        fillField(password, passwordField);
        clickOnVisibleElement(loginButton);
    }
}