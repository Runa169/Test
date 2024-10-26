Feature: Login to the OrangeCRM Application

  @OrangeCRMPIM
  Scenario: Login to the OrangeCRM Application
    Given User Launch Home Page
    And user enter username and password
    And user click on login
    Then user is on Dashboard Page
    And user click on PIM
    And user enter employee name
    And user enter employee id
 	And user click on dropdown arrow in EmploymentStatus
 	And User selects 'Freelance' from EmploymentStatus dropdown
 	And user click on dropdown arrow in Include
 	And user selects 'Current and Past Employees' from Include dropdown
 	And user enter supervisor name
 	And user selects 'Account Assistance' from JobTitle dropdown
 	And user selects 'Administration' from Subunit dropdown
 	And user click on Search in Employee Information
 