package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PageBase;

public class DatePicker extends PageBase{

	public DatePicker(WebDriver driver) {
		super(driver);
	}
	
	public void calendar_method(){
		
		 String month=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
	     	
			System.out.println(month);
			
		while (!month.contains("AUGUST 2020")) { 
				System.out.println(month);
				 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
				month = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
			}
			
			month = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
			System.out.println(month);
			PageBase.wait(3);
		
		List<WebElement> dateAv = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]"));
	       int countAv=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).size();
	        
	        for (int i=0; i<countAv; i++) {
	        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).getText();
	        System.out.println(text);
	        if(text.equalsIgnoreCase("13")) {
	        	
	        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).click();
	       break;
	        }
	        	
	        } 
	        
	        PageBase.wait(3);
	        
	        ///end date
	        
String month1=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
	     	
			System.out.println(month1);
			
			while (!month1.contains("AUGUST 2020")) {
				System.out.println(month1);
				 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
				month1 = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
			}
			
			month1 = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
			System.out.println(month1);
			PageBase.wait(3);
			
			List<WebElement> date2 = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]"));
		       int count1=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).size();
		        
		        for (int i=0; i<count1; i++) {
		        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).getText();
		        if(text.equalsIgnoreCase("14")) {
		        	
		        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).click();
		       break;
		        }
		        	
		        } 
		
		
	}
	
}
