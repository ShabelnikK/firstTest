package org.example.Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainSetUp {
    public WebDriver driver;
    LoginPage login;
    NewContactPage newContact;

    public LoginPage getLogin() {
        return login;
    }

    public NewContactPage getNewContact() {
        return  newContact;
    };
    public void browseSetUp(boolean useRemoteDriver) {
        if (useRemoteDriver == true) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            System.out.println("Что-то пошло не так");
        }
        driver.get("http://phonebook.telran-edu.de:8080");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        login = new LoginPage(driver);
        newContact = new NewContactPage(driver);
    }

    public void stop() {
        driver.quit();
    }


}
