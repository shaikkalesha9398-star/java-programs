package Com.SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws IOException 
	{
		
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com/");
		        driver.manage().window().maximize();

		        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("4545123");
		        driver.findElement(By.xpath("//button[@name='login']")).click();
		        
		      //driver.close();
		      
		    }
	
		}