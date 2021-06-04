package pageobjects;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j2
public class loginpageopbjects {
    WebDriver driver;


        By username = By.id("user_login");
        By userpasswoed =By.id("user_password ");
        By signinbutton =By.xpath("//input[@value='Sign in']");

    public loginpageopbjects(WebDriver driver){

        this.driver =driver;

    }
    public void loginApp(String u, String p){
        driver.findElement(username).sendKeys(u);
        driver.findElement(userpasswoed).sendKeys(p);
        driver.findElement(signinbutton).click();
        log.info("Login in to the app using username: " + u + " password: " + p);

    }
}
