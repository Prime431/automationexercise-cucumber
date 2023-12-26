package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;

public class RegisterUserSteps {
    @Given("I launch the browser")
    public void iLaunchTheBrowser() {
    }

    @And("I open the URL")
    public void iOpenTheURL() {
    }

    @And("I verify that home page visible successfully")
    public void iVerifyThatHomePageVisibleSuccessfully() {
        new HomePage().verifyHomeButtonAvailability();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String login) {
        new HomePage().clickOnSignOrLogin();
    }

    @And("I verify {string} is visible")
    public void iVerifyIsVisible(String newUserSignUpText) {
        new LoginPage().checkTheTextNewUserSignUpAvailableOrNot();
    }

    @And("I Enter name and email address")
    public void iEnterNameAndEmailAddress() {
        new LoginPage().enterNameOnNewUserSignUp("Vivek");
        new LoginPage().enterEmailAddressOnNewUserSignUp("pte76676l@gmail.com");
    }
    @And("I Fill details: Title, Name, Email, Password, Date of birth")
    public void iFillDetailsTitleNameEmailPasswordDateOfBirth() {
        new AccountInformationPage().selectingMrTitle();
        new AccountInformationPage().enterPassword("Password123@");
        new AccountInformationPage().selectDay("1");
        new AccountInformationPage().selectMonth("January");
        new AccountInformationPage().selectYear("1987");
    }
    @And("I  Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void iFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        new AccountInformationPage().enterFirstName("Manish");
        new AccountInformationPage().enterLastName("Patel");
        new AccountInformationPage().enterCompanyName("Heera");
        new AccountInformationPage().enterAddressFirstLine("Turton Road");
        new AccountInformationPage().selectCountry("India");
        new AccountInformationPage().enterState("Gujarat");
        new AccountInformationPage().enterCity("Navsari");
        new AccountInformationPage().enterZipCode("823 343");
        new AccountInformationPage().enterMobileNumber("8728728732");
    }
    @And("I Verify that ACCOUNT CREATED! is visible")
    public void iVerifyThatACCOUNTCREATEDIsVisible() {
        new AccountCreatedPage().verifyAccountCreatedTextIsVisble();
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new AccountCreatedPage().clickOnContinue();
    }

    @And("I Verify that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        new LoggedInPage().verifyLoggedInAsUserIsVisible();
    }

    @Then("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new LoggedInPage().clickONDeleteAccount();
    }

    @And("I Click Signup button")
    public void iClickSignupButton() {
        new LoginPage().clickOnSignUpButton();
    }
    @And("I Verify that ENTER ACCOUNT INFORMATION is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        new AccountInformationPage().verifyEnterAccountInformationText("ENTER ACCOUNT INFORMATION");
    }

    @And("I Select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new AccountInformationPage().clickOnSignUpForOurNewsletter();
    }

    @And("I Select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new AccountInformationPage().selectReceiveSpecialOffers();
    }

    @And("I  Click Create Account button")
    public void iClickCreateAccountButton() {
        new AccountInformationPage().clickOnCreateAccount();
    }

    @And("I Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void iVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        new LoggedInPage().verifyDeleteAccountButtonIsVisible();
        new LoggedInPage().clickOnContinueDeleteButton();
    }
}
