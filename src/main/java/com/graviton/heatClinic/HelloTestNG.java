package com.graviton.heatClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HelloTestNG {
    static WebDriver driver;
    static String email = "allgood99@me.com";
    static String expectedRegText = "Don't have an account yet? Sign up for one now to gain access to all our member tools.";
    static String name = "awesome";

/*
    @Test
    public static void registerPage() throws InterruptedException {
        System.out.println("Laughing is the best medicine");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://demo.broadleafcommerce.org/");
        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        //Thread.sleep(100);
        loginBtn.click();
        // Thread.sleep(100);

        WebElement actualTextElement = driver.findElement(By.xpath("//*[@id='register']/p"));
        String actualText = actualTextElement.getText();
        System.out.println(actualText);

        Assert.assertEquals(actualText,expectedRegText);


        WebElement registerEmailInput = driver.findElement(By.xpath("//input[@id='customer.emailAddress']"));

        // Thread.sleep(100);
        registerEmailInput.sendKeys(email);

        WebElement firstNameInput = driver.findElement(By.id("customer.firstName"));
        //Thread.sleep(100);
        firstNameInput.sendKeys(name);


        WebElement lastNameInput = driver.findElement(By.name("customer.lastName"));
        Thread.sleep(100);
        lastNameInput.sendKeys("Taniya");

        //If there are multiple elements for the same locators, so you need to save it in a LIST and use findElement(s) instead of findElement
        //Multiple locators use indexes to save the value in list.
        // To get the second element you need to use get method and put the index number in the parameter 2nd element = index 1.

        List<WebElement> passList = driver.findElements(By.id("password"));
        WebElement passwordInput = passList.get(1);
        Thread.sleep(3000);
        passwordInput.sendKeys("abcdef0704");

        WebElement conPasswordInput = driver.findElement(By.id("passwordConfirm"));
        Thread.sleep(100);
        conPasswordInput.sendKeys("abcdef0704");


    }

    @Test
    public static void registerPageTest() throws InterruptedException{
        List<WebElement> submitList = driver.findElements(By.xpath("//button[@type='submit']"));
        WebElement registerBtn = submitList.get(2);
        Thread.sleep(100);
        registerBtn.click();
        Thread.sleep(3000);

        String actualName = driver.findElement(By.xpath("//*[@id='sectionsNav']/div/div[1]/ul[2]/li[1]/a")).getText().toLowerCase();

        Assert.assertTrue(actualName.contains(name));

        driver.quit();
        System.out.println("Registration Completed!!!");

    }

 */
    //testing login
    @Test
    public static void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.broadleafcommerce.org/");

        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();
       // Thread.sleep(1000);


        WebElement myElement_email = driver.findElement(By.id("username"));
        myElement_email.clear();

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

        //driver.quit();

    }
    @Test
    public static void aboutUS () throws InterruptedException{
/*
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.broadleafcommerce.org/");


 */
        driver.findElement(By.xpath("//a[@href='/about_us']")).click();
        Thread.sleep(5000);
        String actual_textAboutUs =  driver.findElement(By.xpath("(//div[@class='container'])[3]/div")).getText();

        String expected_textAboutUs = "test content";

        Assert.assertEquals(expected_textAboutUs,actual_textAboutUs);

        driver.quit();


    }
}
