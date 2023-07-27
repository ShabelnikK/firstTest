package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class RemoveContactTest extends Application {
    //Тест по удалению контакта
    @Test(dataProvider = "removeContactFromList", dataProviderClass = DataProviders.class)
    void removeContact(String searchText) throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListPage().fillFieldSearchContactForm(searchText);
        app.getContactListPage().removeContact();
        app.getHeader().logout();
    }
}
