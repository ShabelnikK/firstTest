package org.example.Test;

import org.example.Application;
import org.testng.annotations.Test;

public class AuthTest extends Application {

    @Test
    void authTest() throws InterruptedException {
        app.getLogin().login();
        Thread.sleep(1000);
        app.getHeader().logOut();
        Thread.sleep(1000);
    }
}
