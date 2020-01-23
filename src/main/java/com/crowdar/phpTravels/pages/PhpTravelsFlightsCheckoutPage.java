package com.crowdar.phpTravels.pages;

import com.crowdar.examples.pages.PageBasePhpTravels;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsFlightsCheckoutPage extends PageBasePhpTravels {

    public PhpTravelsFlightsCheckoutPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://www.phptravels.net/thflights/checkout";
    }

    private String getPageTitle(RemoteWebDriver driver) {
        return driver.getTitle();
    }

    public void fillInputByName(String input, String text) {
        switch (input) {
            case "Name":
                driver.findElement(By.id("name").sendKeys(text);
                break;
            case "Surname":
                driver.findElement(By.id("surname").sendKeys(text);
                break;
            case "Email":
                driver.findElement(By.id("email").sendKeys(text);
                break;
            case "Phone":
                driver.findElement(By.id("phone").sendKeys(text);
                break;
            case "Birthday":
                driver.findElement(By.id("birthday").sendKeys(text);
                break;
            case "Passport No.":
                driver.findElement(By.id("cardno").sendKeys(text);
                break;
            case "Expiration Date":
                driver.findElement(By.id("expiration").sendKeys(text);
                break;
        }
    }

    public void selectOptionValueOnDropdown(String dropdown_selector, String option) {
        Select dropdown = new Select(driver.findElement(By.id(dropdown_selector)));
        dropdown.selectByVisibleText(option);
    }
}
