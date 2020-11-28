package com.syntax.SeleniumClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/martaostash/Documents/SeleniumDependa/Drivers/chromedriver-2");//we're setting prorerties!!!!
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        //driver.manage().window().maximize();    //maximize the window!!! with the toptab
        driver.manage().window().fullscreen();//sameee!!! but no toptab!
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is wrong");
        }

    }
}
