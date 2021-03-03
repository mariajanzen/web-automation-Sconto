package com.sconto.steps;

import com.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static com.sconto.pages.HomePage.basicURL;

public class HomePageSteps implements En {

    HomePage homePage;

    public HomePageSteps() {
        Given("I am on the Homepage", () -> {
            homePage = open(basicURL, HomePage.class);
            homePage.acceptCookies();
        });

        Then("I should see Homepage", () -> {
            homePage.carousel().should(exist);
        });
    }
}
