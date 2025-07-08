@DataTable
Feature: Registration form

  Scenario: 
    Given User is in registration page
    When User enters the required details
      | Firstname | Email                    | Telephone  |
      | Manoj     | svmanoj2312000@gmail.com | 8110085233 |
      | Anto      | anto12@gamil.com         | 8989763256 |
      | Sam       | sam786@gamil.com         | 9880057376 |
    Then User uploads a file
    Then User selects the gender
    Then User selects the experinece
    Then Following user data has been registered
    Then Get the window handle

  @AgeDropdown
  Scenario: Select and verify gender from dropdown
    Given User is in registration page
    When user selects gender as "Female"
    Then selected gender should be "Female"
    Then the gender dropdown should not allow multiple selections
    Then try invalid select
