package com.graviton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello Maven......");
       // System.setProperty("webdriver.gecko.driver","/Users/mraian/Driver/geckodriver");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.apartments.com/");
        Thread.sleep(5000);

        ////formula: tagName[@attribute ='value']
        driver.findElement(By.xpath("//a[@title='Sign In']")).click();
        Thread.sleep(5000);

        System.out.println("I am from Virginia");
        driver.quit();
    }
}
