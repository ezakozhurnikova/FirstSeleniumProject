package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_tests {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssTest() {
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector("[title='Error']"));
        driver.findElement(By.cssSelector("[type='text/javascript']"));
        driver.findElement(By.cssSelector("[href*='1']"));
        driver.findElement(By.cssSelector("[href^='http']"));
        driver.findElement(By.cssSelector("[href$='css']"));
        driver.findElement(By.cssSelector("[src$='js']"));
        driver.findElement(By.cssSelector("[title*='Notification']"));

    }

    @Test
//  id ->xpath   //*[@id='value']
    public void findElementByXpathTest() {
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//*[@title='Error']"));
        driver.findElement(By.xpath("//*[@type='text/javascript']"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
        driver.findElement(By.xpath("//*[contains(.,'css')]"));
        driver.findElement(By.xpath("//*[contains(.,'css')]"));
        driver.findElement(By.xpath("//*[contains(.,'js')]"));
        driver.findElement(By.xpath("//*[@title='Notification']"));

    }

}
