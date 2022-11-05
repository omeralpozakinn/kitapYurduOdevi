package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

public class LogOutPage {

    private static final Logger logger = (Logger) LogManager.getLogger(LogOutPage.class);

    Methods methods = new Methods();

    By accountIcon = By.xpath("(//a[@class=\"common-sprite\"])[1]");

    By logoutButton = By.linkText("Çıkış");

    public void logout(){

        methods.click(accountIcon);
        methods.click(logoutButton);
        logger.info("TEST PASSED");

    }
}
