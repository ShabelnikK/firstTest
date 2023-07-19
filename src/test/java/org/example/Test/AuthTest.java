package org.example.Test;

import org.example.Application;
import org.testng.annotations.Test;

public class AuthTest extends Application {

    @Test
    void authTest() throws InterruptedException {
        app.getLogin().login();
        app.getHeader().logout();
    }
}
