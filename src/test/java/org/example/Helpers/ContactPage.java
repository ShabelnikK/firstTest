package org.example.Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Helper{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    By saveButton = By.xpath("//*[@type=\"submit\"][text()=\" Save \"]");

    //Вкладка информация(info)
    By infoFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Info\"]");
    By editInfo = By.xpath("//*[@id=\"btn-edit-contact\"][text()=\"Edit \"]");
    By contactNewFirstName = By.cssSelector("[formcontrolname=\"firstName\"]");
    By contactNewLastName = By.cssSelector("[formcontrolname=\"lastName\"]");
    By contactNewDescription = By.cssSelector("[formcontrolname=\"description\"]");

    public void editContactInfoData() throws InterruptedException {
        Faker faker = new Faker();
        String newFirstName = faker.name().firstName();
        String newLastName = faker.name().lastName();
        String newDescription = faker.funnyName().name();
        clickOnVisibleElement(editInfo);
        fillField(newFirstName, contactNewFirstName);
        fillField(newLastName, contactNewLastName);
        fillField(newDescription, contactNewDescription);
        Thread.sleep(1000);
        clickOnVisibleElement(saveButton);
    }

    //Вкладка телефон(Phone)
    By phonesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Phones\"]");
    By addPhoneNumberButton = By.id("btn-add-phone");
    By chooseCodeCountryPhoneNumber = By.xpath("//*[@id=\"cc-select\"]//*[text()=\" Armenia (+374) \"]");
    By addPhoneNumberForm = By.cssSelector("[formcontrolname=\"phoneNumber\"]");

    public void editContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        clickOnVisibleElement(addPhoneNumberButton);
        fillField(addPhoneNumber, addPhoneNumberForm);
        driver.findElement(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1500);
    }
    //Вкладка email
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");
    public void editContactEmailData() {
    }
    //Вкладка адрес(Addresses)
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
        public void editContactAddressesData() {
    }
}
