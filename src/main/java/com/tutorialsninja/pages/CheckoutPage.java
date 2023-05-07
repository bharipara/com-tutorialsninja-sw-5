package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName ;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonguest;
  ;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsandCondition;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonpayment;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Warning: Payment method required!']")
    WebElement warningMessageText;

    @CacheLookup
    @FindBy(tagName = "textarea")
    WebElement textArea;


    public void enterFirstname(){
            CustomListeners.test.log(Status.PASS,"Enter FirstName " + firstName);
            Reporter.log("Enter FirstName" + firstName.toString());
            sendTextToElement(firstName,"Jenny");
        }

    public void enterLastName(){
        CustomListeners.test.log(Status.PASS,"Enter LastName " + lastname);
        Reporter.log("Enter LastName" + lastname.toString());
        sendTextToElement(lastname,"Smith");
    }
    public void enterEmail(){
        CustomListeners.test.log(Status.PASS,"Enter Email " + email);
        Reporter.log("Enter Email" + email.toString());
        sendTextToElement(email,"Jane123S@gmail.com");
    }
    public void enterTelephone(){
        CustomListeners.test.log(Status.PASS,"Enter Telephone " + telephone);
        Reporter.log("Enter Telephone" + telephone.toString());
        sendTextToElement(telephone,"07568349672");
    }
    public void enterAddress() {
        CustomListeners.test.log(Status.PASS,"Enter Address " + address);
        Reporter.log("Enter Address" + address.toString());
        sendTextToElement(address, "Hollin Street");
    }
    public void enterCity(){
        CustomListeners.test.log(Status.PASS,"Enter City " + city);
        Reporter.log("Enter City" + city.toString());
        sendTextToElement(city,"London");
    }
    public void enterPostcode(){
        CustomListeners.test.log(Status.PASS,"Enter Postcode " + postcode);
        Reporter.log("Enter Postcode" + postcode.toString());
        sendTextToElement(postcode,"A12 3BC");
    }
    public void enterCountry(){
        CustomListeners.test.log(Status.PASS,"Enter Country " + country);
        Reporter.log("Enter Country" + country.toString());
        sendTextToElement(country,"United Kingdom");
    }
    public void enterState(){
        CustomListeners.test.log(Status.PASS,"Enter State " + state);
        Reporter.log("Enter State" + state.toString());
        sendTextToElement(state,"Surrey");
    }
    public void clickContinueButtonguest(){
        CustomListeners.test.log(Status.PASS,"Click on continue guest button " + continueButtonguest);
        Reporter.log("Click on continue guest button" + continueButtonguest.toString());
        clickOnElement(continueButtonguest);
    }
    public void enterCommentInTextAea(){
        CustomListeners.test.log(Status.PASS,"Enter comment in text area " + textArea);
        Reporter.log("Enter comment in text area" + textArea.toString());
        sendTextToElement(textArea,"Thank You");
    }

    public void checkTermsAndCondtionCheckBox(){
        CustomListeners.test.log(Status.PASS,"Check terms and condition checkbox " + termsandCondition);
        Reporter.log("Check terms and condition checkbox" + termsandCondition.toString());
        clickOnElement(termsandCondition);
    }

    public void clickContinueButtonpayment(){
        CustomListeners.test.log(Status.PASS,"Click on continue payment button " + continueButtonpayment);
        Reporter.log("Click on continue payment button" + continueButtonpayment.toString());
        clickOnElement(continueButtonpayment);
    }

    public String GetWarningMessageText(){
        CustomListeners.test.log(Status.PASS,"Get warning message text " + warningMessageText);
        Reporter.log("Get warning message text" + warningMessageText.toString());
        return getTextFromElement(warningMessageText);
    }
}
