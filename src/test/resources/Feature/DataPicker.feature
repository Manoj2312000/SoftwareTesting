Feature: Data selector page

  @DataPicker
  Scenario Outline: Select date from the calender
    Given The user is in the data selector page
    Then The user clicks on the calender icon
    Then The user selects the desired month
    Then The user selects the desired date
