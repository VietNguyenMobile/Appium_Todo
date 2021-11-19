package com.qacart.testcases;

import com.qacart.base.Base;
import com.qacart.pages.LoginScreen;
import com.qacart.pages.TasksScreen;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginScreenTestCases extends Base {

    LoginScreen loginScreen;
    TasksScreen tasksScreen;

    @Test
    public void TC_001_Login_With_A_Valid_Email_And_Password() throws InterruptedException {
//        loginScreen = new LoginScreen();
//        tasksScreen = loginScreen.performLogin(
//                userTestData.getJSONObject("validUser").getString("email"),
//                userTestData.getJSONObject("validUser").getString("password")
//        );
//        boolean isDisplayed = tasksScreen.isLogoutButtonDisplayed();
//        Assert.assertTrue(isDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("android:id/text1")).click();

//           driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
           driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Argentina\").instance(0))"));

        driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(4000);

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

        double sumOfProducts = 0;

        for (int i= 0; i< count; i++) {
            String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();

            double amountNumber = getAmount(amount1);

            sumOfProducts += amountNumber;
        }
        System.out.println("sumOfProducts: " + sumOfProducts);
        String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

        System.out.println("total: " + total);

        double totalValue = getAmount(total);

        System.out.println("totalValue: " + totalValue);

        Assert.assertEquals(sumOfProducts, totalValue, sumOfProducts);
    }

    public static double getAmount(String value) {
        value = value.substring(1);
        return Double.parseDouble(value);

    }

    @Test
    public void TC_002_Login_With_A_Valid_Email_And_Not_Valid_Password() throws InterruptedException {
//        loginScreen = new LoginScreen();
//        String email = userTestData.getJSONObject("inValidUser").getString("email");
//        String password = userTestData.getJSONObject("inValidUser").getString("password");
//        loginScreen.performLogin(email , password );
//        boolean isErrorMessageDisplayed = loginScreen.isErrorMessageDisplayed();
//        Assert.assertTrue(isErrorMessageDisplayed);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("input");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("android:id/text1")).click();

//           driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Argentina\").instance(0))"));

        driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(4000);

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

        double sumOfProducts = 0;

        for (int i= 0; i< count; i++) {
            String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();

            double amountNumber = getAmount(amount1);

            sumOfProducts += amountNumber;
        }
        System.out.println("sumOfProducts: " + sumOfProducts);
        String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

        System.out.println("total: " + total);

        double totalValue = getAmount(total);

        System.out.println("totalValue: " + totalValue);

        Assert.assertEquals(sumOfProducts, totalValue, sumOfProducts);

    }



}
