package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectFakeStore {
    private final WebDriver driver;

    public PageObjectFakeStore(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameInput() {
        return driver.findElement(By.xpath("//input[@id='nombre']"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPhoneInput() {
        return driver.findElement(By.xpath("//input[@id='telefono']"));
    }

    public WebElement getAgeInput() {
        return driver.findElement(By.xpath("//input[@id='edad']"));
    }

    public WebElement getCityInput() {
        return driver.findElement(By.xpath("//input[@id='ciudad']"));
    }

    public WebElement getCommentsInput() {
        return driver.findElement(By.xpath("//textarea[@id='comentarios']"));
    }

    public WebElement getSendButton() {
        return driver.findElement(By.xpath("//*[text()='Send']"));
    }

    public WebElement getFinalMessage() {
        return driver.findElement(By.xpath("//h4[text()='Thank you for sending your message!']"));
    }
}
