package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {


    private final By TITLE = By.cssSelector(".title");
    private String addCartButton = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button";
    public ProductsPage(WebDriver driver) {
       super(driver);
    }

    public void open() {

        driver.get(BASE_URL + "inventory.html");
    }

    public WebElement getTitle() {

        return driver.findElement(TITLE);
    }

    public void addCart(String productName) {
    By fulllocator = By.xpath(String.format(addCartButton, productName));
    driver.findElement(fulllocator).click();
    }
}
