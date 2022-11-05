package com.kitapyurdu.methods;

import com.kitapyurdu.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    public WebDriver driver;
    FluentWait<WebDriver> wait;

    JavascriptExecutor jsdriver;
    public Methods(){
        WebDriver driver = Driver.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }
    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by){
        findElement(by).click();
    }

    public void waitBySeconds(long seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch(Exception e){
            e.printStackTrace();

        }}
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public boolean isElementVisible(By by){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;

        }
        catch (Exception e){
            return false;
        }
    }
    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }
    public void scrollWithJavaScript(By by) {
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }
    public void hoverElement(By by){
        WebElement element = findElement(by);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public List<WebElement> findAllProduct(By locator) {
        return driver.findElements(locator);
    }

    public void randomSelect(By locator) { // random seçme
        Random rand = new Random();
        findAllProduct(locator).get(rand.nextInt(findAllProduct(locator).size())).click();
    }
}
