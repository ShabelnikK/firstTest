package org.example.Test;

import org.example.Application;
import org.junit.jupiter.api.Test;

public class AuthTest extends Application {

    @Test
    void authTest() {
        //Login
        app.getLogin().login();
                        /*.sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[contains(@type, 'password')]"))
                        .sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//button[.=' Login ']"))
                .click();*/
    }
}
