package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactPage extends Helper {

    public NewContactPage(WebDriver driver) {
        super(driver);
    }


    By firstNameField = By.cssSelector("[placeholder=\"Имя\"]");
    By lastNameField = By.cssSelector("[placeholder=\"Фамилия\"]");
    By descriptionField = By.cssSelector("[placeholder=\"About\"]");
    By saveButton = By.xpath("//button[.='Сохранить']");


    public void fillFieldAddContact(String firstName, String lastName, String description) {
        fillField(firstName, firstNameField);
        fillField(lastName, lastNameField);
        fillField(description, descriptionField);
    }

    public void clickSaveNewContactButton() {
        clickOnVisibleElement(saveButton);
    }
}