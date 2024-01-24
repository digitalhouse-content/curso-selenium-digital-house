package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ActionsWindows {
    private final WebDriver driver;

    public ActionsWindows(WebDriver driver) {
        this.driver = driver;
    }

    public void openNewWindow() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
    }

    public void switchToWindow(int index) {
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }
}
