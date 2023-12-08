package com.envision.ui.automation.stepDefns;

import com.envision.ui.automation.configuration.BrowserFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountStepDef extends BaseStepDef {


    private WebDriver driver;

    public CreateNewAccountStepDef(BrowserFactory browserFactoryObject) {
        super(browserFactoryObject);
    }

    @When("User enter Gmail Link")
    public void user_enter_gmail_link() {
        this.driver = super.browserFactory.getDriverInstance();
        WebElement gmailElement = this.driver.findElement(By.linkText("Gmail"));
        gmailElement.click();
    }

    @When("User click Create New Account")
    public void user_click_create_new_account() {
        WebElement createNewAccount = this.driver.findElement(By.xpath("//div[normalize-space()='Create an account']"));
        createNewAccount.click();
    }

}
