package com.kitapyurdu.pages;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

import java.lang.reflect.Method;

public class PointPage {

    private static final Logger logger = (Logger) LogManager.getLogger(PointPage.class);

    By pointIcon = By.xpath("(//a[@class=\"common-sprite\"])[8]");

    By turkishClassics = By.xpath("(//img[@class=\"landing-button\"])[2]");

    By filterTypeShow = By.xpath("(//select[@onchange=\"location = this.value;\"])[1]");

    By filterTypeSelect= By.xpath("//option[text()=\"Yüksek Oylama\"]");

    By allCategories = By.className("\"common-sprite allCategories\"");

    By hobbyselect = By.xpath("//a[@href=\"https://www.kitapyurdu.com/kategori/kitap-hobi/212.html\"]");
    By randomProductsSendToCard = By.className("add-to-cart");

    By getFavoriteProducts3Hover = By.id("product-468254");
    By hoverMyList = By.xpath("//div[@class=\"menu top my-list\"]");
    By favoriteList = By.linkText("Favorilerim"); // internetten baktığım argümanlar sayesinde linktext kullanmayı öğrendim.
    By removeProduct = By.xpath("(//a[@onclick=\"removeFromFavorites(468254);\"])[2]");

    By clickShoppingCart = By.id("sprite-cart-icon");

    By clickShoppingPageCart = By.id("js-cart");

    Methods methods = new Methods();

    public void pointPageOperations(){

        methods.click(pointIcon);
        methods.click(turkishClassics);
        methods.click(filterTypeShow);
        methods.click(filterTypeSelect);
        methods.click(allCategories);
        methods.click(hobbyselect);
        methods.randomSelect(randomProductsSendToCard);
        methods.hoverElement(hoverMyList);
        // methods.hoverElement(favoriteList);
        methods.click(favoriteList);
        methods.hoverElement(getFavoriteProducts3Hover);
        methods.click(removeProduct);
        methods.click(clickShoppingCart);
        methods.click(clickShoppingPageCart);

        logger.info("TEST PASSED");
    }







}
