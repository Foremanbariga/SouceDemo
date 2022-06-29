package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogInTest extends BaseTest {

    @Test
    public void userLoginValidCredential() {
        logInPage.open();
        logInPage.login("standard_user", "secret_sauce");
        assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed(), "Юзер не прошёл!");
    }

    @Test
    public void passwordNeeded() {
        logInPage.open();
        logInPage.login("standard_user", "");
        assertEquals(logInPage.getError(), "Epic sadface: Password is required", "Ошибка есть");

    }
}
