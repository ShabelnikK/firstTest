package org.example;

import org.example.Helpers.MainSetUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;


public class Application{

    public static MainSetUp app = new MainSetUp();

    @BeforeTest
    public void appSetUp() throws MalformedURLException {
        app.browseSetUp(true);
    }

    @AfterMethod
    public void stop() {
        app.stop();
    }
}
