import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteraccionVentanas {
    public static void main(String[] args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        ((ChromeDriver) driver).executeScript("window.open()");
        ((ChromeDriver) driver).switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.get("https://www.google.com");
        ((ChromeDriver) driver).switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.quit();
    }
}