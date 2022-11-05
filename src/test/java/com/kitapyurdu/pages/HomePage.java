package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {

    private static final Logger logger = (Logger) LogManager.getLogger(HomePage.class);
    Methods methods = new Methods();

    By searchBox = By.xpath("//input[@id=\"search-input\"]");

    By searchButton = By.className("common-sprite button-search");

    By seventhProductScroll = By.id("product-395206");

    By favoriteProducts1 = By.xpath("(//i[@class=\"fa fa-heart\"])[9]");
    By favoriteProducts2 = By.xpath("(//i[@class=\"fa fa-heart\"])[10]");

    By getFavoriteProducts3Hover = By.id("product-468254");

    By favoriteProducts3 = By.xpath("(//i[@class=\"fa fa-heart\"])[11]");

    By favoriteProducts4 = By.xpath("(//i[@class=\"fa fa-heart\"])12]");

    By popupOfFavorite = By.className("swal2-title ky-swal-title-single");

    By backToMainPAge = By.xpath("(//a[@href=\"https://www.kitapyurdu.com/\"])[2]");

    public void productOperation(){

        methods.click(searchBox);
        methods.waitBySeconds(4);
        methods.sendKeys(searchBox,"Oyuncak");
        methods.waitBySeconds(4);
        methods.click(searchButton);
        methods.waitBySeconds(4);
        methods.scrollWithAction(seventhProductScroll);
        methods.waitBySeconds(4);
        methods.click(favoriteProducts1);
        methods.waitBySeconds(4);
        methods.waitBySeconds(1);
        Assertions.assertTrue(methods.isElementVisible(popupOfFavorite));
        methods.waitBySeconds(4);
        methods.click(favoriteProducts2);
        methods.waitBySeconds(1);
        Assertions.assertTrue(methods.isElementVisible(popupOfFavorite));
        methods.hoverElement(getFavoriteProducts3Hover);
        methods.click(favoriteProducts3);
        methods.waitBySeconds(1);
        Assertions.assertTrue(methods.isElementVisible(popupOfFavorite));
        methods.click(favoriteProducts4);
        methods.waitBySeconds(1);
        Assertions.assertTrue(methods.isElementVisible(popupOfFavorite));
        methods.click(backToMainPAge);

        logger.info("TEST PASSED");
    }

}
