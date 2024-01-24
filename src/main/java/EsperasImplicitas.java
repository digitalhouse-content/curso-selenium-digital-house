import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class EsperasImplicitas {
    public static void main(String[]args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("fromPort"));
        driver.quit();
    }
}