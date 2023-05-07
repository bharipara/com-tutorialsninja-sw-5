package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountRegisterPage extends Utility {

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id ="input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    WebElement subscribeRadioButton;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountHasBeenCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinueButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;


    public void enterFirstName(){
        CustomListeners.test.log(Status.PASS,"Enter FirstName " + firstName);
        Reporter.log("Enter FirstName" + firstName.toString());
        sendTextToElement(firstName,"Jenny");
    }
    public void enterLastName(){
        CustomListeners.test.log(Status.PASS,"Enter Lastname " + lastName);
        Reporter.log("Enter LastName" + lastName.toString());
        sendTextToElement(lastName,"Smith");
    }
    public void enterEmail(){
        CustomListeners.test.log(Status.PASS,"Enter Email " + email);
        Reporter.log("Enter Email" + email.toString());
        sendTextToElement(email,"JennyS123@gmail.com");
    }
    public void enterTelephone(){
        CustomListeners.test.log(Status.PASS,"Enter Telephone " + telephone);
        Reporter.log("Enter Telephone" + telephone.toString());
        sendTextToElement(telephone,"07899432156");
    }
    public void enterPassword(){
        CustomListeners.test.log(Status.PASS,"EnterPassword " + password);
        Reporter.log("Enter Password" + password.toString());
        sendTextToElement(password, "Abc@123");
    }
    public void enterConfirmPassword(){
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password" + confirmPassword);
        Reporter.log("Enter Confirm Password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "Abc@123");
    }
    public void selectSubscribeYesRadioButton(){
        CustomListeners.test.log(Status.PASS,"Select subscribe yes radio button" + subscribeRadioButton);
        Reporter.log("Select subscribe yes radio button" + subscribeRadioButton.toString());
        clickOnElement(subscribeRadioButton);
    }
    public void clickPrivacyPolicyCheckbox(){
        CustomListeners.test.log(Status.PASS,"Click on Privacy policy checkout" + privacyPolicyCheckBox);
        Reporter.log("Click on Privacy policy checkout" + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        CustomListeners.test.log(Status.PASS,"Click on continue button" + continueButton);
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
    public String getAccountHasBeenCreatedText(){
        CustomListeners.test.log(Status.PASS,"Get Account has been created text" + accountHasBeenCreatedText);
        Reporter.log("Get Account has been created text" + accountHasBeenCreatedText.toString());
        return getTextFromElement(accountHasBeenCreatedText);
    }
    public void clickOnContinueButtonAgain(){
        CustomListeners.test.log(Status.PASS,"Click on continue button again " + clickContinueButton);
        Reporter.log("Click on continue button again" + clickContinueButton.toString());
        clickOnElement(clickContinueButton);
    }
    public void clickOnMyAccountLink(){
        CustomListeners.test.log(Status.PASS,"Click on my account link" + myAccountLink);
        Reporter.log("Click on my account link" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public String getAccountLogoutText(){
        CustomListeners.test.log(Status.PASS,"Get account logout text " + accountLogoutText);
        Reporter.log("Get account logout text" + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }


}
