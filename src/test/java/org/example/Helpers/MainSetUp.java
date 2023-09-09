package org.example.Helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Configuration.*;


public class MainSetUp {
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
    }
    public Header getHeader(){
        return header;
    }
    public ContactListPage getContactListPage() {
        return contactListPage;
    }
    public ContactInformationPage getContactPage() {
        return contactPage;
    }

    public void browseSetUp() {
        Selenide.open("http://phonebook.telran-edu.de:8080");


        login = new LoginPage();
        addContact = new AddContactPage();
        header = new Header();
        contactListPage = new ContactListPage();
        contactPage = new ContactInformationPage();
    }

    public void stop() {
        Selenide.closeWebDriver();
    }


}
