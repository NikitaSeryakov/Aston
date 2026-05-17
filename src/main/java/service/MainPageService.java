package service;

import page.MainPage;

import static utils.Constants.MAIN_PAGE_URL;

public class MainPageService {
    private final MainPage mainPage = new MainPage();

    public MainPageService openPageAndAcceptCookie(){
        mainPage.openPage(MAIN_PAGE_URL)
                .acceptCookie();
        return this;
    }

}
