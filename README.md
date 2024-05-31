# SwagLabs Automation tests

5 test cases for Log In functionalities
1 test case for Adding items to cart successfully
1 test case for Removing item from the cart successfully
1 test case for successful purchase

Test Scenario ID: TS1
    Test Scenario name: Log In action
        Test case ID: TC1
            Test case name: Successful log in
                Preconditions: /
                    Steps: 1. Open Firefox browser
                           2. Load url https://www.saucedemo.com/   
                           3. In input field for username, enter username
                           4. In input field for password, enter password
                           5. Click on log in button
                           Necessary info:
                           Username: standard_user
                           Password: secret_sauce
                                Expected result: After the click on log in button, user should be redirected to the Products page on which the list of products should be visible on the whole page, devided in rectangular sections in which, seperatly, in its downer right corner Add to Cart button should be visible.