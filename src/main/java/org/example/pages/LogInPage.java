package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage {


    WebDriver driver;

    private final By userNameinput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By error = By.cssSelector("h3[data-test=error]");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://www.saucedemo.com/");
    }

    public void login(String user, String password) {
        driver.findElement(userNameinput).sendKeys(user);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).submit();
    }

    public String getError(){
        return driver.findElement(error).getText();
    }
}
