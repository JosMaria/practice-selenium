package locating.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocatingElementsTest {

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    public void elementsQuiz1() {

        //1. Instantiate the driver
        FirefoxDriver driver = new FirefoxDriver();

        //2. Navigate to the URL
        driver.get("https://www.saucedemo.com");

        //3. find element
        //4. check the state
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        //5. take action
        //6. record the result
        assertTrue(element.isDisplayed());

        //7. quit the driver
        driver.quit();
    }
}
