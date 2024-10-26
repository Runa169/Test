Feature: Login to the OrangeCRM Application Time

  @OrangeCRMTime
  Scenario: Login to the OrangeCRM Application Time
    Given User Launch Home Page
    And user enter username and password
    And user click on login
    Then user is on Dashboard Page
    And user click on Time
    And user enter employee name in time
    And user click on View
