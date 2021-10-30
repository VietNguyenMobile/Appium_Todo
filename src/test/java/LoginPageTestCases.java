import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTestCases {

    @BeforeClass
    public void beforeClass() {
        System.out.println("). Run the application using react-native run-android");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("6: un install our application");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("1. Open the application");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("5. Close the application");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("i will run before any test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("i will run after any test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("i will run before any suite");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("i will run after any suite");
    }

    @Test (priority = 1, groups = "sanity")
    public void Login_With_Valid_Email_And_Password() {
        System.out.println("Login_With_Valid_Email_And_Password");

//        System.out.println("1. Open the application");
        System.out.println("2. Send a valid email to the email text field");
        System.out.println("3. Send a valid password to the password text field");
        System.out.println("4. Click on the login button");

        String actualResult = "QAcart";
        String expectedResult = "QAcart";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (priority = 2, groups = "regression")
    public void Login_With_Invalid_Email_And_Password() {
        System.out.println("Login_With_Invalid_Email_And_Password");

//        System.out.println("1. Open the application");
        System.out.println("2. Send a invalid email to the email text field");
        System.out.println("3. Send a valid password to the password text field");
        System.out.println("4. Click on the login button");

        Assert.assertTrue(true);
    }

    @Parameters ({"platformName"})
    @Test (priority = 3, groups = {"regression", "sanity"})
    public void Login_With_Invalid_Email_And_Valid_Password(String platform) {
        System.out.println("platformName: " + platform);
        System.out.println("Login_With_Invalid_Email_And_Valid_Password");

//        System.out.println("1. Open the application");
        System.out.println("2. Send a valid email to the email text field");
        System.out.println("3. Send a invalid password to the password text field");
        System.out.println("4. Click on the login button");
    }

    @Test (priority = 4)
    public void Login_With_Invalid_Email_And_Invalid_Password() {
        System.out.println("Login_With_Invalid_Email_And_Invalid_Password");

//        System.out.println("1. Open the application");
        System.out.println("2. Send a invalid email to the email text field");
        System.out.println("3. Send a invalid password to the password text field");
        System.out.println("4. Click on the login button");
    }
}
