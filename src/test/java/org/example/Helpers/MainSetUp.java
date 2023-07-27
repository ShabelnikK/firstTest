package org.example.Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainSetUp {
    public WebDriver driver;
    LoginPage login;
    AddContactPage addContact;
    Header header;
    ContactListPage contactListPage;
    ContactInformationPage contactPage;

    public LoginPage getLogin() {
        return login;
    }
    public AddContactPage getAddContact() {
        return  addContact;
    };
    public Header getHeader(){
        return header;
    }
    public ContactListPage getContactListPage() {
        return contactListPage;
    }
    public ContactInformationPage getContactPage() {
        return contactPage;
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
        addContact = new AddContactPage(driver);
        header = new Header(driver);
        contactListPage = new ContactListPage(driver);
        contactPage = new ContactInformationPage(driver);
    }

    public void stop() {
        driver.quit();
    }


}
