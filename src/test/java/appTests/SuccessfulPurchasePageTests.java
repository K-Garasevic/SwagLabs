package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class SuccessfulPurchasePageTests extends BaseTest{
    @Test
    public void fillInYourInformation() {
        logInPage.successfulLogIn();
        productsPage.addingProductsToCart();
        yourCartPage.clickOnShoppingCartButton();
        yourCartPage.removeProductFromCart();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,10000)");
        yourCartPage.clickOnCheckoutButton();
        checkoutPage.fillInYourInformation();
        checkoutOverviewPage.clickOnFinishButton();
        Assert.assertTrue("Purchase was not successful.", successfulPurchasePage.successfulPurchaseMessagePresent());
    }
}
