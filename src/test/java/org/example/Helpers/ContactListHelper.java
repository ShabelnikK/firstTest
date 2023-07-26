package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListHelper extends Helper{

    By searchContactForm = By.id("input-search-contact");
    By openContactForm = By.xpath("//*[@id=\"contacts-list\"]//*[@class=\"list-group\"]");
    public ContactListHelper(WebDriver driver) {
        super(driver);
    }
    //Заполнение поля поиск
    public void fillFieldSearchContactForm (String searchText) throws InterruptedException {
        clickOnVisibleElement(searchContactForm);
        fillField(searchText, searchContactForm);
        Thread.sleep(1000);
    }
    //Открытие карточки контакта
    public void openContact () throws InterruptedException {
        clickOnVisibleElement(openContactForm);
        Thread.sleep(1000);
    }
    //Удаление контакта
    By removeContactButton = By.xpath("//*[@class=\"list-group-item\"]");
    By removeContactConfirmCheckboxAtModalWindow = By.id("check-box-remove-contact");
    By removeContactButtonAtModalWindow = By.id("submit-remove");
    public void removeContact() throws InterruptedException{
        clickOnVisibleElement(removeContactButton);
        clickOnVisibleElement(removeContactConfirmCheckboxAtModalWindow);
        clickOnVisibleElement(removeContactButtonAtModalWindow);
        Thread.sleep(1000);
    }
}
