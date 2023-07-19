package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends Helper {

    By loginForm = By.id("login-form");
    By emailField = By.cssSelector("[placeholder=\"Email\"]");
    By passwordField = By.cssSelector("[placeholder=\"Password\"]");
    By loginButton = By.xpath("//button[.=' Login ']");
    By contactTable = By.id("contacts-list");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        String email = "test@gmail.com";
        String password = "test@gmail.com";
        Assert.assertTrue(isElementPresent(loginForm));
        fillField(email, emailField);
        fillField(password, passwordField);
        clickOnVisibleElement(loginButton);
        Assert.assertTrue(isElementPresent(contactTable));
    }
}