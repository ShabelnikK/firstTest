package org.example.Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class ContactInformationPage extends Helper{

    By saveButton = By.xpath("//*[@type=\"submit\"][text()=\" Save \"]");
    By addPhoneNumberEmailAndAddressButton = By.id("btn-add-phone");
    By openDropdownFormEditOrRemoveContactPhoneEmailOrAddress = By.xpath("//*[@class=\"dropdown-toggle btn btn-outline-light btn-block\"]");

    //Вкладка информация(info)
    By infoFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Info\"]");
    By addInfo = By.id("btn-edit-contact");
    By contactNewFirstName = By.cssSelector("[formcontrolname=\"firstName\"]");
    By contactNewLastName = By.cssSelector("[formcontrolname=\"lastName\"]");
    By contactNewDescription = By.cssSelector("[formcontrolname=\"description\"]");


    //Редактирование информации контакта ФИО
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
    By editContactPhoneButton = By.xpath("//*[@class=\"dropdown-item btn-phone-edit\"]");
    By removeContactPhoneButton = By.xpath("//*[@class=\"dropdown-item btn-phone-remove\"]");
    By filterContactPhoneCountryCode = By.xpath("//*[@class=\"text-secondary\"][text()=\"Country code \"]");
    By filterContactPhoneNumber = By.xpath("//*[@class=\"text-secondary\"][text()=\"Phone number \"]");

    //Добавление телефона
    public void addContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addPhoneNumber, addPhoneNumberForm);
        $(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    //Редактирование телефона
    public void editContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(editContactPhoneButton);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        fillField(addPhoneNumber, addPhoneNumberForm);
        $(chooseNewCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    //Удаление телефона
    public void removeContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(removeContactPhoneButton);
        Thread.sleep(1000);
    }

    //Сортировка телефонов
    public void filterContactPhoneData() throws InterruptedException{
        clickOnVisibleElement(phonesFormContactPage);
        clickOnVisibleElement(filterContactPhoneCountryCode);
        clickOnVisibleElement(filterContactPhoneNumber);
        Thread.sleep(1000);
        clickOnVisibleElement(filterContactPhoneCountryCode);
        clickOnVisibleElement(filterContactPhoneNumber);
    }

    //Вкладка email
    By emailsFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"E-mails\"]");
    By addEmailContactForm = By.cssSelector("[formcontrolname=\"email\"]");
    By editContactEmailButton = By.xpath("//*[@class=\"dropdown-item btn-email-edit\"]");
    By removeContactEmailButton = By.xpath("//*[@class=\"dropdown-item btn-email-remove\"]");
    By filterContactEmail = By.xpath("//*[@class=\"text-secondary\"][text()=\"Email \"]");

    //Добавление почты
    public void addContactEmailData() throws InterruptedException{
        clickOnVisibleElement(emailsFormContactPage);
        Faker faker = new Faker();
        String addNewContactEmail = faker.internet().emailAddress();
        clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
        fillField(addNewContactEmail, addEmailContactForm);
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    //Редактирование почты
    public void editContactEmailData() throws InterruptedException{
        clickOnVisibleElement(emailsFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(editContactEmailButton);
        Faker faker = new Faker();
        String addNewContactEmail = faker.internet().emailAddress();
        fillField(addNewContactEmail, addEmailContactForm);
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    //Удаление email
    public void removeContactEmailData() throws InterruptedException {
        clickOnVisibleElement(emailsFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(removeContactEmailButton);
        Thread.sleep(1000);
    }

    //Сортировка email
    public void filterContactEmailData() throws InterruptedException{
        clickOnVisibleElement(emailsFormContactPage);
        clickOnVisibleElement(filterContactEmail);
        Thread.sleep(1000);
        clickOnVisibleElement(filterContactEmail);
    }

    //Вкладка адрес(Addresses)
    By addressesFormContactPage = By.xpath("//*[@role=\"tab\"][text()=\"Addresses\"]");
    By addNewCity = By.cssSelector("[formcontrolname=\"city\"]");
    By addNewPostcode = By.cssSelector("[formcontrolname=\"zip\"]");
    By addNewStreet = By.cssSelector("[formcontrolname=\"street\"]");
    By chooseContactCountry = By.xpath("//*[@value=\"Bangladesh\"]");
    By chooseNewContactCountry = By.xpath("//*[@value=\"Andorra\"]");
    By editContactAddressesButton = By.xpath("//*[@class=\"dropdown-item btn-address-edit\"]");
    By removeContactAddressesButton = By.xpath("//*[@class=\"dropdown-item btn-address-remove\"]");
    By filterContactCountry = By.xpath("//*[@class=\"text-secondary sort-by-country\"]");
    By filterContactCity = By.xpath("//*[@class=\"text-secondary sort-by-city\"]");
    By filterContactPostcode = By.xpath("//*[@class=\"text-secondary sort-by-zip\"]");
    By filterContactStreet = By.xpath("//*[@class=\"text-secondary sort-by-street\"]");

    //Добавление адресов
    public void addContactAddressesData() throws InterruptedException {
            clickOnVisibleElement(addressesFormContactPage);
            Faker faker = new Faker();
            String addNewContactCity = faker.address().city();
            String addNewContactPostcode = faker.address().zipCode();
            String addNewContactStreet = faker.address().streetAddress();
            clickOnVisibleElement(addPhoneNumberEmailAndAddressButton);
            $(chooseContactCountry).click();
            fillField(addNewContactCity, addNewCity);
            fillField(addNewContactPostcode,addNewPostcode);
            fillField(addNewContactStreet, addNewStreet);
            clickOnVisibleElement(saveButton);
            Thread.sleep(1000);
    }

    //Редактирование адресов
    public void editContactAddressesData() throws InterruptedException {
        clickOnVisibleElement(addressesFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(editContactAddressesButton);
        Faker faker = new Faker();
        String addNewContactCity = faker.address().city();
        String addNewContactPostcode = faker.address().zipCode();
        String addNewContactStreet = faker.address().streetAddress();
        $(chooseNewContactCountry).click();
        fillField(addNewContactCity, addNewCity);
        fillField(addNewContactPostcode,addNewPostcode);
        fillField(addNewContactStreet, addNewStreet);
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);
    }

    //Удаление адресов
    public void removeContactAddressesData() throws InterruptedException {
        clickOnVisibleElement(addressesFormContactPage);
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(removeContactAddressesButton);
        Thread.sleep(1000);
    }

    //Сортировка адресов
    public void filterContactAddressesData() throws InterruptedException{
        clickOnVisibleElement(addressesFormContactPage);
        clickOnVisibleElement(filterContactCountry);
        clickOnVisibleElement(filterContactStreet);
        clickOnVisibleElement(filterContactPostcode);
        clickOnVisibleElement(filterContactCity);
        clickOnVisibleElement(filterContactCountry);
        clickOnVisibleElement(filterContactStreet);
        clickOnVisibleElement(filterContactPostcode);
        clickOnVisibleElement(filterContactCity);
    }
}
/* boolean emptyDataPhone = $(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();
        boolean notEmptyDataPhone = $(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();
        if (emptyDataPhone == true || notEmptyDataPhone != true) {
            System.out.println("У контакта еще нет телефонов");
        } else if (emptyDataPhone != true && notEmptyDataPhone == true){*/
        /*Assert.assertTrue(isElementPresent(emptyPhoneData));
        System.out.println("У контакта еще нет телефонов");
        Assert.assertTrue(isElementPresent(notEmptyPhoneData));
        clickOnVisibleElement(openDropdownFormEditOrRemoveContactPhoneEmailOrAddress);
        clickOnVisibleElement(editContactPhoneButton);
        Faker faker = new Faker();
        String addPhoneNumber = faker.phoneNumber().subscriberNumber(7);
        fillField(addPhoneNumber, addPhoneNumberForm);
        $(chooseCodeCountryPhoneNumber).click();
        clickOnVisibleElement(saveButton);
        Thread.sleep(1000);*/