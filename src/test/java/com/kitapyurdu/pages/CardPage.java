package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

import java.lang.reflect.Method;

public class CardPage {

    private static final Logger logger = (Logger) LogManager.getLogger(CardPage.class);
    Methods methods = new Methods();
    By productPriceValue = By.xpath("//input[@value=\"1\"]");

    By goBuy = By.xpath("(//a[@class=\"button red\"])[2]");


    public void cardPageOperations(){

        methods.driver.findElement(productPriceValue).clear();
        methods.sendKeys(productPriceValue,"5");
        methods.click(goBuy);

        logger.info("TEST PASSED");

    }
}
