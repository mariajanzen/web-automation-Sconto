package com.company.steps;

import com.codeborne.selenide.Condition;
import com.company.pages.HomePage;
import com.company.pages.LoginPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.jvm.hotspot.code.Location;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.company.pages.HomePage.basicURL;

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
