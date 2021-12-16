package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class WorkSpacePage {
    @FindBy(xpath = "/html//div[@id='app']/div[1]/div[@class='app-content']/div[@class='container-submenu d-flex']//p[@class='header ms-0']")
    public SelenideElement workspaceHeader;

    @Step
    public void checkWorkspacePage() {
        workspaceHeader.shouldBe(Condition.visible);
    }
}
