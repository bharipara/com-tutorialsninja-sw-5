package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClick;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTabClick;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundSterlingClick;

    //2.10 Click on link “shopping cart” display into success message
    public void shoppingCartClick() {
        CustomListeners.test.log(Status.PASS,"Click on shopping cart" + shoppingCartClick);
        Reporter.log("Click on shopping cart" + shoppingCartClick.toString());
        clickOnElement(shoppingCartClick);
    }

    //currency tab click
    public void clickOnCurrencyTab() {
        CustomListeners.test.log(Status.PASS,"Click on currency tab" + currencyTabClick);
        Reporter.log("Click on currency tab" + currencyTabClick.toString());
        clickOnElement(currencyTabClick);
    }

    public void clickOnPoundSterling() {
        CustomListeners.test.log(Status.PASS,"Click on pound sterling" + poundSterlingClick);
        Reporter.log("Click on pound sterling" + poundSterlingClick.toString());
        clickOnElement(poundSterlingClick);
    }


}
