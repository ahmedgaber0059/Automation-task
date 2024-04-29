package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NavigationPage extends BasePage {

    // This class represents the elements of page that has been navigated to
    public NavigationPage(WebDriver driver) {
        super(driver);
    }
    public By inputLocator =By.tagName("body");
}
