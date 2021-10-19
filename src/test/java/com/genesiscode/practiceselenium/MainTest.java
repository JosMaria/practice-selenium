package com.genesiscode.practiceselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

    private WebDriver driver;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    void openGoogle() {
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Selenium");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
