package com.INT.assignment.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.INT.assignment.base.BaseTest;
import com.INT.assignment.pages.LoginPage;
import com.INT.assignment.utilt.ExcelUtil;
import com.INT.assignment.utilt.ReportManager;
import com.INT.assignment.utilt.ScreenshotUtil;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {
        return ExcelUtil.getTestData();
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String tcId,
                          String username,
                          String password,
                          String expectedResult) throws Exception {

        ReportManager.test =
                ReportManager.extent.createTest("Login Test - " + tcId);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        boolean actualResult =
                driver.getCurrentUrl().contains("inventory");

        try {
            if (expectedResult.equalsIgnoreCase("PASS")) {
                Assert.assertTrue(actualResult);
                ReportManager.test.pass("Login successful");
            } else {
                Assert.assertFalse(actualResult);
                ReportManager.test.pass("Login failed as expected");
            }
        } catch (AssertionError e) {

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(driver, tcId);

            ReportManager.test.fail("Test failed")
                    .addScreenCaptureFromPath(screenshotPath);

            throw e;
        }
    }
}
