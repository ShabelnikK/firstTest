package org.example.Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainSetUp {
    public WebDriver driver;
    LoginPage login;
    NewContactPage newContact;
    Header header;
    ContactListHelper contactListHelper;

    public LoginPage getLogin() {
        return login;
    }
    public NewContactPage getNewContact() {
        return  newContact;
    };
    public Header getHeader(){
        return header;
    }
    public ContactListHelper getContactListHelper() {
        return contactListHelper;
    }

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
        header = new Header(driver);
        contactListHelper = new ContactListHelper(driver);
    }

    public void stop() {
        driver.quit();
    }


}
