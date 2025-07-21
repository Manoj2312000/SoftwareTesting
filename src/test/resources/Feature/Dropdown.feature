@Dropdown
Feature: Automate dropdown

  Background: 
    Given User is in dropdown page

  Scenario: Verify the dropdown is visible
    Then User selects an option from dropdown

  Scenario: List all the options in dropdown
    Then User lists the drop

  Scenario: Checks for multiselect in dropdown
    Then the dropdown should not allow multiselect

  Scenario: Verify the selected and available select
    When the user selects "Set to 25%"
    Then the value should also be "Set to 25%"

  Scenario: Try selecting an invalid option
    When I try to select invalid option

  Scenario: 
    When the user selects option with value "25%" from dropdown
    Then the selected option should be of value "Set to 25%"

  Scenario: Verify all expected dropdown are there in the list
    Then the percentage dropdown should contain options:
    |Set to 25%|
    |Set to 50%|
    |Set to 75%|
    |Set to 100%|
    
   Scenario: Verify the dropdown is disabled in restricted page
   Then the dropdown should be enabled
   
   Scenario: Check the font size of the dropdown text
   Then the dropdown shoud have the font size "14px" 
   
    
