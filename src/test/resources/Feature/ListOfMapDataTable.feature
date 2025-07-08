@ListMap
Feature: Registration form list

  Scenario: 
    Given User is in registration page for registration
    When User fills the form with required details
      | Firstname | Email                    | Telephone  |
      | Manoj     | svmanoj2312000@gmail.com | 8110085233 |
      | Anto      | anto12@gamil.com         | 8989763256 |
      | Sam       | sam786@gamil.com         | 9880057376 |
    
