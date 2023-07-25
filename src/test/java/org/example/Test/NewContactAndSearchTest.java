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
        app.getAddContact().fillFieldAddContact(firstName, lastName, description);
        app.getAddContact().clickSaveNewContactButton();
        app.getHeader().openDialogAndChangeLanguage();
        app.getHeader().logout();
    }

    @Test(dataProvider = "searchContact", dataProviderClass = DataProviders.class)
    void searchAndOpenContact(String searchText) throws InterruptedException {
        //Поиск контактов и смена языка
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListHelper().fillFieldSearchContactForm(searchText);
        app.getContactListHelper().openContact();
        app.getHeader().logout();
    }
}
