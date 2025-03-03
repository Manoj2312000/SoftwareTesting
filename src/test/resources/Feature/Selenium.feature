Feature: Selenium demo page

  @demo
  Scenario Outline: Work on demo page
    Given User is in demo page
    Then user inspectes the css value of a element
    Then User enters text input <TextInput>
    Then User slides the slider
    Then User selects dropdown
    Then User clicks the checkBox
    Then User drags and drops a webelement
    Then User erases the prefilled text field and enters new text input <PreTextInput>
    Then User clicks iframe checkbox
    Then user clicks on the link.
    Then User context clicks
    

    Examples: 
      | TextInput | PreTextInput  |
      | Manoj s   | Asalam Alekum |
