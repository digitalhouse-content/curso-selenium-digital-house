import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandBoxElements {
    public static void main(String[]args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios");
        driver.findElement(By.xpath("//input[@id='nombre']"));
        driver.findElement(By.cssSelector("img.img-fluid"));
        driver.findElement(By.xpath("//*[text()='Web Store for Digital House members']"));
        driver.quit();
    }
}