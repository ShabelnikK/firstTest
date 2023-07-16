package org.example;

import org.example.Helpers.MainSetUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Application {

    public static MainSetUp app = new MainSetUp();

    @BeforeTest
    public void appSetUp() {
        app.browseSetUp(true);
    }

    @AfterMethod
    public void stop() {
        app.stop();
    }
}


