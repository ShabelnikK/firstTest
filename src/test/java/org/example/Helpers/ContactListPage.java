package org.example.Helpers;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends Helper{

    By searchContactForm = By.id("input-search-contact");
    By openContactForm = By.xpath("//*[@id=\"contacts-list\"]//*[@class=\"list-group\"]");

    @Step("Заполнение поля поиск")
    public void fillFieldSearchContactForm (String searchText) throws InterruptedException {
        clickOnVisibleElement(searchContactForm);
        fillField(searchText, searchContactForm);
        Thread.sleep(1000);
    }
    @Step("Открытие карточки контакта")
    public void openContact () throws InterruptedException {
        clickOnVisibleElement(openContactForm);
        Thread.sleep(1000);
    }

    By removeContactButton = By.xpath("//*[@class=\"list-group-item\"]");
    By removeContactConfirmCheckboxAtModalWindow = By.id("check-box-remove-contact");
    By removeContactButtonAtModalWindow = By.id("submit-remove");
    @Step("Удаление контакта")
    public void removeContact() throws InterruptedException{
        clickOnVisibleElement(removeContactButton);
        clickOnVisibleElement(removeContactConfirmCheckboxAtModalWindow);
        clickOnVisibleElement(removeContactButtonAtModalWindow);
        Thread.sleep(1000);
    }
}
