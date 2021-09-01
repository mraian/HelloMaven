package com.graviton.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {
    public static void main(String [] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver","/Users/mraian/Driver/geckodriver");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("m.raian111593@outlook.com");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1112");

        driver.findElement(By.xpath("//input[@id='Login']")).click();
        Thread.sleep(5000);
        System.out.println("test1 ");

        System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
        //System.out.println(driver.findElement(By.xpath("(//div[contains(@id,'error')])[2]")).getText());
        //System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
        ////*[@id="error"]


        System.out.println("test 2");
        Thread.sleep(1000);
        driver.quit();




    }
}
