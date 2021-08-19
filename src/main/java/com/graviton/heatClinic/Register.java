package com.graviton.heatClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
    public static void main(String [] args) throws InterruptedException {

       // System.setProperty("webdriver.gecko.driver",""/Users/mraian/Driver/geckodriver"");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver_fireFox = new FirefoxDriver();

        driver_fireFox.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(5000);


       /*ask about this- why this doesn't work
        WebElement myElement_logIn = driver_fireFox.findElement(By.linkText("Login"));
        */
        WebElement myElement_login = driver_fireFox.findElement(By.xpath("//a[@href='/login']"));
        myElement_login.click();
        Thread.sleep(1000);


        WebElement myElement_email = driver_fireFox.findElement(By.id("customer.emailAddress"));
        myElement_email.sendKeys("m.raian1593@outlook.com");
        Thread.sleep(1000);

        WebElement myElement_firstName = driver_fireFox.findElement(By.id("customer.firstName"));
        myElement_firstName.sendKeys("Raian");
        Thread.sleep(1000);

        WebElement myElement_lastName = driver_fireFox.findElement(By.id("customer.lastName"));
        myElement_lastName.sendKeys("Azad");
        Thread.sleep(1000);

        WebElement myElement_password = driver_fireFox.findElement(By.xpath("(//input[@id='password'])[2]"));
        myElement_password.sendKeys("Test.1234");
        Thread.sleep(1000);

        WebElement myElement_confirmPassword = driver_fireFox.findElement(By.xpath("//input[@id='passwordConfirm']"));
        myElement_confirmPassword.sendKeys("Test.1234");
        Thread.sleep(1000);


        WebElement myElement_register = driver_fireFox.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[2]"));
        myElement_register.click();
        Thread.sleep(1000);


        driver_fireFox.quit();



    }
}
