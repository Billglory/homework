package group13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nextbasecrm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://login1.nextbasecrm.com/");
//<input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String actualLoginButton=   loginButton.getAttribute("value");
        String expectedLoginButton= "Log In";

        if(actualLoginButton.equals(expectedLoginButton)){
            System.out.println("Login button text passed");
        }else{
            System.out.println("Login button text failed");
        }
    }
}
