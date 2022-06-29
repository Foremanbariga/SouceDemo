package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    LogInPage logInPage;

    @BeforeMethod
    public void setUp() {
        //Создание и инициализация веб драйвера
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Настройка драйвера
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Создание страниц
        logInPage = new LogInPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

}
