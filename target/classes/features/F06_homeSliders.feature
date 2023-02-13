@smoke
  Feature: F06_homeSlider|User could click on Sliders
    Scenario: User could click on first slider and navigate to page of product
      When User click on first slider
      Then User should be navigated to first slider page

      Scenario: User could click on second slider and navigate to page of product
        When User click on second slider
        Then User should be navigated to second slider page

