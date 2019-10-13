Feature: Automation practice application smoke test automation scripts

Scenario: verify the signin functionality of the application 
Given user should be in automation practice

When user should click signin button in home page
When user enter the email address in the email field in signin page
And user enter the password in password field in signin page
And user click on the sigin button in the signin page


@test
Scenario: Verify search functionality in my account page
Given user should be in my account page
When user should click dresses button in my account page
And user should click summer dress button

@test
Scenario: selecting the dress functionality
When user should click on printed summer dress

@test
Scenario: popup window functionality
Then user should verify the selected dress is displayed
And user select the quantity
And user should select the color
And user should select the size
And click on the add to cart button

@test
Scenario: Add to cart functionality

And user should click on proceed to checkout button

@test
Scenario: verify the summary functionality
Then user should verify the description
And  user should click on proceed to checkout

@test
Scenario: verify address functionality
When user should click on the address checkbox
Then verify billing address and delivery address
And user should click proceed to checkout buttton

@test
Scenario: verify shipping functionality
Then user should agree the terms of condition
And user should click proceed to checkout button

@test
Scenario: verify payment functionality
When user should click on the pay by bankwire
And user should click on confirm my order button


@test
Scenario: verify the signout functionality of the application
When user should click signout button in my account page  