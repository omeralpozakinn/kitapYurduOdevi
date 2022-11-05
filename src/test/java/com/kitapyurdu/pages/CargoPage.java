package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CargoPage {

    private static final Logger logger = (Logger) LogManager.getLogger(CargoPage.class);
    Methods methods= new Methods();

    By continueToPaymendInfo = By.xpath("//button[@id=\"button-checkout-continue\"]");

    By cardOwnerName = By.xpath("//input[@id=\"credit-card-owner\"]");

    By cardInfofirstfour = By.xpath("//input[@id=\"credit_card_number_1\"]");

    By cardInfoSecondfour = By.xpath("//input[@id=\"credit_card_number_2\"]");

    By cardInfoThirtfour = By.xpath("//input[@id=\"credit_card_number_3\"]");

    By cardInfofourthfour = By.xpath("//input[@id=\"credit_card_number_4\"]");

    By cardMounthDate = By.xpath("//select[@id=\"credit-card-expire-date-month\"]");

    By cardMounth = By.xpath("//select//option[@value=\"01\"]");

    By cardYearDate = By.xpath("//select[@id=\"credit-card-expire-date-year\"]");

    By cardYear = By.xpath("//select//option[@value=\"2022\"]");

    By ccvInfo = By.xpath("//input[@id=\"credit-card-security-code\"]");

    By finishBuyTime = By.xpath("//button[@id=\"button-checkout-continue\"]");

    By errorMessage = By.xpath("//span[text()=\"Kart numarası geçersiz. Kontrol ediniz!\"]");

    By goHomePageLogo = By.className("\"checkout-logo\"");


    public void cargoPageOperation(){

        methods.click(continueToPaymendInfo);
        methods.click(cardOwnerName);
        methods.sendKeys(cardOwnerName,"abuzer abuzer abuzer");
        methods.click(cardInfofirstfour);
        methods.sendKeys(cardInfofirstfour,"1905");
        methods.sendKeys(cardInfoSecondfour,"1905");
        methods.sendKeys(cardInfoThirtfour,"1905");
        methods.sendKeys(cardInfofourthfour,"1905");
        methods.click(cardMounthDate);
        methods.click(cardMounth);
        methods.click(cardYearDate);
        methods.click(cardYear);
        methods.click(ccvInfo);
        methods.sendKeys(ccvInfo,"111");
        methods.click(finishBuyTime);
        Assertions.assertTrue(methods.isElementVisible(errorMessage));
        methods.click(goHomePageLogo);

        logger.info("TEST PASSED");



    }
}
