package com.selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RodanTest{
	@Test
	public void testrodan() throws InterruptedException{
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.rodanandfields.com/ca");
	Actions action=new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[2]/a"))).build().perform();
	driver.findElement(By.xpath("html/body/main/header/div[1]/nav/div/div[1]/ul[2]/li[2]/ul/li[2]/div/a")).click();
    driver.findElement(By.xpath("//input [@id='sponserparam']")).sendKeys("mary");
    driver.findElement(By.xpath("//button [@id='search-sponsor-button']")).click();
   
    //driver.findElement(By.xpath("//span[@class='btn btn-primary current']")).click();
     
    
   
   // driver.findElement(By.xpath("html/body/main/section/div/div/div[3]/div/div[2]/div/div[3]/div[1]/div/div/a[1]")).click();
    //String g=driver.getCurrentUrl();
   // Assert.assertTrue("https://www.rodanandfields.com/ca/businessSys/searchSponser/SelectSponsorPage".equals(g));
   // System.out.println("gerat");
}
	 @Test
	 public void testRoadan1() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.rodanandfields.com/ca");
	  Actions actions=new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath("//a [@id='our-products']"))).build().perform();
	      driver.findElement(By.xpath("//a [@ title='All Products']")).click();
	      //Select sel =new Select
	      driver.findElement(By.xpath("//input [@id='CAD$50 TO CAD$199.99']")).click();
	  driver.findElement(By.xpath(".//*[@id='dropdown-menu']/li[7]/div/a")).click();
	  driver.findElement(By.xpath("//input[@tabindex='2']")).click();
	  driver.findElement(By.xpath(".//*[@id='quick-refine']/div[2]/div[2]/ul/li[2]/form/div/div[1]/div[2]/div")).click();
	 
	     String price=driver.findElement(By.xpath(".//*[@id='main-content']/div[5]/div[2]/p/span")).getText();
	     Assert.assertTrue(price.contains("CAD$ 81.00"));
	     System.out.print("verified");
	     
	 }

	}
