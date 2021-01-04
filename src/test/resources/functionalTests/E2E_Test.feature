 Feature: Automated E2E Tests
   Description: The purpose of this feature is to test E2E integration.

   Scenario Outline: Customer purchases an item from search
     Given customer is in the Home Page
     When  customer searches for "dress"
     And chooses to buy the first item
     And clicks proceed to checkout page
     And enter <customer> personal details on checkout page
     And places order

     Examples:
       | customer |
       | Lakshay  |