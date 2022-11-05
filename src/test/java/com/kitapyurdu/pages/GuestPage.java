package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class GuestPage {

    private static final Logger logger = (Logger) LogManager.getLogger(GuestPage.class);
    By loginButton= By.xpath("//div[@class=\"menu-top-button login\"]");
    Methods methods = new Methods();

    By email = By.xpath("//input[@id=\"login-email\"]");
    By password = By.xpath("//input[@id=\"login-password\"]");

    By buttonOfLogin = By.xpath("//button[@class=\"ky-btn ky-btn-orange w-100 ky-login-btn\"]");
    By user = By.xpath("//b[text()=\"ömer alp özakın\"]");



    public void goLoginPage(){
        methods.click(loginButton);
        methods.click(email);
        methods.sendKeys(email, "omeralpozakin@gmail.com");
        methods.click(password);
        methods.sendKeys(password, "1a2b3c4d");
        methods.waitBySeconds(4);
        methods.click(buttonOfLogin);
        methods.waitBySeconds(4);
        Assertions.assertTrue(methods.isElementVisible(user)); // kullanıcı ismine bakıp Login durumunu kontrol ediyor
        logger.info("TEST PASSED");
    }


}
