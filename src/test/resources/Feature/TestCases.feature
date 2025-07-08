@TestCases
Feature: Login page functionality

  Background: 
    Given The user is in login page

  @VLogin
  Scenario Outline: Valid user login
    Then User enters the username <UserName>
    Then User enters the password <Password>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      | student     | Password123 |

  @Login1
  Scenario Outline: Login with valid user name but invalid password
    Then User enters the valid username <UserName>
    Then User enters the invalid password <Password>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      | student     | ggiugi      |

  @Login2
  Scenario Outline: Login with invalid username but valid password
    Then User enters the invalid username <UserName>
    Then User enters the valid password <Password>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      | gytf        | Password123 |

  @Login3
  Scenario Outline: Login with invalid credentials
    Then User enters the wrong username <UserName>
    Then User enters the wrong password <Password>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      | fufg        | khgjd       |

  @Login4
  Scenario Outline: Login with empty username and valid password
    Then User enters the correct password <Password>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      |             | Password123 | 

  @Login5
  Scenario Outline: Login with valid username and empty password
    Then User enters the correct username <UserName>
    Then Clicks the submit button
    
        Examples: 
      | UserName    | Password    |
      | student     |             |

  @Login6
  Scenario Outline: Login with both empty details
    Then Clicks the submit button

      
      
      
      
      
      
