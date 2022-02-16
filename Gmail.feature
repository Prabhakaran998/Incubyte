
@tag
Feature: Compose mail in Gmail
  I want to use this template for my feature file

  @tag1
  Scenario: Validate gmail
    Given I am in the gmail page
    And I click on compose
    Then I am on the compose page
    And I click on subject
    And I enter "Incubyte" in the subject 
    Then I click on body
    And I enter "Automation QA test for Incubyte" in the body
    And I click on send
  
