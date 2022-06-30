package org.example;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void productsAddedCart() {
        logInPage.open();
        logInPage.loginAsValidUser();
//        productsPage.open();
        productsPage.addCart("Sauce Labs Backpack");
    }
}
