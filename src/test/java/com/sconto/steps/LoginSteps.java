package com.sconto.steps;

import com.codeborne.selenide.Condition;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginSteps implements En{

    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps() {

        When("I click on Login icon", () -> {
            homePage = page(HomePage.class);
            loginPage = homePage.clickLoginIcon();
        });

        Then("I see Login page", () -> {
            loginPage.loginPageHeader().should(Condition.exist);
            loginPage.loginPageHeader().shouldHave(text("Anmelden"));
        });

        When("I insert valid user credentials", () -> {
            loginPage.validLoginInput();
        });

        When("I click on Login button", () -> {
            loginPage.clickLoginBtn();
        });
    }
}
