package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class EditAndRemoveContactDataTest extends Application {

    //Тест на поиск и редактирование контакта
    @Test(dataProvider = "searchContact", dataProviderClass = DataProviders.class)
    void searchAndEditContact(String searchText) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListHelper().fillFieldSearchContactForm(searchText);
        app.getContactListHelper().openContact();
        /*app.getContactPage().editContactInfoData();*/
        app.getContactPage().editContactPhoneData();
        app.getHeader().logout();
    }
}
