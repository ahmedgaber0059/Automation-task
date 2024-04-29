package org.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void enterInputWithVowels(){
        navigateTo("money");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "mny");
    }

    @Test
    public void enterInputWithoutVowels(){
        navigateTo("flyby");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "flyby");
    }
    @Test
    public void enterInputWithAllVowels(){
        navigateTo("aeiou");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "");
    }

    @Test
    public void enterEmptyInput(){
        navigateTo("");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);


        Assert.assertEquals(input , "Send GET to /:input");
    }

    //This is failed TC
    @Test
    public void enterInputWithCapitalVowels(){
        navigateTo("Ahmed");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "hmed");
    }

    @Test
    public void enterIntegers(){
        navigateTo("123");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "123");
    }

    @Test
    public void enterInputWithSpaces(){
        navigateTo("my name is ahmed");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);


        Assert.assertEquals(input , "my nm s hmd");
    }

    @Test
    public void enterInputWithSpecialCharacters(){
        navigateTo("H@llo Word!!");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "H@ll Wrd!!");
    }
    @Test
    public void trySqlInjection(){
        navigateTo("or \\\"\\\"=\\\"");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);


        Assert.assertEquals(input , "Not Found");
    }

    @Test
    public void enterInputWithAnotherLanguage(){
        navigateTo("أحمد");
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "أحمد");
    }
}
