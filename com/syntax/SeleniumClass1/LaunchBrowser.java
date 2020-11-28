package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");
        WebDriver driver=new ChromeDriver(); //launch teh browser
        driver.get("https://syntaxtechs.com"); //navigate to url
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title =driver.getTitle();
        System.out.println(title);
    }


}

