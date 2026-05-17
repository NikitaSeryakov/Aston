package service;

import page.DepositPage;

public class DepositPageService {
    private final DepositPage depositPage = new DepositPage();

    public  DepositPage inputCorrectValues(String telethonNumber, String depositSum) {
        return depositPage.addNumber(telethonNumber)
                .addSum(depositSum)
                .clickButton();
    }

}
