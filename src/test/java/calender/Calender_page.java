package calender;



import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.PageBase;
import base.TestBase;
import pages.Syn_google_search;

@Test
public class Calender_page extends TestBase {
	public void open_url() {
		log.info("Open Building Site URL.");
		driver.get(data.getProperty("base.url"));
		PageBase.wait(10);
		driver.findElement(By.xpath("//div[@class='widgetSection appendBottom40']/div[2]/div/div[3]/label")).click();
		// driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
		// String
		// month=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div/div")).getText();
	String month = driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']"))
			.getText();
	System.out.println(month);
		while (!month.contains("August 2020")) {
			System.out.println(month);
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
			month = driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']"))
					.getText();
		}

		/*
		 * if (!driver.findElement(By.
		 * cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText
		 * ().contains("July 2020")) {
		 * driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).
		 * click(); }
		 */
	//	month = driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText();
	//	System.out.println(month);
		
	//	PageBase.wait(5);
		
	//	driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div[2]/div[6]")).click();
		
		
		
		List<WebElement> date1 = driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Week'] [class='DayPicker-Day']"));
		int count = date1.size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Week'] [class='DayPicker-Day']")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("13")) {
				driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Week'] [class='DayPicker-Day']")).get(i).click();
				break;
			}
		}
	/*	List<WebElement> date1 = driver.findElements(By.className("DayPicker-Day"));
		int count = driver.findElements(By.className("DayPicker-Day")).size();
		for (int i = 0; i < 30; i++) {
			String text = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("5")) {
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}*/
		

		/*
		 * String month
		 * =driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText();
		 * System.out.println(month); if(month.contains("May 2020")) { List<WebElement>
		 * date1 = driver.findElements(By.className("DayPicker-Day")); int count
		 * =driver.findElements(By.className("DayPicker-Day")).size(); for (int i=0;
		 * i<count; i++) { String text=
		 * driver.findElements(By.className("DayPicker-Day")).get(i).getText();
		 * System.out.println(text); if(text.equalsIgnoreCase("17")) {
		 * driver.findElements(By.className("DayPicker-Day")).get(i).click(); break;
		 * 
		 * 
		 * } }
		 * 
		 * } else {
		 * 
		 * driver.findElement(By.xpath("//div[@class='DayPicker']/div/div/span[2]")).
		 * click(); }
		 */

	}
}