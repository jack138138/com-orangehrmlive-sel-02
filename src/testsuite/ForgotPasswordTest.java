package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends LoginTest{

    @Before
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //open browser
        openBrowser(MyUrl);
        //clcik on forget password
        Mydriver.findElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //verify display message
        String expectedText = "Reset Password";
        String actualText = Mydriver.findElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals("Error Message Displayed ", expectedText,actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
