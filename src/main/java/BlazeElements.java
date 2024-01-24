import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeElements {
    public static void main(String[]args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.findElement(By.name("fromPort"));
        driver.findElement(By.linkText("destination of the week! The Beach!"));
        driver.findElement(By.partialLinkText("the week! The Beach"));
        driver.findElement(By.className("form-inline"));
        driver.quit();
    }
}