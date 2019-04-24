package com.cs.selenium_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
  
    	 public static void main(String[] args) {
    	        // Create a new instance of the Firefox driver
    	        // Notice that the remainder of the code relies on the interface, 
    	        // not the implementation.
    		 
    		 
    		 
    		    System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
    		   
    	        WebDriver driver = new ChromeDriver();
    	        
    	        String url="C:\\Users\\SuperM\\workspace-myprojects\\selenium-sample\\selenium-test.html";
 
    	        driver.get(url);
    	     
    	        WebElement element = driver.findElement(By.name("uname"));
    	        element.sendKeys("Henry.Chen");

    	        element = driver.findElement(By.name("upwd"));
    	        element.sendKeys("H123");

    	        Select select = new Select(driver.findElement(By.name("utype")));
    	        select.selectByVisibleText("Administator");

     	        element = driver.findElement(By.id("btnSubmit"));
    	        element.submit();
    	        
    	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
    	            public Boolean apply(WebDriver d) {
    	            	
    	                return (d.getTitle().indexOf("selenium")>=0?true:false);
    	            }
    	        });
 
    	        System.out.println("Page title is: " + driver.getTitle());
    	        
    	        
    	        System.out.println("Page title is: " + driver.getTitle());
    	     
    	        driver.quit();
    	    }
    }
 
