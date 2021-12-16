package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DashboardPage {
    @FindBy(id = "user-menu")
    public SelenideElement submit;

    @FindBy(xpath = "//div[@id='app']/div/div/div/div/ul/li[3]/a/span")
    public SelenideElement linkWorkSpace;

    @FindBy (xpath = "/html//div[@id='react-app']/div[@class='app']/div[@class='container-fluid']//table//tr[@class='project-row']/td[3]/div[1]/a[@href='/project/DEMO']")
    public SelenideElement openProject;

    @Step
    public void checkDashboardPage() {
        submit.shouldBe(Condition.visible);
    }

    @Step
    public WorkSpacePage openWorkSpacePage() {
        linkWorkSpace.click();
        return page(WorkSpacePage.class);
    }

    @Step
    public ProjectPage openProjectPage() {
        openProject.click();
        return page(ProjectPage.class);
    }

}