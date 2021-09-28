@datatable
Feature: DataTable

  #Background: 
    #Given I open facebook web app #apply for 1 feature only
  @datatable_step
  Scenario Outline: Create new customer with email <Username>
    #Given I open facebook web app
     When Input to Username textbox and Password textbox with data 
      | Username                 | Password | 
      | automationfc01@gmail.com | 123456   | 
      | automationfc02@gmail.com | 123456   | 
      | automationfc03@gmail.com | 123456   | 
      | automationfc04@gmail.com | 123456   | 
      And Click to Login button
      #And Close application
  
    Examples: 
      | Username                 | Password | 
      | automationtest@gmail.com | 123456   | 
  
  @datatable_data_driven @datatable_scenario
  Scenario Outline: Verify login page using data driven
    #Given I open facebook web app
     When Input to Username textbox with data "<Username>" and Password textbox with data "<Password>"
      And Click to Login button
      #And Close application
    Examples: 
      | Username                 | Password | 
      | automationfc01@gmail.com | 123456   | 
      | automationfc02@gmail.com | 123456   | 
      | automationfc03@gmail.com | 123456   | 
