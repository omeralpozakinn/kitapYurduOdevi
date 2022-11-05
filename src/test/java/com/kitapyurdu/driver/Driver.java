package com.kitapyurdu.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static final Logger logger = (Logger) LogManager.getLogger(Driver.class);

    public static WebDriver driver;

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");


    }
    @BeforeEach
    public void duringTime(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notification");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://www.kitapyurdu.com/");
        logger.info("TEST BEGIN");
    }
    @AfterAll
    public static void tearDown(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        logger.info("TEST IS FINISH");
    }
}
