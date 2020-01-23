package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsBlogPage extends PageBasePhpTravels {

    private String getPageTitle(RemoteWebDriver driver) {
        return driver.getTitle();
    }

    public void validatePageTitle(String title) {
        assertEquals(getPageTitle(),title);
    }

