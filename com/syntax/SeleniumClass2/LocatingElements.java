package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("syntax"); //passing username
        driver.findElement(By.id("pass")).sendKeys("Marta12234"); //passing password
        driver.findElement(By.name("login")).click(); //clicking on login
        Thread.sleep(2000); // adding 2 sec to wait not to get an error, cause script is faster then page loading
        //driver.findElement(By.linkText("Forgot Password?")).click();// clicking on forgot password
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}