package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String BLOG_COLUMN_CONTAINER = ".mt-30 div.tab-content .col";

    public PhpTravelsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() {
        navigateToCompleteURL(url);
    }

    private List<WebElement> getBlogsElements(RemoteWebDriver driver) {
        return driver.findElements(By.cssSelector(BLOG_COLUMN_CONTAINER));
    }

    public void goToBlogPage(String name) {
        List<WebElement> blogsElements = getBlogsElements();
        for(element : blogsElements) {
            if (element.getText().equals(name)) {
                element.click();
            } else {
                logger.info("Blog element with name %s was not found").format(name);
            }
        }
    }


}
