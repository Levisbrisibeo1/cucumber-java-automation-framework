package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.FrameworkProperties;

import java.io.IOException;

public class HomePage extends BaseClass {

    public static FrameworkProperties frameworkProperties = new FrameworkProperties();

    public final By financialServicesLink = By.xpath("//a[text()='clickable area - fs']");
    public final By insuranceLink = By.xpath("//a[text()='clickable area - insurance']");
    public final By lifeAndPensionsLink = By.xpath("//a[text()='clickable area - life']");
    public final By corporationsAndNonProfitsLink = By.xpath("//a[text()='clickable area - bnp']");
    public final By chooseYourIndustryTab = By.xpath("//a[text()='Choose Your Industry']");
    public final By learnMoreBoutFinancialServicesLink = By.xpath("//a[@data-industryname='Financial Services ']");
    public final By financialCrimeComplianceLink = By.linkText("Financial Crime Compliance");
    public final By fraudAndIdentityMgtLink = By.linkText("Fraud and Identity Management");
    public final By customerDataMgtLink = By.linkText("Customer Data Management");
    public final By creditRiskAssessmentLink = By.linkText("Credit Risk Assessment");
    public final By collectionsAndRecoveryLink = By.linkText("Collections and Recovery");
    public final By tracingAndInvestigationsLink = By.linkText("Tracing and Investigations");
    public final By acceptAllCookiesButton = By.id("onetrust-accept-btn-handler");

    public void navigateToHomePage() {
        try {
            goTo(frameworkProperties.getProperty("baseUrl"));
            acceptAllCookies();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFinancialServicesLink() {
        return getValueOfElementAttribute(financialServicesLink, "href");
    }

    public String getInsuranceLink() {
        return getValueOfElementAttribute(insuranceLink, "href");
    }

    public String getLifeAndPensionsLink() {
        return getValueOfElementAttribute(lifeAndPensionsLink, "href");
    }

    public String getCorporationsAndNonProfitsLink() {
        return getValueOfElementAttribute(corporationsAndNonProfitsLink, "href");
    }

    public void launchChooseYourIndustryTab() {
        clickOnElement(chooseYourIndustryTab);
    }

    public void gotoFinancialServicesDetails() {
        clickOnElement(learnMoreBoutFinancialServicesLink);
    }

    public String getFinancialCrimeComplianceLink() {
        return getValueOfElementAttribute(financialCrimeComplianceLink, "href");
    }

    public String getFraudAndIdentityMgtLink() {
        return getValueOfElementAttribute(fraudAndIdentityMgtLink, "href");
    }

    public String getCustomerDataMgtLink() {
        return getValueOfElementAttribute(customerDataMgtLink, "href");
    }

    public String getCreditRiskAssessmentLink() {
        return getValueOfElementAttribute(creditRiskAssessmentLink, "href");
    }

    public String getCollectionsAndRecoveryLink() {
        return getValueOfElementAttribute(collectionsAndRecoveryLink, "href");
    }

    public String getTracingAndInvestigationsLink() {
        return getValueOfElementAttribute(tracingAndInvestigationsLink, "href");
    }

    public void acceptAllCookies(){
        clickOnElement(acceptAllCookiesButton);
    }
}
