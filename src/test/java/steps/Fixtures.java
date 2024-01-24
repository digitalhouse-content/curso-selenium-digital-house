package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fixtures {

    private static WebDriver driver;

    public static void setUpClass() {
        String pathChrome = "C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Call setUpClass() first.");
        }
        return driver;
    }

    public static void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
