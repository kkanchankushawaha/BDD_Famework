package com.envision.ui.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(id = "identifierId")
    private WebElement emailTextBox;

    @FindBy (xpath ="//span[text()='Next']")
    private WebElement nextButton;

    public void enterEmail (String inputEmail) {
        this.emailTextBox.sendKeys(inputEmail);
    }

    //public void clickNextButton (){
      //  this.nextButton.click();
   // }
}
