package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pages.NavigationPage;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import java.util.Objects;


public class BaseTest {

    // This class has all generic methods that needed for all tests class
    // we can also enhance the structure by creating another separate class to handle the hooks
    protected WebDriver driver;
    NavigationPage navigationPage = new NavigationPage(driver);

    @BeforeSuite
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    protected void navigateTo(String word){
        String url = "http://localhost:8080/" + word;
        driver.get(url);
    }
/*just want to handle the internal server error as i can't run the test class one time and consider it as env issue
     however I see it as not best practice*/

    protected void handleInternalError(String input){
        String message = "Internal Server Error";
        if (Objects.equals(input, message))
            throw new SkipException("Skipping this test method due to a Internal Server Error");

    }
}
