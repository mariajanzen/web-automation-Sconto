Feature: Sconto Wishlist Feature
  In order to check the wishlist Feature
  I add a matraze to wish list and log in

  Scenario: Successful adding matraze to wishlist
    Given I am on the MatrazenPage
    When I click on HeartIcon
    Then I see the login proposal

    When I click on Anmelden Button
    Then I see Login page

    When I insert valid user credentials
    And I click on Login button
    Then I should see Homepage


