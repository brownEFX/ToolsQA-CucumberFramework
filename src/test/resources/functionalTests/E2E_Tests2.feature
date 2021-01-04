# Feature: Automated E2E Tests2
#   Description: The purpose of this feature is to test E2E integration.
#
#   Scenario: Customer purchases an item from search
#     Given customer is in the Home Page
#     When  customer searches for "Men's Wrinkle Free Long Sleeve."
#     And selects shirt size
#     And adds product to cart
#     And goes to Cart
#     And accepts Terms of Service
#     And selects checkout
#     And selects checkout as guest
#     And enters billing address
#     And continues to shipping address
#     And enters shipping address
#     And continues to shipping method
#     And selects ground
#     And continues to payment method
#     And selects Check/Money Order
#     And continues to payment information
#     And continues to order confirmation
#     And selects confirm to go to checkout page
#     And selects Continue to go to Home Page
