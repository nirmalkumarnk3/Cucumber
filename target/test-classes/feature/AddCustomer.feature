
#Sample Feature Definition Template

Feature: Add Customer Feature

 
  Scenario: Add Correct Customer Details
  Given The user is in Add Customer Page
  When The user types the Registration details in the form
  And Clicks Submit Button
  Then Check the presence of CustomerID
  And Check the Success Message 
   
 
