import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacion {
    public static void main(String[]args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios");
        driver.navigate().to("https://blazedemo.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}