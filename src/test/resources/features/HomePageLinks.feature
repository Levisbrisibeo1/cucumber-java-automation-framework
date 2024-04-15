@HomePageLinks
Feature: Home page Links
  Description:
  As a user I want to I want to se the following links on the home page
  so that I can navigate to various sections of the application

  1. In Home page, Under Transform Your Risk Decision Making Heading
  Financial Services
  Insurance
  Life and Pensions
  Corporations and Non-Profits

  2.In Choose your Industry Tab, Under Industries Select Financial Services
  Financial Crime Compliance
  Fraud and Identity Management
  Customer Data Management
  Credit Risk Assessment
  Collections & Recovery
  Tracing and Investigations

  Scenario: Validate links under Transform Your Risk Decision Making  section
    Given The application is up and running
    When I navigate to the home page
    Then I should see the following clickable links
      | Financial Services           | https://risk.lexisnexis.co.uk/financial-services           |
      | Insurance                    | https://risk.lexisnexis.co.uk/insurance                    |
      | Life and Pensions            | https://risk.lexisnexis.co.uk/life-and-pension             |
      | Corporations and Non-Profits | https://risk.lexisnexis.co.uk/corporations-and-non-profits |

  Scenario: Validate links in Industries Select Financial Services section
    Given The application is up and running
    When I navigate to the home page
    And I launch the Choose your Industry Tab
    And I choose to see more info about financial services
    Then I should see the following related clickable links
      | Financial Crime Compliance    | https://risk.lexisnexis.co.uk/financial-services/financial-crime-compliance    |
      | Fraud and Identity Management | https://risk.lexisnexis.co.uk/financial-services/fraud-and-identity-management |
      | Customer Data Management      | https://risk.lexisnexis.co.uk/financial-services/customer-data-management      |
      | Credit Risk Assessment        | https://risk.lexisnexis.co.uk/financial-services/credit-risk-assessment        |
      | Collections & Recovery        | https://risk.lexisnexis.co.uk/financial-services/collections-and-recovery      |
      | Tracing and Investigations    | https://risk.lexisnexis.co.uk/financial-services/tracing-and-investigations    |
