package com.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.sconto.pages.HomePage.basicURL;

public class MatrazenPage {
    public final static String matrazenURL = basicURL + "/matratzen-180x200";

    private final static By wishlistIcon = By.xpath("//*[@id=\"filterProducts\"]/div/div[1]/div/div[1]/div");
    private final static By loginBtn = By.xpath("//*[@id=\"addToWishlistLoginBox\"]/div/div[1]");
    private final static By matrazenHeader = By.xpath("//*[@id=\"categoryHeaderContainer\"]/div/h1");
    private final static By loginProposal = By.xpath("//*[@id=\"fancybox-container-1\"]/div[2]/div[4]/div/div/div[1]");

    public void addingToWishlist() {
        $(wishlistIcon).click();
    }

    public void clickToLogin() {
        $(loginBtn).click();
    }

    public SelenideElement header() {
         return $(matrazenHeader);
    }

    public SelenideElement loginProposal() {
        return $(loginProposal);
    }
}
