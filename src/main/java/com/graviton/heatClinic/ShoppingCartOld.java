package com.graviton.heatClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartOld {
    public static void main(String [] args) throws InterruptedException {
/*
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(1000);


        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();
        //Thread.sleep(1000);

        System.out.println("print here1");

        WebElement myElement_email = driver.findElement(By.id("username"));
        myElement_email.clear();

        myElement_email.sendKeys("m.raian1593@outlook.com");
        Thread.sleep(1000);
        System.out.println("print here2");


        WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElement_password.sendKeys("Test.1234");
        Thread.sleep(1000);

        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        myElement_rememberMe.click();
        Thread.sleep(1000);



        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElement_login.click();
        Thread.sleep(1000);

        WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        greenGhostAddCart.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//div/button/span)[5]")).click();
        //Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='sectionsNav']/div/div[1]/ul[2]/li[4]/ul/li[3]/a")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        //Thread.sleep(1000);

        String shippingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
        System.out.println("Shipping Text: " + shippingText);
        Thread.sleep(1000);


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
        Thread.sleep(1000);

        Select state = new Select(driver.findElement(By.xpath("(//select[@name='address.stateProvinceRegion'])[1]")));
        state.selectByVisibleText("VA");
        Thread.sleep(1000);



        driver.findElement(By.xpath("(//a[@class='btn btn-primary pull-right js-submitCheckoutStage'])[2]")).click();
        Thread.sleep(1000);

        System.out.println("Print here");

        driver.quit();
    }
}
