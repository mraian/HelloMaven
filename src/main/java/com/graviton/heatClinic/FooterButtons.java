package com.graviton.heatClinic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterButtons {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(1000);

        /*
        regular relative xpath
         */
        //driver.findElement(By.xpath("//a[@href='/about_us']")).click();

        /*
        Parents to child traverse: where the current node/element's doesn't have unique attribute but the parent has unique attribute use
        this method
         */
       // driver.findElement(By.xpath("//footer[@class='group']/div[1]/nav/ul/li[1]")).click();


        /*
        XPath axes
        following-sibling
        where your target element's attribute is dynamic and parent's attribute is also dynamic
         */



        Thread.sleep(1000);
        driver.quit();
    }
}
