Feature: Facebook login page
  
  @displayed
  Scenario: Verify login page
    Given I open facebook web app
    Then Verify Email textbox is displayed
    And Verify Password textbox is displayed
    And Close application
 
