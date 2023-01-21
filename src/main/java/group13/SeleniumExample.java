package group13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class SeleniumExample {

        public static void main(String[] args) {
            // 1- Setting up the web driver manager
            //We create our "Browser Driver"
            WebDriverManager.chromedriver().setup();

            //2- Create instance of the chrome driver
            WebDriver driver = new ChromeDriver();
            // Open Trendyol
            driver.get("https://www.trendyol.com");


            // Locate the search bar and input "watch"//input[@name='email']
            driver.findElement(By.id("search-box")).sendKeys("watch");
            driver.findElement(By.xpath("input[class='vQI670rJ']")).click();

            // Locate all the watch prices in the search results
            List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class, 'prc-box')]//span[contains(@class, 'prc-slg')]"));
            // Filter out the empty prices
            prices = prices.stream().filter(p -> !p.getText().isEmpty()).collect(Collectors.toList());
/*
            // Convert the list of WebElements to a list of Doubles
            List<Double> doublePrices = prices.stream().map(p -> Double.parseDouble(p.getText().replace(",", "."))).collect(Collectors.toList());

            // Find the minimum price
            double minPrice = doublePrices.stream().mapToDouble(Double::doubleValue).min().orElse(Double.MAX_VALUE);
            System.out.println("The cheapest watch price is: " + minPrice);

            // Locate the cheapest watch and click on it
            driver.findElement(By.xpath("//div[contains(@class, 'prc-box')]//span[contains(@class, 'prc-slg') and text()='" + minPrice + "']/../../../..")).click();


             */
        }

    }
