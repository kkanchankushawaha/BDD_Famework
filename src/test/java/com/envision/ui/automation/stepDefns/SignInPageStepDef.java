package com.envision.ui.automation.stepDefns;

import com.envision.ui.automation.configuration.BrowserFactory;
import com.envision.ui.automation.pages.GmailAboutPage;
import com.envision.ui.automation.pages.GooglePage;
import com.envision.ui.automation.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPageStepDef extends BaseStepDef {

    private WebDriver driver;
    private GooglePage googlePage;
    private GmailAboutPage gmailAboutPage;
    private SignInPage signInPage;


    public SignInPageStepDef(BrowserFactory browserFactoryObject) {
        super(browserFactoryObject);

    }

    @When("User navigate to Google Page")
    public void userNavigateToGooglePage() {
        this.driver = super.browserFactory.getDriverInstance();
        this.driver.get("https://www.google.com/");
        // this.driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Rose");
    }

    @And("User enter Gmail Link in Google Page")
    public void userEnterGmailLink() {
        this.googlePage = PageFactory.initElements(this.driver, GooglePage.class);
        this.googlePage.clickGmailLink();
        // now we don't need these lines because we created page and now we are calling method from GooglePage
        // WebElement gmailElement = this.driver.findElement(By.xpath("//a[text()='Gmail']"));
        // gmailElement.click();
    }

    @And("User clicks Sign in Button to Login")
    public void userClicksSignInButton() {
        this.gmailAboutPage = PageFactory.initElements(this.driver, GmailAboutPage.class);
        this.gmailAboutPage.clickSignIn();
        // now we don't need these lines because we created page and now we are calling method from GooglePage
        // WebElement signInElement = this.driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        // signInElement.click();
    }

    @And("User enter Email {string}")
    public void userEnterEmail(String inputEmail) {
        this.signInPage = PageFactory.initElements(this.driver, SignInPage.class);
        this.signInPage.enterEmail(inputEmail);
        // now we don't need these lines because we created page and now we are calling method from GooglePage
        //  WebElement emailTextBox = this.driver.findElement(By.id("identifierId"));
        // emailTextBox.sendKeys(inputEmail);
    }
/*
    @Then("Click on Next Page")
    public void clickOnNextPage() {
this.signInPage = PageFactory.initElements(this.driver, )

        // now we don't need these lines because we created page and now we are calling method from GooglePage
        //WebElement nextPage = this.driver.findElement(By.xpath("//span[text()='Next']"));
        // nextPage.click();
    } */

}


/*
    @When("User navigate to Google Page")
    public void navigateToGooglePage() {
        this.driver = super.browserFactory.getDriverInstance();
        this.driver.get("https://www.google.com/");
        this.driver.findElement(By.name("q")).sendKeys("Rose");

    }

    @When("User enter Gmail Link in Google Page")
    public void userEnterGmailLink() {
        WebElement gmailElement = this.driver.findElement(By.Text("//a[text()='Gmail']"));
        gmailElement.click();
    }

    @When("User clicks Sign in Button to Login")
    public void userClicksSignInButton() {
        WebElement signInElement = this.driver.findElement(By.linkText("Sign in"));
        signInElement.click();
    }

    @When("User enter Email")
    public void userEnterEmail() {
        WebElement emailTextBox = this.driver.findElement(By.xpath("//span[normalize-space()='Create account']"));
        emailTextBox.sendKeys("Rose@gmail.com");
    }

*/
