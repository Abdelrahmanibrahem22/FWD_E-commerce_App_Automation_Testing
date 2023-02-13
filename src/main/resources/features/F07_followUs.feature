@smoke
Feature: F07_followUs | Users could open followUs links
  Scenario: user opens facebook link
  When User click on facebook icon
  Then This url "https://www.facebook.com/nopCommerce" is opened in new tab
  Scenario: user opens twitter link
  When User click on twitter icon
  Then This url "https://twitter.com/nopCommerce" is opened in new tab
  Scenario: user opens rss link
  When User click on rss icon
  Then This url "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab
  Scenario: user opens youtube link
  When User click on youtube icon
  Then This url "https://www.youtube.com/user/nopCommerce" is opened in new tab