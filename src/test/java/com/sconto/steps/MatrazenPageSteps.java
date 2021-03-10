package com.sconto.steps;

import com.sconto.pages.LoginPage;
import com.sconto.pages.MatrazenPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.sconto.pages.MatrazenPage.matrazenURL;

public class MatrazenPageSteps implements En {

    MatrazenPage matrazenPage;
    LoginPage loginPage;

    public MatrazenPageSteps() {
        Given("I am on the MatrazenPage", () -> {
            matrazenPage = open(matrazenURL, MatrazenPage.class);
        });

        Then("I should see MatrazenPage", () -> {
            matrazenPage.header().should(exist);
        });

        When("I click on HeartIcon", () -> {
            matrazenPage.addingToWishlist();
        });

        Then("I see the login proposal", () -> {
            matrazenPage.loginProposal().shouldHave(text(" "));
        });

        And("I click on Anmelden Button", () -> {
            matrazenPage.clickToLogin();
        });

        When("I insert valid user credentials", () -> {
            loginPage.validLoginInput();
        });

        When("I click on Login button", () -> {
            loginPage.clickLoginBtn();
        });

    }
}
