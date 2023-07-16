package org.example.Helpers;

import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MainSetUp {
    public WebDriver driver;
    LoginPage login;

    public LoginPage getLogin() {
        return login;
    }

    public void browseSetUp(boolean useRemoteDriver) throws MalformedURLException{
        if (useRemoteDriver == true){
            driver = WebDriverManager.chromedriver().create();
        }
        driver.get("http://phonebook.telran-edu.de:8080");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        login = new LoginPage(driver);
    }

    public void stop() {
        driver.quit();
    }
}
