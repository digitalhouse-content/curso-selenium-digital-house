import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManipularElementos {
    public static void main(String[]args) {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios");
        WebElement name = driver.findElement(By.xpath("//input[@id='nombre']"));
        name.sendKeys("Manuel Ledezma");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("mmmmm@gmail.com");
        WebElement phone = driver.findElement(By.xpath("//input[@id='telefono']"));
        phone.sendKeys("111111111");
        WebElement age = driver.findElement(By.xpath("//input[@id='edad']"));
        age.sendKeys("35");
        WebElement city = driver.findElement(By.xpath("//input[@id='ciudad']"));
        city.sendKeys("Buenos Aires");
        WebElement comments = driver.findElement(By.xpath("//textarea[@id='comentarios']"));
        comments.sendKeys("hola esto es un comentario");
        comments.clear();
        comments.sendKeys("Hola");
        WebElement button = driver.findElement(By.xpath("//*[text()='Send']"));
        button.click();
        driver.quit();
    }
}