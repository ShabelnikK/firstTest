package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListHelper extends Helper{

    By searchContactForm = By.id("input-search-contact");
    public ContactListHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFieldSearchContactForm (String searchText){
        clickOnVisibleElement(searchContactForm);
        fillField(searchText, searchContactForm);
    }

}
