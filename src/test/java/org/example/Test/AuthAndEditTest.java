package org.example.Test;

import org.example.Application;
import org.testng.annotations.Test;

public class AuthAndEditTest extends Application {

    @Test //Тест на авторизацию
    void authTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getHeader().logout();
    }
    @Test //Тест на добавление адреса, телефона, email
    void editContactTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().openDialogAndChangeLanguage();
        app.getContactListHelper().openContact();
        /*app.getContactPage().editContactInfoData();*/
        app.getContactPage().editContactPhoneData();
        app.getContactPage().editContactEmailData();
        app.getContactPage().editContactAddressesData();
        app.getHeader().logout();
    }
}
