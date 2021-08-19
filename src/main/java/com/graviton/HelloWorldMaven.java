package com.graviton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldMaven {
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello Maven......");
        System.setProperty("webdriver.gecko.driver","/Users/mraian/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);

        System.out.println("I am from Virginia");
        driver.quit();
    }
}
