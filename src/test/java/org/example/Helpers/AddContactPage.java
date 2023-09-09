package org.example.Helpers;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AddContactPage extends Helper {

    By firstNameField = By.cssSelector("[formcontrolname=\"firstName\"]");
    By lastNameField = By.cssSelector("[formcontrolname=\"lastName\"]");
    By descriptionField = By.cssSelector("[formcontrolname=\"description\"]");
    By saveButton = By.xpath("//button[.='Save']");

    @Step("Заполняем поля нового пользователя")
    public void fillFieldAddContact(String firstName, String lastName, String description) throws InterruptedException {
        fillField(firstName, firstNameField);
        fillField(lastName, lastNameField);
        fillField(description, descriptionField);
        Thread.sleep(1000);
    }
    @Step("Проводим проверку")
    public void checkNewAddContact(String firstName){
        $x("//div[@id='contact-first-name'][text()]")
                .shouldBe(Condition.matchText(firstName));

    }

    public void clickSaveNewContactButton() {
        clickOnVisibleElement(saveButton);
    }
}

