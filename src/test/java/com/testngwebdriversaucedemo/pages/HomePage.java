package com.testngwebdriversaucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenuButton() {
        Utils.waitToBeClickable(driver, By.id("react-burger-menu-btn"), Duration.ofSeconds(10)).click();
    }

    public void clickAllItemsLink() {
        Utils.waitToBeClickable(driver, By.id("inventory_sidebar_link"), Duration.ofSeconds(10)).click();
    }

    public void clickAboutLink() {
        Utils.waitToBeClickable(driver, By.id("about_sidebar_link"), Duration.ofSeconds(10)).click();
    }

    public void clickLogOutLink() {
        Utils.waitToBeClickable(driver, By.id("logout_sidebar_link"), Duration.ofSeconds(10)).click();
    }

    public void clickResetAppLink() {
        Utils.waitToBeClickable(driver, By.id("reset_sidebar_link"), Duration.ofSeconds(10)).click();
    }

    public void clickItemLink(String item) {
        Utils.waitToBeClickable(driver, By.xpath("//div[.=\"" + item + "\"]"), Duration.ofSeconds(10)).click();
    }

}