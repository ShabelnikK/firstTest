package org.example.Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactInformationPage extends Helper{
    public ContactInformationPage(WebDriver driver) {
        super(driver);
    }

    By saveButton = By.xpath("//*[@type=\"submit\"][text()=\" Save \"]");
    By addPhoneNumberEmailAndAddressButton = By.id("btn-add-phone");
    By openDropdownFormEditOrRemoveContactPhoneEmailOrAddress = By.xpath("//*[@class=\"dropdown-toggle btn btn-outline-light btn-block\"]");

    //Вкладка информация(info)
    By infoFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Info\"]");
    By addInfo = By.id("btn-edit-contact");
    By contactNewFirstName = By.cssSelector("[formcontrolname=\"firstName\"]");
    By contactNewLastName = By.cssSelector("[formcontrolname=\"lastName\"]");
    By contactNewDescription = By.cssSelector("[formcontrolname=\"description\"]");


    public void editContactInfoData() throws InterruptedException{
        Faker faker = new Faker();
        String newFirstName = faker.name().firstName();
        String newLastName = faker.name().lastName();
        String newDescription = faker.funnyName().name();
        clickOnVisibleElement(addInfo);
        fillField(newFirstName, contactNewFirstName);
        fillField(newLastName, contactNewLastName);
        fillField(newDescription, contactNewDescription);
        Thread.sleep(1000);
        clickOnVisibleElement(saveButton);
    }

    //Вкладка телефон(Phone)
    By phonesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Phones\"]");
    By chooseCodeCountryPhoneNumber = By.xpath("//*[@id=\"cc-select\"]//*[text()=\" Armenia (+374) \"]");
    By chooseNewCodeCountryPhoneNumber = By.xpath("//*[@id=\"cc-select\"]//*[text()=\" Aruba (+297) \"]");
    By addPhoneNumberForm = By.cssSelector("[formcontrolname=\"phoneNumber\"]");
    By emptyPhoneData = By.xpath("//*[@ng-reflect-dismissible=\"false\"]");
    By notEmptyPhoneData = By.xpath("//*[@ng-reflect-phones-to-display]");
    By editContactPhoneButton = By.xpath("//*[@class=\"dropdown-item btn-phone-edit\"]");
    By removeContactPhoneButton = By.xpath("//*[@class=\"dropdown-item btn-phone-remove\"]");

    public void addContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addPhoneNumber, addPhoneNumberForm);
        driver.findElement(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    public void editContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
       /* boolean emptyDataPhone = driver.findElement(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();
        boolean notEmptyDataPhone = driver.findElement(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();
        if (emptyDataPhone == true || notEmptyDataPhone != true) {
            System.out.println("У контакта еще нет телефонов");
        } else if (emptyDataPhone != true && notEmptyDataPhone == true){*/
            clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
            clickOnVisibleElement(editContactPhoneButton);
            Faker faker = new Faker();
            String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
            fillField(addPhoneNumber, addPhoneNumberForm);
            driver.findElement(chooseNewCodeCountryPhoneNumber).click();
            clickOnVisibleElement(saveButton);
            Thread.sleep(1000);
       /* }*/
        /*Assert.assertTrue(isElementPresent(emptyPhoneData));
        System.out.println("У контакта еще нет телефонов");
        Assert.assertTrue(isElementPresent(notEmptyPhoneData));
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(editContactPhoneButton);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        fillField(addPhoneNumber, addPhoneNumberForm);
        driver.findElement(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);*/

    }
    public void removeContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(removeContactPhoneButton);
        Thread.sleep(1000);
    }
    //Вкладка email
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");
    By addEmailContactForm = By.cssSelector("[formcontrolname=\"email\"]");
    public void addContactEmailData() throws InterruptedException{
        clickOnVisibleElement(emailsFormContactPage);
        Faker faker = new Faker();
        String addNewContactEmail = faker.internet().emailAddress();
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addNewContactEmail, addEmailContactForm);
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }
    //Вкладка адрес(Addresses)
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
    By addNewCity = By.cssSelector("[formcontrolname=\"city\"]");
    By addNewPostcode = By.cssSelector("[formcontrolname=\"zip\"]");
    By addNewStreet = By.cssSelector("[formcontrolname=\"street\"]");
    By chooseContactCountry = By.xpath("//*[@value=\"Bangladesh\"]");
    public void addContactAddressesData() {
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
