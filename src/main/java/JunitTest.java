import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;

public class JunitTest {

    private WebDriver driver;
    @Before
    public void setUp() {
        String pathChrome ="C:\\Users\\manue\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        driver = new ChromeDriver();
    }
    @Test
    public void TestFormFakeStore(){
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
        WebElement finalMessage = driver.findElement(By.xpath("//h4[text()='Thank you for sending your message!']"));
        Assert.assertTrue(finalMessage.getText().contains("Thank you for sending your message!"));
        Assert.assertEquals(finalMessage.getText(), "Thank you for sending your message!");
    }
    @Test
    public void TestElementsOnPage() {
        driver.get("https://blazedemo.com/");
        driver.findElement(By.name("fromPort"));
        WebElement message = driver.findElement(By.linkText("destination of the week! The Beach!"));
        driver.findElement(By.partialLinkText("the week! The Beach"));
        driver.findElement(By.className("form-inline"));
        Assert.assertTrue(message.getText().contains("destination of the week! The Beach!"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}