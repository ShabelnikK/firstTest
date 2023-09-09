package org.example.Helpers;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class Header extends Helper{

    By languageSelectForm = By.cssSelector("[id=\"langSelect\"]");
    By addForm = By.xpath("//*[@class='nav-link'][@href='/contacts']");
    By accountForm = By.xpath("//*[@type=\"submit\"][text()=\"Учетная запись \"]");
    By logoutButton = By.xpath("//*[@type=\"submit\"][text()=\"Logout\"]");
    By changeLanguage = By.cssSelector("[value=\"en\"]");


    @Step("Открыть диалог добавления контакта")
    public void openDialogAddNewContact() throws InterruptedException{
        clickOnVisibleElement(addForm);
        Thread.sleep(1000);
    }
    @Step("Открыть диалог смены языка")
    public void openDialogAndChangeLanguage() throws InterruptedException {
        clickOnVisibleElement(languageSelectForm);
        clickOnVisibleElement(changeLanguage);
        Thread.sleep(1000);
    }
    public void openAccount() {
        clickOnVisibleElement(accountForm);
    }
    @Step("Открыть диалог смены языка")
    public void logout() throws InterruptedException {
        Thread.sleep(1500);
        clickOnVisibleElement(logoutButton);
    }
}
