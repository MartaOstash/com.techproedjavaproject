package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");
        WebDriver driver= new ChromeDriver(); // launching the browser
        driver.get("http://google.com");     //get method is used to navigate to url
        driver.navigate().to("http://facebook.com"); //navigate().to -is used to have more options (back and forward)
        driver.navigate().back();//will launch google cause one step back
        Thread.sleep(1000);//will waits 1 sec
        driver.navigate().forward();//back to facebook
        driver.navigate().refresh(); //refreshing the page
        //driver.close(); //closes current tab
        driver.quit();   // quits whe whole browser no matter how many tabs are open





    }
}
