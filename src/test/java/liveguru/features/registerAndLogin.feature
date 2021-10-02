@register_and_login
Feature: Register And Login
   Scenario: Open home page
	Then Logo Page is displayed
	
   Scenario: Get New Page Url
     When I get new login Url
     Then New Home Page Url is "homePageUrl" 
      | homePageUrl                | 
      | http://live.techpanda.org/ | 
  
@login_empty_invalid_data
  Scenario Outline: Login With Empty Invalid Data
    Given Open "My Account" at footer link
     When Input to "email" Textbox with data "<Email Address>"
      And Input to "pass" Texbox with data "<Password>"
      And Click to "button" with text "Login"
     Then Error message at "<idTagInput>" and "<idErrorMsg>" is displayed with content "<Message>"
  
    Examples: 
      | Email Address | Password | Message                                                               | idTagInput | idErrorMsg             | 
      | h@mail.com    |          | This is a required field.                                             | pass       | required-entry-pass    | 
      |               | 123456   | This is a required field.                                             | email      | required-entry-email   | 
      | 123@nn        | 123456   | Please enter a valid email address. For example johndoe@domain.com.   | email      | validate-email-email   | 
      | 123@nn.com    | 12345    | Please enter 6 or more characters without leading or trailing spaces. | pass       | validate-password-pass | 
     
@login_empty_email_and_pass
   Scenario Outline: Login With Empty Email and Empty Password
     When Input to "email" Textbox with data "<Email Address>"
      And Input to "pass" Texbox with data "<Password>"
      And Click to "button" with text "Login"
     Then Error message are displayed with content "<Message>"
    Examples: 
      | Email Address | Password | Message                   | 
      |               |          | This is a required field. | 
 
 @login_empty_email_or_pass
   Scenario Outline: Login With Wrong Email or Wrong Password
     When Input to "email" Textbox with data "<Email Address>"
      And Input to "pass" Texbox with data "<Password>"
      And Click to "button" with text "Login"
     Then Error message below header page is displayed with content "<Message>"
    Examples: 
      | Email Address | Password | Message                    | 
      | hp95@mail.com | 123456   | Invalid login or password. | 
  
     @tag1
   Scenario: Open home page
 	When Open Home Page at My Account
  
      
  

