import com.qacart.base.Base;
import org.testng.annotations.Test;

public class SignupPageTestCases extends Base {

    @Test (priority = 1)
    public void signup_with_valid_name_and_email_and_password() {
        System.out.println("signup_with_valid_name_and_email_and_password");

    }

    @Test (priority = 2)
    public void signup_with_invalid_name_and_email_and_password() {
        System.out.println("signup_with_invalid_name_and_email_and_password");

    }

    @Test (priority = 3)
    public void signup_with_valid_name_and_invalid_email_and_password() {
        System.out.println("signup_with_valid_name_and_invalid_email_and_password");

    }

}
