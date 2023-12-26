package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(css = "div[class='signup-form'] h2")
    WebElement newUserSignUpText;

    @CacheLookup
    @FindBy(css = "input[placeholder='Name']")
    WebElement name;

    @CacheLookup
    @FindBy(css = "input[data-qa='signup-email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Signup'])[1]")
    WebElement signUpButton;



    public void checkTheTextNewUserSignUpAvailableOrNot() {
        log.info("checkTheTextNewUserSignUpAvailableOrNot: " +newUserSignUpText.toString());
        verifyThatTextIsDisplayed(newUserSignUpText, "New User Signup!");
    }

    public void enterNameOnNewUserSignUp(String name) {
        log.info("enterNameOnNewUserSignUp: " +this.name.toString());
        sendTextToElement(this.name, name);
    }

    public void enterEmailAddressOnNewUserSignUp(String email) {
        log.info("enterEmailAddressOnNewUserSignUp: " + emailAddress.toString());
        sendTextToElement(emailAddress, email);
    }

    public void clickOnSignUpButton() {
        log.info("clickOnSignUpButton: " +signUpButton.toString());
        clickOnElement(signUpButton);
    }

}
