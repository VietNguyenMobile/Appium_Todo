package com.qacart.testcases;

import com.qacart.base.Base;
import com.qacart.pages.LoginScreen;
import com.qacart.pages.TasksScreen;
import org.testng.annotations.*;

public class LoginScreenTestCases extends Base {

    LoginScreen loginScreen;
    TasksScreen tasksScreen;

    @Test
    public void TC_001_Login_With_A_Valid_Email_And_Password() {
        loginScreen = new LoginScreen();
        loginScreen.performLogin(
                userTestData.getJSONObject("validUser").getString("email"),
                userTestData.getJSONObject("validUser").getString("password")
        );
    }


}
