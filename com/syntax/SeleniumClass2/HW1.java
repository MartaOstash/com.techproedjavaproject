package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Marta");
        driver.findElement(By.id("customer.lastName")).sendKeys("Ostash");
        driver.findElement(By.id("customer.address.street")).sendKeys("2020 Midwood ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn, New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0987654321");
        driver.findElement(By.id("customer.ssn")).sendKeys("4567897");
        driver.findElement(By.name("customer.username")).sendKeys("OstMarta");
        driver.findElement(By.name("customer.password")).sendKeys("555Marta");
        driver.findElement(By.name("repeatedPassword")).sendKeys("555Marta");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();





    }
}
