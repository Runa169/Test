Feature: Login to the OrangeCRM Application

  @OrangeCRMRecruitment
  Scenario: Login to the OrangeCRM Application
    Given User Launch Home Page
    And user enter username and password
    And user click on login
    Then user is on Dashboard Page
    And user click on Recruitment
    And user click on dropdown arrow in Recruitment
    And user select 'Content Specialist' from JobTitle
    And user select 'Senior Support Specialist' from Vacancy
    And user select 'Odis Adalwin' from Hiring Manager
    And user select 'Job Offered' from Hiring Manager
    And user enter Candidate Name
    Then user enter Keywords
    And user enter Date of Application 
    