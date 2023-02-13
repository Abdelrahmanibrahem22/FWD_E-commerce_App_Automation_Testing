@smoke
  Feature: F08_Wishlist|User could add product to wishlist
    Scenario: User add product to wishlist
      When User click on wishlist icon under product
      Then Success message is displayed successfully

      Scenario: User add product to wishlist
        When User click on wishlist icon under product
        When User click on wishlist tap at top of page
        Then Size of wishlist should be bigger than 0


