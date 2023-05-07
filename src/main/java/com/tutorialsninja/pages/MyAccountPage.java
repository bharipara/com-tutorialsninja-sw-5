package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement MyAccountTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id ='top-links']//li[@class='hidden-xs hidden-sm hidden-md']/ul/li")
    WebElement MyAccountOptions;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement RegisterAccountText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement ReturningCustomerText;
    public void clickOnMyAccountTab(){
        CustomListeners.test.log(Status.PASS,"Click on My Account Tab" + MyAccountTab);
        Reporter.log("Click on My Account Tab" + MyAccountTab.toString());
        clickOnElement(MyAccountTab);
    }
    public String getRegisterAccountText(){
        CustomListeners.test.log(Status.PASS,"Get Register Account Text" + RegisterAccountText);
        Reporter.log("Get Register Account Text" + RegisterAccountText.toString());
        return getTextFromElement(RegisterAccountText);
    }
    public String getReturningCustomerText(){
        CustomListeners.test.log(Status.PASS,"Get Returning customer text" + ReturningCustomerText);
        Reporter.log("Get Returning customer text" + ReturningCustomerText.toString());
        return getTextFromElement(ReturningCustomerText);
    }

    /*
     * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
     * "option" of type string
     * 1.2 This method should click on the options whatever name is passed as parameter.
     * (Hint: Handle List of Element and Select options)
     */
    public void selectMyAccountOptions(String option) {
        try {
            List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']//li"));
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(option)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']//li"));
        }
    }
}
