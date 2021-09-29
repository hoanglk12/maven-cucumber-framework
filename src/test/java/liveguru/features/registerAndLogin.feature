@register_and_login
Feature: Register And Login
   Scenario: Open home page
	Then Logo Page is displayed
   

  Scenario Outline: Login With Empty Email Password
		Given Open My Account at footer link
     When Input "<Email Address>" at Email Address textbox
      And Input "<Password>" at Password textbox
      And Click to Login
     Then Error message are displayed with content "<Message>"
    Examples: 
      | Email Address | Password | Message                   | 
      |               |          | This is a required field. |  
      
 
     
  
      
  

