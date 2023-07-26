package org.example.Helpers;

import org.example.Data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Helper extends DataProviders {

    WebDriver driver;

    public Helper(WebDriver driver) { this.driver = driver; }

    public void clickOnVisibleElement(By locator) {
        Assert.assertTrue(isElementPresent(locator));
        driver.findElement(locator).click();
    }
    public void fillField(String userData, By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(userData);
    }
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException exception) {
            exception.printStackTrace();
            return false;
        }
    }
    /*public boolean checkDisplayButton() {
        boolean checkButton;
        Assert.assertTrue(isElementPresent(driver.findElement(By.xpath("//*[@ng-reflect-dismissible=\"false\"]"))));
       *//* boolean emptyDataPhone = driver.findElement(By.xpath("//*[@ng-reflect-dismissible=\"false\"]")).isDisplayed();
        boolean notEmptyDataPhone = driver.findElement(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();*//*
        if () {
            return true;
        } else {
            return false;
        }

    }*/
}
