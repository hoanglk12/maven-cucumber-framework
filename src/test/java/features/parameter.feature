@parameter
Feature: Parameter
  
	@noparam
  Scenario: Verify login page have no paramter
    #Given I open facebook web app
    When Input to Username textbox
    And Input to Password textbox
    And Click to Login button
    #And Close application
  
  @param
  Scenario: Verify login page have paramter
    #Given I open facebook web app
    When Input to Username textbox with data "hoanghp95@gmail.com"
    And Input to Password textbox with data "123456"
    And Click to Login button
    #And Close application
  
  @mutiple_param
  Scenario: Verify login page have paramter
    #Given I open facebook web app
    When Input to Username textbox with data "hoanghp95@gmail.com" and Password textbox with data "123456"
   	And Click to Login button
    #And Close application
    
  