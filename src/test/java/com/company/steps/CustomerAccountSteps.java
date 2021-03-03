package com.company.steps;

import com.codeborne.selenide.Condition;
import com.company.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountSteps implements En {
    CustomerAccountPage customerAccountPage;

    public CustomerAccountSteps() {
        Then("I should be logged in", () -> {
            customerAccountPage = page(CustomerAccountPage.class);
            customerAccountPage.accountTitle().should(Condition.exist);
        });
    }
}
