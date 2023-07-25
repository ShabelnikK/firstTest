package org.example.Test;

import org.example.Application;
import org.testng.annotations.Test;

public class AuthAndEditTest extends Application {

    @Test
    void authTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getHeader().logout();
    }
    @Test
    void editContactTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListHelper().openContact();
        app.getContactPage().editContactData();
        app.getHeader().logout();
    }
}
