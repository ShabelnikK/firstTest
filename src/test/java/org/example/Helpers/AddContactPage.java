package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactPage extends Helper {

    By firstNameField = By.cssSelector("[placeholder=\"Имя\"]");
    By lastNameField = By.cssSelector("[placeholder=\"Фамилия\"]");
    By descriptionField = By.cssSelector("[placeholder=\"About\"]");
    By saveButton = By.xpath("//button[.='Сохранить']");

    public AddContactPage(WebDriver driver) {
        super(driver);
    }


    public void fillFieldAddContact(String firstName, String lastName, String description) throws InterruptedException {
        fillField(firstName, firstNameField);
        fillField(lastName, lastNameField);
        fillField(description, descriptionField);
        Thread.sleep(1500);
    }

    public void clickSaveNewContactButton() {
        clickOnVisibleElement(saveButton);
    }
}