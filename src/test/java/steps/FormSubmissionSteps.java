package steps;

import PageObjects.PageObjectFakeStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormSubmissionSteps {

    private WebDriver driver;
    private PageObjectFakeStore fakeStorePage;


    @Given("The user is on the Digital Store website")
    public void userIsOnDigitalStoreWebsite() {
        Fixtures.setUpClass();
        driver = Fixtures.getDriver();
        driver.get(TestData.URL);
        fakeStorePage = new PageObjectFakeStore(driver);
    }

    @When("The user submits the form with valid data")
    public void userSubmitsFormWithValidData() {
        fakeStorePage.getNameInput().sendKeys(TestData.NAME);
        fakeStorePage.getEmailInput().sendKeys(TestData.EMAIL);
        fakeStorePage.getPhoneInput().sendKeys(TestData.PHONE);
        fakeStorePage.getAgeInput().sendKeys(TestData.AGE);
        fakeStorePage.getCityInput().sendKeys(TestData.CITY);
        fakeStorePage.getCommentsInput().sendKeys(TestData.COMMENT);
        fakeStorePage.getCommentsInput().clear();
        fakeStorePage.getCommentsInput().sendKeys("Hola");
        fakeStorePage.getSendButton().click();
    }

    @Then("The user should see a confirmation message")
    public void userShouldSeeConfirmationMessage() {
        WebElement finalMessage = fakeStorePage.getFinalMessage();
        Assert.assertTrue(finalMessage.getText().contains(TestData.CONFIRMATION));
        Assert.assertEquals(finalMessage.getText(), TestData.CONFIRMATION);
    }
}
