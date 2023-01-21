package group13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Button {
    public static void main(String[] args) {

        // WebDriver driver = WebDriver.getDriver("Chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Button 1']"));
        button1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        System.out.println("resultText.isDisplayed(),\"Clicked on button one!\" = " + resultText.isDisplayed());


    }
}
