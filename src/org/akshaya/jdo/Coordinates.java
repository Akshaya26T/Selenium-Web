package org.akshaya.jdo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coordinates {
	
  public static WebDriver driver;
  public static void main(String[] args){
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  
	  Point p =driver.findElement(By.id("u_0_r")).getLocation();
	  
	  System.out.println(p);
	  
	  System.out.println(p.getX());
	  System.out.println(p.getY());
  }

}
