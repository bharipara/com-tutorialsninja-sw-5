package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountLoginPage extends Utility {

    @CacheLookup
    @FindBy(id= "input-email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText;



    public void enterEmailAddress(){
        CustomListeners.test.log(Status.PASS,"Enter Email address" + emailAddress);
        Reporter.log("Enter Email address" + emailAddress.toString());
        sendTextToElement(emailAddress,"JennyS123@gmail.com");

    }
    public void enterValidPassword(){
        CustomListeners.test.log(Status.PASS,"Enter Valid Password" + enterPassword);
        Reporter.log("Enter Valid Password" + enterPassword.toString());
        sendTextToElement(enterPassword,"Abc@123");
    }
    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS,"Click on Login Button" + loginButton);
        Reporter.log("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){
        CustomListeners.test.log(Status.PASS,"Get my account text" + myAccountText);
        Reporter.log("Get my account text" + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }
}
