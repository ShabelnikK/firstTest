package org.example;

import org.example.Helpers.MainSetUp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Application {

    static Logger logger = LoggerFactory.getLogger(Application.class);
    public static MainSetUp app = new MainSetUp();

    @BeforeMethod
    public void appSetUp() {
        app.browseSetUp(true);
    }

    @BeforeMethod
    public void startTest(Method m, Object[] p) {
        logger.info("Start test " + m.getName() + " with data: " + Arrays.asList(p));
    }
    @AfterMethod
    public void stop() {
        app.stop();
    }
    @AfterMethod
    public void stopTest(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED" + result.getMethod().getMethodName());
        } else {
            logger.info("FAILED" + result.getMethod().getMethodName());
        }

        logger.info("=========================================================================");
    }
}


