package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //
    //1-launch the browser, navigate to amazon--> print the title anf url
    //
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2"); //creating the path


        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://amazon.com"); //navigate to url
        String url = driver.getCurrentUrl(); //get the url
        System.out.println(url);    //print the url
        String title = driver.getTitle(); // get the title of the site
        System.out.println(title); //print the title

    }
}