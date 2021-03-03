package com.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String basicURL = PropertiesLoader.loadProperty("url");

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    private static By banner = By.cssSelector(".consentForm__title");
    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By carouselImg = By.cssSelector(".carouselImage");

    public void acceptCookies() {
        $(acceptBtn).click();
        $(banner).shouldNot(Condition.exist);
    }

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    public void hoverLoginIcon() {
        $(loginIcon).hover();
    }

    public SelenideElement carousel() {
        return $(carouselImg);
    }
}
