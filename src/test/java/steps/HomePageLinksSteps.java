package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import java.util.List;
import java.util.Map;

public class HomePageLinksSteps {

    HomePage homePage = new HomePage();

    @Given("^The application is up and running")
    public void applicationIsUpAndRunning() {

    }

    @When("I navigate to the home page")
    public void iNavigateToTheHomePage() {
        homePage.navigateToHomePage();
    }

    @Then("I should see the following clickable links")
    public void iShouldSeeTheFollowingClickableLinks(Map<String, String> dataTable) {
        Assert.assertEquals(homePage.getFinancialServicesLink(), dataTable.get("Financial Services"));
        Assert.assertEquals(homePage.getInsuranceLink(), dataTable.get("Insurance"));
        Assert.assertEquals(homePage.getLifeAndPensionsLink(), dataTable.get("Life and Pensions"));
        Assert.assertEquals(homePage.getCorporationsAndNonProfitsLink(), dataTable.get("Corporations and Non-Profits"));
    }

    @And("I launch the Choose your Industry Tab")
    public void iLaunchTheChooseYourIndustryTab() throws InterruptedException {
        homePage.launchChooseYourIndustryTab();
    }

    @And("I choose to see more info about financial services")
    public void iChooseToSeeMoreInfoAboutFinancialServices() {
        homePage.gotoFinancialServicesDetails();
    }

    @Then("I should see the following related clickable links")
    public void iShouldSeeTheFollowingRelatedClickableLinks(Map<String, String> dataTable) {
        Assert.assertEquals(homePage.getFinancialCrimeComplianceLink(),dataTable.get("Financial Crime Compliance"));
        Assert.assertEquals(homePage.getFraudAndIdentityMgtLink(),dataTable.get("Fraud and Identity Management"));
        Assert.assertEquals(homePage.getCustomerDataMgtLink(),dataTable.get("Customer Data Management"));
        Assert.assertEquals(homePage.getCreditRiskAssessmentLink(),dataTable.get("Credit Risk Assessment"));
        Assert.assertEquals(homePage.getCollectionsAndRecoveryLink(),dataTable.get("Collections & Recovery"));
        Assert.assertEquals(homePage.getTracingAndInvestigationsLink(),dataTable.get("Tracing and Investigations"));
    }


}
