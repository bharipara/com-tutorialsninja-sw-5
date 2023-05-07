package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlistners.CustomListeners;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement clickOnShowAllLaptopsandNoteBooks;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPrice;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macbookClick;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macbookText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
     WebElement successText ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macbooknameText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement clearQty;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updatetab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement modifiedSuccessText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueLink;

    //1.2 Click on “Show AllLaptops & Notebooks”
    public void clickOnShowAllLaptopAndNoteBooks() {
        CustomListeners.test.log(Status.PASS,"Click on show all laptop and notebooks " + clickOnShowAllLaptopsandNoteBooks);
        Reporter.log("Click on show all laptop and notebooks" + clickOnShowAllLaptopsandNoteBooks.toString());
        clickOnElement(clickOnShowAllLaptopsandNoteBooks);
    }

    // Get all the products price and stored into array list
    public void originalProductPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }

    //1.3 Select Sort By "Price (High > Low)"

    public void sortByPriceHightoLow() {
        CustomListeners.test.log(Status.PASS,"Sort by price High to Low" + sortByPrice);
        Reporter.log("Sort by price High to Low" + sortByPrice.toString());
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    // After filter Price (High > Low) Get all the products price and stored into array list
    public void afterSortByPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
    }
    public void clickOnMacbook() {
        CustomListeners.test.log(Status.PASS,"Click on Macbook" + macbookClick);
        Reporter.log("Click on Macbook" + macbookClick.toString());
        clickOnElement(macbookClick);
    }
    public String getMacbooktext() {
        CustomListeners.test.log(Status.PASS,"Get Macbook text " + macbookText);
        Reporter.log("Get Macbook text" + macbookText.toString());
        return getTextFromElement(macbookText);
    }
    public void addToCart() {
        CustomListeners.test.log(Status.PASS,"Add to cart" + cartButton);
        Reporter.log("Add to cart" + cartButton.toString());
        clickOnElement(cartButton);
    }
    public String getSuccesstext() {
        CustomListeners.test.log(Status.PASS,"Get success text " + successText);
        Reporter.log("Get success text" + successText.toString());
        return getTextFromElement(successText);
    }
    public void clickShoppingCart(){
        CustomListeners.test.log(Status.PASS,"Click on shopping cart " + shoppingCartLink);
        Reporter.log("Click on shopping cart" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText() {
        CustomListeners.test.log(Status.PASS,"Get shopping cart text " + shoppingCartText);
        Reporter.log("Get shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public String getMacbookNameText() {
        CustomListeners.test.log(Status.PASS,"Get Macbook name text" + macbooknameText);
        Reporter.log("Get Macbook name text" + macbooknameText.toString());
        return getTextFromElement(macbooknameText);
    }
    public void clearQty(){
        CustomListeners.test.log(Status.PASS,"Clear Qty" + clearQty);
        Reporter.log("Clear Qty" + clearQty.toString());
        driver.findElement((By)clearQty).clear();
    }
    public void changeQty(){
        CustomListeners.test.log(Status.PASS,"Change Qty" + changeQty);
        Reporter.log("Change Qty" + changeQty.toString());
        sendTextToElement(changeQty,"2");
    }
    public void clickUpdateTab(){
        CustomListeners.test.log(Status.PASS,"Click on Update Tab" + updatetab);
        Reporter.log("Click on Update Tab" + updatetab.toString());
        clickOnElement(updatetab);
    }
    public String getModifiedSuccessText(){
        CustomListeners.test.log(Status.PASS,"Get Modified success text" + modifiedSuccessText);
        Reporter.log("Get Modified success text" + modifiedSuccessText.toString());
        return getTextFromElement(modifiedSuccessText);
    }
    public String getTotaltext(){
        CustomListeners.test.log(Status.PASS,"Get Total text" + totalText);
        Reporter.log("Get Total text" + totalText.toString());
        return getTextFromElement(totalText);
    }
    public void clickCheckout(){
        CustomListeners.test.log(Status.PASS,"Click on checkout " + checkoutLink);
        Reporter.log("Click on checkout" + checkoutLink.toString());
        clickOnElement(checkoutLink);
    }
    public String getCheckoutText(){
        CustomListeners.test.log(Status.PASS,"Get checkout text" + checkoutText);
        Reporter.log("Get checkout text" + checkoutText.toString());
        return getTextFromElement(checkoutText);
    }
    public String getNewCustomerText(){
        CustomListeners.test.log(Status.PASS,"Get New customer text" + newCustomerText);
        Reporter.log("Get new customer text" + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutButton(){
        CustomListeners.test.log(Status.PASS,"Click on Guest checkout button" + guestCheckoutButton);
        Reporter.log("Click on Guest checkout button" + guestCheckoutButton.toString());
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueButton(){
        CustomListeners.test.log(Status.PASS,"Click on continue button" + continueLink);
        Reporter.log("Click on continue button" + continueLink.toString());
        clickOnElement(continueLink);
    }
}
