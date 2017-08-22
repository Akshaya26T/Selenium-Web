package org.akshaya.jdo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	
public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.xpath("//")));
	driver.findElement(By.xpath("/html/body/button")).click();
	
}
}