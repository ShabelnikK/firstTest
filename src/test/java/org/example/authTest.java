package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class authTest {

    @Test
   public void authTest() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://phonebook.telran-edu.de:8080");
        driver.findElement(By.xpath("//input[contains(@id, 'defaultRegisterFormEmail')]"))
                        .sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[contains(@type, 'password')]"))
                        .sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//button[.=' Login ']"))
                .click();
        Thread.sleep(5000);
        driver.quit();
    }
}
