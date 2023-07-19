package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListHelper extends Helper{

    By searchContactForm = By.id("input-search-contact");
    By openContactForm = By.xpath("//*[@id=\"contacts-list\"]//*[@class=\"list-group\"]");
    public ContactListHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFieldSearchContactForm (String searchText) throws InterruptedException {
        clickOnVisibleElement(searchContactForm);
        fillField(searchText, searchContactForm);
        Thread.sleep(1000);
    }
    public void openContact () throws InterruptedException {
        clickOnVisibleElement(openContactForm);
        Thread.sleep(1000);
    }
}
