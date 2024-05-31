package appTests;

import org.junit.Assert;
import org.junit.Test;

public class LogInPageTests extends BaseTest{
    @Test
    public void validLogInAction() {
        logInPage.successfulLogIn();
        Assert.assertTrue("Log in was not successful.",productsPage.homePageElementsPresent());
    }

    @Test
    public void validUserNameInvalidPassword() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("ggerf");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Error message has not appeared.", logInPage.errorMessageIsPresent());
    }

    @Test
    public void invalidUserNameValidPassword() {
        logInPage.enterUserName("fhdfh");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Error message has not appeared.", logInPage.errorMessageIsPresent());
    }

    @Test
    public void invalidUserNameInvalidPassword() {
        logInPage.enterUserName("jfdhfhoe");
        logInPage.enterPassword("jkfno");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Error message has not appeared.", logInPage.errorMessageIsPresent());
    }

    @Test
    public void credentialsNotEntered() {
        logInPage.enterUserName("");
        logInPage.enterPassword("");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Error message has not appeared.", logInPage.errorMessageIsPresent());
    }

}
