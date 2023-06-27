package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String MyUrl = " https://opensource-demo.orangehrmlive.com/";


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //open browser
        openBrowser(MyUrl);
        //input valid username
        Mydriver.findElement(By.name("username")).sendKeys("Admin");
        //input valid password
        Mydriver.findElement(By.name("password")).sendKeys("admin123");
        //click on submit button
        Mydriver.findElement(By.xpath("//button[@type = 'submit']")).click();

        //verify Dashboard display message
        String expectedMessage = "Dashboard";
        String actualMessage = Mydriver.findElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals("Login Error", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
