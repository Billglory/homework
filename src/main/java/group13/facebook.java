package group13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        /*
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

         */

/*

        WebElement emailInput =
                driver.findElement(By.id("email"));
        emailInput.sendKeys("123142wr15ong@email.com");

        //4. Enter incorrect password
        WebElement passwordInput =
                driver.findElement(By.id("pass"));
        passwordInput.sendKeys("wrongPassword" + Keys.ENTER);
        //5. Verify title changed to:
        //Expected: “Log in to Facebook”
        String expectedTitle = "Log in to Facebook";

        //Wait here 5 seconds for page to load before getting
        //actual title
        //You can increase time if it takes longer for you


        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!!!");
        }

        driver.close();

 */

    }

}

