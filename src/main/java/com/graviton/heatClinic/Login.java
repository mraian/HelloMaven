package com.graviton.heatClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(1000);


        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();
        Thread.sleep(1000);

        System.out.println("print here1");

        WebElement myElement_email = driver.findElement(By.id("username"));
        myElement_email.sendKeys("m.raian1593@outlook.com");
        Thread.sleep(5000);
        System.out.println("print here2");


        WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElement_password.sendKeys("Test.1234");
        Thread.sleep(5000);

        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        myElement_rememberMe.click();
        Thread.sleep(5000);



        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElement_login.click();
        Thread.sleep(5000);

        System.out.println("print here3");
        driver.quit();



    }
}
