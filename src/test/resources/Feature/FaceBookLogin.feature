Feature: Facebook Login

  @Userlogin
  Scenario Outline: Login Facebook with email and password
    Given User is on login page
    When User enters valid email address  <Email>
    And User enters valid password <Password>
    Then User clicks signup button
    Then user enter first name <Firstname>
    Then user enters surname <Surname>
    Then user enters mobile number <MobileNumber>
    Then user enters password <NewPassWord>
    Then user clicks and selects day in dropdown
    Then user clicks and selects month in dropdown
    Then user clicks and selects year in dropdown
    Then User click on gender radio button
    Then user clicks Submit button

    Examples: 
      | Email                    | Password | Firstname | Surname | MobileNumber | NewPassWord |
      | svmanoj2312000@gmail.com | kujgygg  | Manoj     | S       |   8110085233 | chcjchg     |
