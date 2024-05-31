package appTests;

import org.junit.Assert;
import org.junit.Test;

public class ProductsPageTests extends BaseTest{

    @Test
    public void productSuccessfullyAddedToCart() {
        logInPage.successfulLogIn();
        productsPage.addingProductsToCart();
        yourCartPage.clickOnShoppingCartButton();
        Assert.assertTrue("Products are not successfully added to cart.", yourCartPage.yourCartPageElementsPresent());
    }
}
