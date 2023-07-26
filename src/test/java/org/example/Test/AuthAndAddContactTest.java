package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class AuthAndAddContactTest extends Application {

    @Test //Тест на авторизацию
    void authTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getHeader().logout();
    }
    //Тест на создание нового контакта и добавление адреса, телефона, email
    @Test(dataProvider = "newContact", dataProviderClass = DataProviders.class)
    void AddNewContactAndNewContactDataTest(String firstName, String lastName, String description) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getHeader().openDialogAddNewContact();
        app.getAddContact().fillFieldAddContact(firstName, lastName, description);
        app.getAddContact().clickSaveNewContactButton();
        app.getContactPage().addContactPhoneData();
        app.getContactPage().addContactEmailData();
        app.getContactPage().addContactAddressesData();
        app.getHeader().logout();
    }

    //Тест на добавление адреса, телефона, email в уже имеющийся контакт
    @Test(dataProvider = "searchContact", dataProviderClass = DataProviders.class)
    void searchAndEditContact(String searchText) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListHelper().fillFieldSearchContactForm(searchText);
        app.getContactListHelper().openContact();
        app.getContactPage().addContactPhoneData();
        app.getContactPage().addContactEmailData();
        app.getContactPage().addContactAddressesData();
        app.getHeader().logout();
    }
}
