package org.example.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Helper{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    //Вкладка информация
    By infoFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Info\"]");
    By editInfo = By.xpath("//*[@id=\"btn-edit-contact\"][text()=\"Edit \"]");
    By contactNewFirstName = By.cssSelector("[formcontrolname=\"firstName\"]");

    public void editContactFirstName(String newFirstName) throws InterruptedException {
        clickOnVisibleElement(editInfo);
        fillField(newFirstName, contactNewFirstName);
        driver.findElement(By.xpath("//*[@type=\"submit\"][text()=\" Save \"]")).click();
        Thread.sleep(1500);
    }
    By phonesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Phones\"]");
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
}
