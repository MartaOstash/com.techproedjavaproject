package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        String title= driver.getTitle();
        System.out.println(title);


        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_b")).sendKeys("Marta");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_d")).sendKeys("Ostash");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("0986545678");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("555Marta");
        driver.findElement(By.id("u_1_9")).click();
        Thread.sleep(2000);
        driver.close();






    }
}
