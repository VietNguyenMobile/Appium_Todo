package com.qacart.testcases;

import com.qacart.base.Base;
import com.qacart.pages.LoginScreen;
import com.qacart.pages.TasksScreen;
import org.testng.annotations.*;
import org.testng.Assert;

public class LoginScreenTestCases extends Base {

    LoginScreen loginScreen;
    TasksScreen tasksScreen;

    @Test
    public void TC_001_Login_With_A_Valid_Email_And_Password() throws InterruptedException {
        loginScreen = new LoginScreen();
        tasksScreen = loginScreen.performLogin(
                userTestData.getJSONObject("validUser").getString("email"),
                userTestData.getJSONObject("validUser").getString("password")
        );
        boolean isDisplayed = tasksScreen.isLogoutButtonDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test
    public void TC_002_Login_With_A_Valid_Email_And_Not_Valid_Password() {
        loginScreen = new LoginScreen();
        String email = userTestData.getJSONObject("inValidUser").getString("email");
        String password = userTestData.getJSONObject("inValidUser").getString("password");
        loginScreen.performLogin(email , password );
        boolean isErrorMessageDisplayed = loginScreen.isErrorMessageDisplayed();
        Assert.assertTrue(isErrorMessageDisplayed);

    }



}
