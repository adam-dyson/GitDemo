Feature: Search and Place the Order for Products

@PlaceOrder
Scenario Outline: Search Experience for Product Search in Both Home and Offers page

Given user is on GreenKart landing page
When user searched for short name <Name> and extracted actual name of product
And added "2" items of the selected product to cart
Then user proceeds to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
|	Name	|
|	Tom		|