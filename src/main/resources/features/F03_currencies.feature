@smoke
  Feature: F03_currencies | User could change currencies to euro
    Scenario: User could change currencies to euro
      When User select euro from dropdown list
      Then Currencies change successfully
