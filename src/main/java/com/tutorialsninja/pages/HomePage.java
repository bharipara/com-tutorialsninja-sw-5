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

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverDesktop;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement mouseHoverLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText ="Components")
    WebElement mouseHoverComponents;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopNotebookText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;

    public void mouseHoverAndClickDesktops() {
        CustomListeners.test.log(Status.PASS,"Click on Desktops " + mouseHoverDesktop);
        Reporter.log("Click on Desktops" + mouseHoverDesktop.toString());
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }
    public void mouseHoverAndClickLaptopsAndNotebooks(){
        CustomListeners.test.log(Status.PASS,"Click on Laptops and Notebooks" + mouseHoverLaptopsAndNotebooks);
        Reporter.log("Click on Laptops and Notebooks" + mouseHoverLaptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(mouseHoverLaptopsAndNotebooks);
    }
    public void mouseHoverAndClickComponents(){
        CustomListeners.test.log(Status.PASS,"Click on Components " + mouseHoverComponents);
        Reporter.log("Click on Components" + mouseHoverComponents.toString());
        mouseHoverToElementAndClick(mouseHoverComponents);
    }
    public void selectMenu(String menu) {
        try {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }

    }
    public String getDesktopText(){
        CustomListeners.test.log(Status.PASS,"Get Desktop text " + desktopText);
        Reporter.log("Get Desktop text" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public String getLaptopsNotebooksText(){
        CustomListeners.test.log(Status.PASS,"Get Laptops and Notebooks text " + laptopNotebookText);
        Reporter.log("Get Laptops and Notebooks text" + laptopNotebookText.toString());
        return getTextFromElement(laptopNotebookText);
    }
    public String getComponents(){
        CustomListeners.test.log(Status.PASS,"Get Components" + componentsText);
        Reporter.log("Get Components" + componentsText.toString());
        return getTextFromElement(componentsText);
    }

}
