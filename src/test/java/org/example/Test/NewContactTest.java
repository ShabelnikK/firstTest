package org.example.Test;

import org.example.Application;
import org.example.Data.DataProviders;
import org.testng.annotations.Test;

public class NewContactTest extends Application {

    @Test(dataProvider = "newContact", dataProviderClass = DataProviders.class)
    void editOldContacts(String firstName,String lastName,String description) throws InterruptedException {
        //Необходимо настроит тест чтобы проходили все три контакта новых
        app.getLogin().login();
        app.getNewContact().openDialogAddNewContact();
        app.getNewContact().fillFieldAddContact(firstName, lastName, description);
        app.getNewContact().clickSaveNewContactButton();
        Thread.sleep(3000);
    }
}
