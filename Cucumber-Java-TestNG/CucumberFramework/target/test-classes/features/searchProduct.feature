Feature: Search for Various Products on Landing and Offers page

@OffersPage
Scenario Outline: Search Experience for Product Search in Both Home and Offers page

Given user is on GreenKart landing page
When user searched for short name <Name> and extracted actual name of product
Then user searched for <Name> short name in offers page
And validate product name in offers page matches with Landing page

Examples:
|	Name	|
|	Tom		|
|	Beet	|