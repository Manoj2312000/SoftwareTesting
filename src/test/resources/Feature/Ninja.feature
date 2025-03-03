Feature: Tutorial Ninja signup

  @Tutorial
  Scenario Outline: Create account in tutorial
    Given User is in home page
    When User clicks on My Account
    Then User clicks on Register
    Then User enters First Name <FirstName>
    Then User enters Last Name <LastName>
    Then User enters email <Email>
    Then User enters phone number <PhoneNumber>
    Then User enters password <Password>
    Then User re enters password <CnfPassword>
    Then User clicks on radio button
    Then User clicks the checkbox
    Then User clicks on submit

    Examples: 
      | FirstName | LastName   | Email                 | PhoneNumber | Password  | CnfPassword |
      | Manoj     | Selvakumar | svmanoj2312@gamil.com |  8110085233 | jlhvljhjv | jlhvljhjv   |
