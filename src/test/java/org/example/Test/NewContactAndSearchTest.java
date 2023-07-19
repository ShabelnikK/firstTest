package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class NewContactAndSearchTest extends Application {

    @Test(dataProvider = "newContact", dataProviderClass = DataProviders.class)
    void addNewContacts(String firstName,String lastName,String description) throws InterruptedException {
        //Добавление троих новых контактов
        app.getLogin().login();
        app.getHeader().openDialogAddNewContact();
        app.getNewContact().fillFieldAddContact(firstName, lastName, description);
        app.getNewContact().clickSaveNewContactButton();
        app.getHeader().logOut();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "searchText", dataProviderClass = DataProviders.class)
    void searchContact(String searchText) throws InterruptedException {
        //Поиск созданных контактов и смена языка
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        Thread.sleep(2000);
        app.getContactListHelper().fillFieldSearchContactForm(searchText);
        Thread.sleep(3000);
    }
}
