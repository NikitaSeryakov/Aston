package service;

import org.openqa.selenium.By;
import page.MainPage;

import static utils.Constants.MAIN_PAGE_URL;
import static utils.DriverManager.driver;

public class MainPageService {
    private final MainPage mainPage = new MainPage();

    public MainPageService openPageAndAcceptCookie() {
        mainPage.openPage(MAIN_PAGE_URL)
                .acceptCookie();
        return this;
    }

    public MainPageService inputCorrectValues(String telethonNumber, String depositSum) {
        mainPage.addNumber(telethonNumber)
                .addSum(depositSum)
                .clickButtonContinue();
        return this;
    }
    public boolean isPaymentFrameDisplayed() {
        return driver.findElement(By.className("payment-widget-iframe")).isDisplayed();
    }

}
