Feature: File upload functionality

  @FileUpload
  Scenario Outline: Select a file and upload it.
    Given User is in file uploader page
    Then User clicks on the choose file button and uploades a file
    Then User clicks on the upload button.
    Then The file is uploaded sucessfully
    Then User clicks on a link

 
