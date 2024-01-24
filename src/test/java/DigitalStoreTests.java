import Actions.ActionsWindows;
import PageObjects.PageObjectFakeStore;
import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DigitalStoreTests {

    private WebDriver driver;
    private PageObjectFakeStore fakeStorePage;
    private ActionsWindows windowsActions;

    @Before
    public void setUp() {
        Fixtures.setUpClass();
        driver = Fixtures.getDriver();
        driver.get(TestData.URL);
        fakeStorePage = new PageObjectFakeStore(driver);
        windowsActions = new ActionsWindows(driver);
    }

    @Test
    @Description("Test de llenado de Formulario en la tienda Digital House.")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    public void TestFormFakeStore() {
        fakeStorePage.getNameInput().sendKeys(TestData.NAME);
        fakeStorePage.getEmailInput().sendKeys(TestData.EMAIL);
        fakeStorePage.getPhoneInput().sendKeys(TestData.PHONE);
        fakeStorePage.getAgeInput().sendKeys(TestData.AGE);
        fakeStorePage.getCityInput().sendKeys(TestData.CITY);
        fakeStorePage.getCommentsInput().sendKeys(TestData.COMMENT);
        fakeStorePage.getCommentsInput().clear();
        fakeStorePage.getCommentsInput().sendKeys("Hola");
        fakeStorePage.getSendButton().click();
        WebElement finalMessage = fakeStorePage.getFinalMessage();
        Assert.assertTrue(finalMessage.getText().contains(TestData.CONFIRMATION));
        Assert.assertEquals(finalMessage.getText(), TestData.CONFIRMATION);
    }

    @Test
    @Description("Test de cambio de pestañas.")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    public void TestsWindows() {
        windowsActions.openNewWindow();
        windowsActions.switchToWindow(1);
        driver.get(TestData.URL);
        windowsActions.switchToWindow(0);
    }

    @After
    public void tearDown() {
        Fixtures.tearDownClass();
    }
}
