package org.example.Helpers;


import org.example.Data.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class Helper extends DataProviders {


    public void clickOnVisibleElement(By locator) {
        Assert.assertTrue(isElementPresent(locator));
        $(locator).click();
    }
    public void fillField(String userData, By locator) {
        $(locator).click();
        $(locator).clear();
        $(locator).sendKeys(userData);
    }
    public boolean isElementPresent(By by) {
        try {
            $(by);
            return true;
        } catch (NoSuchElementException exception) {
            exception.printStackTrace();
            return false;
        }
    }
    /*public boolean checkDisplayButton() {
        boolean checkButton;
        Assert.assertTrue(isElementPresent($(By.xpath("//*[@ng-reflect-dismissible=\"false\"]"))));
       *//* boolean emptyDataPhone = $(By.xpath("//*[@ng-reflect-dismissible=\"false\"]")).isDisplayed();
        boolean notEmptyDataPhone = $(By.xpath("//*[@ng-reflect-phones-to-display]")).isDisplayed();*//*
        if () {
            return true;
        } else {
            return false;
        }

    }*/
}
