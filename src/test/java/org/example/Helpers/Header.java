package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends Helper{

    By languageSelectForm = By.cssSelector("[id=\"langSelect\"]");
    By addForm = By.xpath("//*[@class='nav-link'][@href='/contacts']");
    By accountForm = By.xpath("//*[@type=\"submit\"][text()=\"Учетная запись \"]");
    By logoutButton = By.xpath("//*[@type=\"submit\"][text()=\"Logout\"]");
    By changeLanguage = By.cssSelector("[value=\"en\"]");


    public Header(WebDriver driver) {
        super(driver);
    }

    public void openDialogAddNewContact() throws InterruptedException{
        clickOnVisibleElement(addForm);
        Thread.sleep(1000);
    }

    public void openDialogAndChangeLanguage() throws InterruptedException {
        clickOnVisibleElement(languageSelectForm);
        driver.findElement(changeLanguage).click();
        Thread.sleep(1000);
    }
    public void openAccount() {
        clickOnVisibleElement(accountForm);
    }
    public void logout() throws InterruptedException {
        Thread.sleep(1500);
        clickOnVisibleElement(logoutButton);
    }
}
