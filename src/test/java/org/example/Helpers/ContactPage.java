package org.example.Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Helper{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    By saveButton = By.xpath("//*[@type=\"submit\"][text()=\" Save \"]");
    By addPhoneNumberEmailAndAddressButton = By.id("btn-add-phone");

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
    By chooseCodeCountryPhoneNumber = By.xpath("//*[@id=\"cc-select\"]//*[text()=\" Armenia (+374) \"]");
    By addPhoneNumberForm = By.cssSelector("[formcontrolname=\"phoneNumber\"]");

    public void editContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addPhoneNumber, addPhoneNumberForm);
        driver.findElement(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1500);
    }
    //Вкладка email
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");
    By addEmailContactForm = By.cssSelector("[formcontrolname=\"email\"]");
    public void editContactEmailData() throws InterruptedException{
        clickOnVisibleElement(emailsFormContactPage);
        Faker faker = new Faker();
        String addNewContactEmail = faker.internet().emailAddress();
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addNewContactEmail, addEmailContactForm);
        clickOnVisibleElement(saveButton);
        Thread.sleep(1500);
    }
    //Вкладка адрес(Addresses)
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
    By addNewCity = By.cssSelector("[formcontrolname=\"city\"]");
    By addNewPostcode = By.cssSelector("[formcontrolname=\"zip\"]");
    By addNewStreet = By.cssSelector("[formcontrolname=\"street\"]");
    By chooseContactCountry = By.xpath("//*[@value=\"Bangladesh\"]");
    public void editContactAddressesData() {
            clickOnVisibleElement(addressesFormContactPage);
            Faker faker = new Faker();
            String addNewContactCity = faker.address().city();
            String addNewContactPostcode = faker.address().zipCode();
            String addNewContactStreet = faker.address().streetAddress();
            clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
            driver.findElement(chooseContactCountry).click();
            fillField(addNewContactCity, addNewCity);
            fillField(addNewContactPostcode,addNewPostcode);
            fillField(addNewContactStreet, addNewStreet);
            clickOnVisibleElement(saveButton);
    }
}
