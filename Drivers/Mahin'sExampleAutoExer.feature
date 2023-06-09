Feature: User is able to login and complete the purchase process! 

Scenario: User is able visit the website, login, view & purchase products

Given User is able to open browser and navigate to the website "https://automationexercise.com/"
Then User should be able to see the home page
When User able to click on Signup/Login 
Then User should be able to see 'Login to your account' text appearing in the Login page 
When User should be able to enter username and password
And  User should be able to Click 'Login'
Then User should be able to see 'Logged in as <Users name>'  in Home page
When User should be able to Click on 'Products' module 
Then User should be able to Verify 'ALL PRODUCTS' text on landing page
When User should be able to check product price displayed with the product photograph and info
And  User should be able to Click 'Add to cart' on item name 'Frozen Tops For Kids' 
Then User should see the messege 'Your product has been added to cart.' on a popup window and click on 'View Cart'
Then User should be able to view 'Shopping cart'
And  User should be able to verify the selected product, Quantity and it's price 
When User should be able to click 'Procced to Checkout' 
Then user should be able to Verify 'Checkout' page and user should be able to verify their billing and shipping Addresses
When User should be able to input comments regarding the order 
When user should be able to click on 'Place Order'
Then User should be able to verify 'Payment' page
And  User should be able to input Name on Card,Card Number,CVC and Expiration 
When User should be able to click on 'Pay and Confirm'
Then User should be able to see the message 'Congratulations! Your order has been confirmed!' 
When User should be able to click on 'Download Invoice'
Then User should be able to verify downloaded invoice 
When User should be able to click 'Logout' 
Then user should be able to verify the Login page 