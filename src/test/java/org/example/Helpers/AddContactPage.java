package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactPage extends Helper {

    By firstNameField = By.cssSelector("[formcontrolname=\"firstName\"]");
    By lastNameField = By.cssSelector("[formcontrolname=\"lastName\"]");
    By descriptionField = By.cssSelector("[formcontrolname=\"description\"]");
    By saveButton = By.xpath("//button[.='Save']");

    public AddContactPage(WebDriver driver) {
        super(driver);
    }


    public void fillFieldAddContact(String firstName, String lastName, String description) throws InterruptedException {
        fillField(firstName, firstNameField);
        fillField(lastName, lastNameField);
        fillField(description, descriptionField);
        Thread.sleep(1000);
    }

    public void clickSaveNewContactButton() {
        clickOnVisibleElement(saveButton);
    }
}