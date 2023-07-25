package org.example.Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Helper{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    //Вкладка информация(info)
    By infoFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Info\"]");
    By editInfo = By.xpath("//*[@id=\"btn-edit-contact\"][text()=\"Edit \"]");
    By contactNewFirstName = By.cssSelector("[formcontrolname=\"firstName\"]");
    By contactNewLastName = By.cssSelector("[formcontrolname=\"lastName\"]");
    By contactNewDescription = By.cssSelector("[formcontrolname=\"description\"]");
    public void editContactData() throws InterruptedException {
        Faker faker = new Faker();
        String newFirstName = faker.name().firstName();
        String newLastName = faker.name().lastName();
        String newDescription = faker.funnyName().name();
        clickOnVisibleElement(editInfo);
        fillField(newFirstName, contactNewFirstName);
        fillField(newLastName, contactNewLastName);
        fillField(newDescription, contactNewDescription);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type=\"submit\"][text()=\" Save \"]")).click();
    }

    //Вкладка телефон(Phone)
    By phonesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Phones\"]");

    //Вкладка email
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");

    //Вкладка адрес(Addresses)
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
}
