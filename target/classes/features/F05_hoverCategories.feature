@smoke
  Feature: F05_hoverCategories|User could select any categories from 3 main categories
    Scenario: User select random category one of the three main categories
      When User select a category and click on one of its subcategories
      Then User should be navigated to a page that contains that product subcategory
