package com.envision.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailAboutPage {

    @FindBy(linkText = "Sign in")
    private WebElement signIn;

    @FindBy(xpath = "(//div[normalize-space()='Create an account']")
    private WebElement createNewAccount;

    public void clickSignIn() {
        this.signIn.click();
    }

    public void clickCreateNewAccount(){
        this.createNewAccount.click();
    }

}
