package com.xmartlabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestWithSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Ejecucion de lo que estamos realizando, instrucciones, y etc.
        driver.close();
        driver.quit();
    }
}
