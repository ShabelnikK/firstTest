package org.example.Test;

import org.example.Application;
import org.testng.annotations.Test;

public class FilterContactDataTest extends Application {

    @Test
    void filterContactData() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListPage().openContact();
        app.getContactPage().filterContactPhoneData();
        app.getContactPage().filterContactEmailData();
        app.getContactPage().filterContactAddressesData();
        app.getHeader().logout();
    }
}
