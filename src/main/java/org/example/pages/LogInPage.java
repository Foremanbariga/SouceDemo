package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage extends BasePage {


    private final By USER_NAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By error = By.cssSelector("h3[data-test=error]");

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://www.saucedemo.com/");
    }

    public void login(String user, String password) {
        driver.findElement(USER_NAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public String getError(){
        return driver.findElement(error).getText();
    }
}
