package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    // This class is the base of all pages that included generic function like setup the driver
    // We can enhance the structure further by creating a separate class dedicated to handling the driver setup.
    protected WebDriver driver;
    public BasePage (WebDriver driver) {
        PageFactory.initElements(this.driver, this);
    }

}
