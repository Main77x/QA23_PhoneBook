package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {
            click(By.xpath("//button[.='Sign Out']"));
        }
        //click Login link
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Test
    public void existedUserRegistrationNegativeTest() {

        //enter email field
        // [placeholder='Email']
        type(By.cssSelector("[placeholder='Email']"), "ira@gmail.com");


        //enter password field
        // [placeholder='Password']
        type(By.cssSelector("[placeholder='Password']"), "Ira12345$");


        //click on Registration

        //by.name - registration
        click(By.name("registration"));

        //assert user logged in ( check Sign Out button displayed)
        Assert.assertTrue(isAlertPresent());
    }

}
