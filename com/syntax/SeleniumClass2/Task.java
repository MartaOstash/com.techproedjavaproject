package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualTitle = driver.getTitle(); //(title is the tab name)TITLE VERIFICATION!!! -anything we get from the web page is actual value
        String expectedTitle="Web Orders";

        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title match");
        }else {
            System.out.println("Incorrect password");
        }
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
            driver.close();



    }
}

