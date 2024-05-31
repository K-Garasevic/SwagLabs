package appTests;

import org.junit.Assert;
import org.junit.Test;

public class YourCartPageTests extends BaseTest{

    @Test
    public void productSuccessfullyRemovedFromCart() {
        logInPage.successfulLogIn();
        productsPage.addingProductsToCart();
        yourCartPage.clickOnShoppingCartButton();
        yourCartPage.removeProductFromCart();
        Assert.assertTrue("Product has not been removed from cart.", yourCartPage.productRemovedFromCart());
    }
}
