@smoke
Feature: F04 | User can search about product
  Scenario Outline: User search by product name
    When User search by product name "<name>" in search field
    And User click on search button
    Then Results appear with products related to the product name "<name>"
    Examples:
      | name   |
      | book   |
      | laptop |
      | nike   |

  Scenario Outline:User search by product sku
    When User search by product sku "<sku>" in search field
    And User click on search button
    Then Results appear with products related to the product sku "<sku>"
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |