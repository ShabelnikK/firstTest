package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Header extends Helper{

    By languageSelectForm = By.cssSelector("[id=\"langSelect\"]");
    By addForm = By.xpath("//a[.='Добавить новый контакт']");
    By accountForm = By.xpath("//*[@type=\"submit\"][text()=\"Учетная запись \"]");
    By logoutButton = By.xpath("//*[@type=\"submit\"][text()=\"Выйти\"]");

    By changeLanguage = By.cssSelector("[value=\"en\"]");
    public Header(WebDriver driver) {
        super(driver);
    }

    public void openDialogAddNewContact() {
        clickOnVisibleElement(addForm);
    }

    public void openDialogAndChangeLanguage() {
        clickOnVisibleElement(languageSelectForm);
        driver.findElement(changeLanguage).click();
    }
    public void openAccount() {
        clickOnVisibleElement(accountForm);
    }
    public void logOut() {
        clickOnVisibleElement(logoutButton);
    }
}
