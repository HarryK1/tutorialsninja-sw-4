package com.tutorialsninja.testsuite;
/**
 * 1. Create the class MyAccountsTest
 * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
 * "option" of type string
 * 1.2 This method should click on the options whatever name is passed as parameter.
 * (Hint: Handle List of Element and Select options)
 *
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
 *
 * 1.1 Clickr on My Account Link.
 * 1.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Register”
 * 1.3 Verify the text “Register Account”.
 *
 * 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
 *
 * 2.1 Clickr on My Account Link.
 * 2.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Login”
 * 2.3 Verify the text “Returning Customer”.
 *
 * 3. Test name verifyThatUserRegisterAccountSuccessfully()
 *
 * 3.1 Clickr on My Account Link.
 * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Register”
 * 3.3 Enter First Name
 * 3.4 Enter Last Name
 * 3.5 Enter Email
 * 3.6 Enter Telephone
 * 3.7 Enter Password
 * 3.8 Enter Password Confirm
 * 3.9 Select Subscribe Yes radio button
 *
 * 3.10 Click on Privacy Policy check box
 * 3.11 Click on Continue button
 * 3.12 Verify the message “Your Account Has Been Created!”
 * 3.13 Click on Continue button
 * 3.14 Clickr on My Account Link.
 * 3.15 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Logout”
 * 3.16 Verify the text “Account Logout”
 * 3.17 Click on Continue button
 *
 * 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
 *
 * 4.1 Clickr on My Account Link.
 * 4.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Login”
 * 4.3 Enter Email address
 * 4.4 Enter Last Name
 * 4.5 Enter Password
 * 4.6 Click on Login button
 * 4.7 Verify text “My Account”
 * 4.8 Clickr on My Account Link.
 * 4.9 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Logout”
 * 4.10 Verify the text “Account Logout”
 * 4.11 Click on Continue button
 */

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {
    MyAccountsPage myAccounts = new MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //1.1 Click on My Account Link.
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”

        String option = "Register";
        myAccounts.selectMyAccountOptions(option);

        //1.3 Verify the text “Register Account”
        String expectedText1 = "Register Account";
        String actualText1 = myAccounts.getRegisterAccountText();
        Assert.assertEquals(actualText1, expectedText1);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        //2.1 Click on My Account Link. 2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        String option = "Login";
        myAccounts.selectMyAccountOptions(option);

        // 2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccounts.getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        //3.1 Click on My Account Link.
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”

        String option = "Register";
        myAccounts.selectMyAccountOptions(option);

        //3.3 Enter First Name
        //3.4 Enter Last Name
        //3.5 Enter Email
        //3.6 Enter Telephone
        //3.7 Enter Password
        //3.8 Enter Password Confirm
        //3.9 Select Subscribe Yes radio button
        myAccounts.enterFirstName("Prime");
        myAccounts.enterLastName("Testing");
        myAccounts.enterEmail("Prime34568910@gmail.com");
        myAccounts.enterPhoneNumber("123456789");
        myAccounts.enterPassword("Prime@123");
        myAccounts.enterConfirmPassword("Prime@123");
        myAccounts.selectSubscribeButton("Yes");

        //3.10 Click on Privacy Policy check box
        myAccounts.clickOnAgree();

        //3.11 Click on Continue button
        myAccounts.clickOnContinue();

        //3.12 Verify the message “Your Account Has Been Created!”
        String expectedText2 = "Your Account Has Been Created!";
        String actualText2 = myAccounts.getAccountCreatedText();
        Assert.assertEquals(actualText2, expectedText2);

        //3.13 Click on Continue button
        myAccounts.clickOnContinue2();

        //3.14 Click on My Account Link.3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        option = "Logout";
        myAccounts.selectMyAccountOptions(option);

        //3.16 Verify the text “Account Logout”
        String expectedText3 = "Account Logout";
        String actualText3 = myAccounts.getAccountLogoutText();
        Assert.assertEquals(actualText3, expectedText3);
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

        //4.1 Click on My Account Link. 4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        String option = "Login";
        myAccounts.selectMyAccountOptions(option);

        //4.3 Enter Email address
        myAccounts.enterEmailId("Prime1234568@gmail.com");

        // 4.5 Enter password
        myAccounts.enterPassword("Prime@123");

        //4.6 Click on Login button
        myAccounts.clickOnLogin();

        //4.7 Verify text “My Account”
        String expectedText = "My Account";
        String actualText = myAccounts.getMyAccountText();
        Assert.assertEquals(actualText,expectedText);

        //4.8 Click on My Account Link. 4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout
        option = "Logout";
        myAccounts.selectMyAccountOptions(option);

        // 4.10 Verify the text “Account Logout
        String expectedText1 = "Account Logout";
        String actualText1 = myAccounts.getAccountLogoutText();
        Assert.assertEquals(actualText1,expectedText1);

        //4.11 Click on Continue button
        myAccounts.clickOnContinue();
    }
}