package stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.loginpageopbjects;

import java.util.concurrent.TimeUnit;
@Log4j2
public class stepdef {
    WebDriver driver;
    int timeout =20;
    Scenario scenario;
    String baseurl= "http://zero.webappsecurity.com";
    loginpageopbjects loginpageopbjects;



    @Before
    public  void SetUp(Scenario scenario){
        this.scenario =scenario;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        loginpageopbjects =new loginpageopbjects(driver);
        log.info("Chrome driver is invoked");

    }



    @After
    public void CleanUp() {
        driver.quit();
      log.info("chrome driver quit success");
    }





        @Given("I am on the login page")
    public void i_am_on_the_login_page() {

            driver.get(baseurl + "/login.html");
        log.info("Navigation to login page successful ");



    }




    @When("I login using username as {string} and password as {string}")
    public void i_login_using_username_as_and_password_as(String u, String p) {
            loginpageopbjects.loginApp(u,p);
    log.info("login using username as" + u + "and password as" +p);

            

    }
    @Then("I am able to login in the app")
    public void i_am_able_to_login_in_the_app() {
        Assert.assertEquals(driver.getTitle(),"Zero - Account Summary");
    }

}
