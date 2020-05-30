package sanitySuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;
import pages.Syn_google_search;

public class TestCase_3_GoogleSearch extends TestBase{
	
Syn_google_search obj;
	
	@Test
	
	public void open_url() {

		log.info("Open Building Site URL.");
		driver.get(data.getProperty("base.url")); 
		PageBase.wait(5);
		log.info("email page");
		obj = new Syn_google_search (driver);
		driver.findElement(By.id("mat-input-0")).sendKeys(data.getProperty("base.username"));			
		obj.emailNext_method();
		log.info("Password");
		driver.findElement(By.id("mat-input-1")).sendKeys(data.getProperty("base.password"));
		log.info("submmit");
		obj.submmit_method();
		PageBase.wait(4);
		
	}
	
	@Test (priority=2, description = "home page")
	
	public void home_page() {

		log.info("select building");
		obj.buildingSelect_method();
		PageBase.wait(40);
		log.info("select zone");
		obj.zone_method();
		PageBase.wait(6);

	}
}
