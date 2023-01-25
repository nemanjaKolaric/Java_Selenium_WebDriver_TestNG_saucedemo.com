package com.testngwebdriversaucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkUrl(String url) {
        return Utils.waitForUrl(driver, url, Duration.ofSeconds(10));
    }

    public void clickAddItem(String item) {
        Utils.waitToBeClickable(driver, By.id("add-to-cart-sauce-labs-" + item + ""), Duration.ofSeconds(10))
                .click();
    }

    public void clickRemoveItem(String item) {
        Utils.waitToBeClickable(driver, By.id("remove-sauce-labs-" + item + ""), Duration.ofSeconds(10))
                .click();
    }

    public boolean itemInShoppingCart() {
        return Utils.isPresent(driver, By.className("shopping_cart_badge"));
    }

    public void clickShoppingCartLink() {
        Utils.waitToBeClickable(driver, By.id("shopping_cart_container"), Duration.ofSeconds(10)).click();
    }

    public boolean isItemOnPage(String item) {
        return Utils.waitForElementVisibility(driver, By.xpath("//div[.=\"" + item + "\"]"), Duration.ofSeconds(3))
                .isDisplayed();
    }

    public boolean errorMessage() {
        return Utils.waitForElementVisibility(driver, By.cssSelector("[data-test='error']"), Duration.ofSeconds(3))
                .isDisplayed();
    }
}