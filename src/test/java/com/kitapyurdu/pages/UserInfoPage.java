package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

public class UserInfoPage {

    private static final Logger logger = (Logger) LogManager.getLogger(UserInfoPage.class);

    Methods methods = new Methods();

    By clickNewAdress = By.linkText("Yeni bir adres kullanmak istiyorum.");

    By sendName = By.xpath("//input[@id=\"address-firstname-companyname\"]");
    By sendSurname = By.xpath("///input[@id=\"address-lastname-title\"]");

    By sendCityBar = By.xpath("//select[@id=\"address-zone-id\"]");
    By sendCity = By.name("\"3354\"");


    By sendCountryBar = By.xpath("//select[@id=\"address-county-id\"]");
    By sendCountry = By.name("470");

    By clickAdressDetailBar = By.xpath("//textarea[@id=\"address-address-text\"]");

    By phoneNumberBar = By.xpath("//input[@id=\"address-mobile-telephone\"]");

    By continueToCargo = By.xpath("//button[@id=\"button-checkout-continue\"]");



    public void userInfoPAgeOperations(){

        methods.click(clickNewAdress);
        methods.click(sendName);
        methods.sendKeys(sendName,"Ömer Alp");
        methods.sendKeys(sendSurname,"Özakın");
        methods.click(sendCityBar);
        methods.click(sendCity);
        methods.click(sendCountryBar);
        methods.click(sendCountry);
        methods.click(clickAdressDetailBar);
        methods.sendKeys(clickAdressDetailBar,"Uğur Mumcu Mahallesi  2135. sokak no:7 Daire-Zil:3");
        methods.click(phoneNumberBar);
        methods.sendKeys(phoneNumberBar,"+5543830132");
        methods.click(continueToCargo);

        logger.info("TEST PASSED");

    }
}
