package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountLoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.MyAccountRegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountLoginPageTest extends BaseTest {

    MyAccountPage myAccountPage;
    MyAccountRegisterPage myAccountRegisterPage;
    MyAccountLoginPage myAccountLoginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        myAccountPage = new MyAccountPage();
        myAccountLoginPage = new MyAccountLoginPage();
        myAccountRegisterPage = new MyAccountRegisterPage();

    }

    @Test(groups = {"sanity","regression"})
        public void verifyUserShouldNavigateToLoginPageSuccessfully(){
            //2.1 Clickr on My Account Link.
            myAccountPage.clickOnMyAccountTab();
            // 2.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login"
            myAccountPage.selectMyAccountOptions("Login");
            //2.3 Verify the text “Returning Customer”
            Assert.assertEquals(myAccountPage.getReturningCustomerText(), "Returning Customer", "Returning Customer Text not displayed");
        }

        @Test(groups = {"smoke","regression"})
        public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
            //4.1 Clickr on My Account Link
            myAccountPage.clickOnMyAccountTab();
            //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "login"
            myAccountPage.selectMyAccountOptions("Login");
            //4.3 Enter Email address
            myAccountLoginPage.enterEmailAddress();
            //4.5 Enter Password
            myAccountLoginPage.enterValidPassword();
            //4.6 Click on Login button
            myAccountLoginPage.clickOnLoginButton();
            //4.7 Verify text “My Account”
            Assert.assertEquals(myAccountLoginPage.getMyAccountText(), "My Account", "Error Message");
            //4.8 Clickr on My Account Link.
            myAccountPage.clickOnMyAccountTab();
            //4.9 Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
            myAccountPage.selectMyAccountOptions("Logout");
            // 4.10 Verify the text “Account Logout”
            Assert.assertEquals(myAccountRegisterPage.getAccountLogoutText(), "Account Logout", "Cannot logout");
            //4.11 Click on Continue button
            myAccountRegisterPage.clickOnContinueButtonAgain();
        }
    }
