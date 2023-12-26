package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(css = "header[id='header'] li:nth-child(1) a:nth-child(1)")
    WebElement home;
    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signUpOrLogin;
    public void verifyHomeButtonAvailability() {
        log.info("verifyHomeButtonAvailability: " +home.toString());
        verifyThatElementIsDisplayed(home);
    }
    public void clickOnSignOrLogin() {
        log.info("clickOnSignOrLogin: " +signUpOrLogin.toString());
        clickOnElement(signUpOrLogin);
    }
}
