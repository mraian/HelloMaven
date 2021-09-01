package com.graviton.heatClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://demo.broadleafcommerce.org/");


        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();

        System.out.println("print here1");

        WebElement myElement_email = driver.findElement(By.id("username"));
        myElement_email.clear();
        myElement_email.sendKeys("m.raian1593@outlook.com");
        System.out.println("print here2");

        WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElement_password.sendKeys("Test.1234");

        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        myElement_rememberMe.click();

        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElement_login.click();
        Thread.sleep(5000);
        WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        greenGhostAddCart.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//div/button/span)[5]")).click();
        Thread.sleep(5000);
        System.out.println("print here3");
        driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        Thread.sleep(5000);

        String shipingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
        System.out.println("Shipping Text: " + shipingText);



        driver.findElement(By.xpath("(//input[@id='fullName'])[1]")).sendKeys("Rafi");
        //Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@id='addressLine1'])[1]")).sendKeys("123 main street");
        //Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@id='addressLine2'])[1]")).sendKeys("ap1 888");

        driver.findElement(By.xpath("(//input[@id='city'])[1]")).sendKeys("Queens");

        driver.findElement(By.xpath("(//input[@id='postalCode'])[1]")).sendKeys("11444");

        driver.findElement(By.xpath("(//input[@id='phonePrimary'])[1]")).sendKeys("3477772222");

        //Thread.sleep(1000);

        driver.findElement(By.xpath("(//span[@class='circle'])[3]")).click();
        //Thread.sleep(1000);

        Select state = new Select(driver.findElement(By.xpath("(//select[@name='address.stateProvinceRegion'])[1]")));
        state.selectByVisibleText("VA");
        Thread.sleep(1000);

        //driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a")).click();
        //driver.findElement(By.xpath("//input[@id='fulfillmentOptionId3']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Standard (5 - 7 Days)']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitCheckoutStage']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='card-content']")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitPaymentCheckoutStage']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//a[@class='btn btn-primary pull-right js-performCheckout'])[2]")).click();
        Thread.sleep(1000);

        String confirmationText = driver.findElement(By.xpath("//div[@class='card confirmation-card']")).getText();
        System.out.println("Shipping Text: " + confirmationText);


        driver.quit();


    }
}