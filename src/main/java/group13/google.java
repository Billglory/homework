package group13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement clickOnGmail = driver.findElement(By.linkText("Gmail"));

        clickOnGmail.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verificaiton is successful!");
        }else {
            System.out.println("Title verificaiton is NOT successful!!!");
        }

        driver.navigate().back();

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (expectedTitle2.equals(actualTitle2)){
            System.out.println("2nd title verification is successful!");
        }else{
            System.out.println("2nd Title verificaiton is NOT successful!!!");
        }



    }

}
