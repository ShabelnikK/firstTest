package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class EditAndRemoveContactDataTest extends Application {

    //Тест на поиск и редактирование контакта
    @Test(priority = 1, dataProvider = "searchContact", dataProviderClass = DataProviders.class)
    void searchAndEditContact(String searchText) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListPage().fillFieldSearchContactForm(searchText);
        app.getContactListPage().openContact();
        app.getContactPage().editContactInfoData();
        app.getContactPage().editContactPhoneData();
        app.getContactPage().editContactEmailData();
        app.getContactPage().editContactAddressesData();
        app.getHeader().logout();
    }

    @Test(priority = 2, dataProvider = "removeContactData", dataProviderClass = DataProviders.class)
    void searchAndRemoveContact(String searchText) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListPage().fillFieldSearchContactForm(searchText);
        app.getContactListPage().openContact();
        app.getContactPage().removeContactPhoneData();
        app.getContactPage().removeContactEmailData();
        app.getContactPage().removeContactAddressesData();
        app.getHeader().logout();
    }
}
