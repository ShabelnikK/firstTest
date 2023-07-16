package org.example.Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainSetUp {
    public WebDriver driver;
    LoginPage login;

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
    }

    public void stop() {
        driver.quit();
    }

    public LoginPage getLogin() {
        return login;
    }
}
