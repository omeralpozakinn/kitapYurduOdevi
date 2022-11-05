package com.kitapyurdu.test;

import com.kitapyurdu.driver.Driver;
import com.kitapyurdu.pages.*;
import org.junit.jupiter.api.Test;

public class SiteTest extends Driver {
    CardPage cardPage;
    CargoPage cargoPage;
    GuestPage guestPage;
    HomePage homePage;
    LogOutPage logOutPage;
    PointPage pointPage;
    UserInfoPage userInfoPage;

    @Test
    public void kitapYurduTest(){
        guestPage = new GuestPage();
        homePage = new HomePage();
        pointPage = new PointPage();
        cardPage = new CardPage();
        userInfoPage = new UserInfoPage();
        cargoPage = new CargoPage();
        logOutPage = new LogOutPage();

        guestPage.goLoginPage();
        homePage.productOperation();
        pointPage.pointPageOperations();
        cardPage.cardPageOperations();
        userInfoPage.userInfoPAgeOperations();
        cargoPage.cargoPageOperation();
        logOutPage.logout();

    }
}
