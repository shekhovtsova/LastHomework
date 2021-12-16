package com.qase.qa.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(id = "inputEmail")
    public SelenideElement login;
    @FindBy(id = "inputPassword")
    public SelenideElement password;
    @FindBy(id = "btnLogin")
    public SelenideElement btn;


    @Step
    public void enterLogin(String name) {
        login.click();
        login.clear();
        login.sendKeys(name);
    }

    @Step
    public void enterPassword(String pass) {
        password.click();
        password.clear();
        password.sendKeys(pass);
    }

    @Step
    public DashboardPage clickLoginBtn() {
        btn.click();
        return page(DashboardPage.class);
    }
}
