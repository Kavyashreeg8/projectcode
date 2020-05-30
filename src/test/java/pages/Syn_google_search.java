package pages;

import java.util.List;

import org.openqa.selenium.By;

/*******************************************************************************************
 * Page Factory class Template
 * @author Shirish Kawatkar
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;


public class Syn_google_search extends PageBase {

	public Syn_google_search(WebDriver driver) {
		super(driver);
	}

	/*******************************************************************************************
	 * All WebElements are identified by @FindBy annotation
	 *******************************************************************************************/

	WebDriver driver;
	// Web Element for Google Search Box
	
	@FindBy(id = "mat-input-0")
	WebElement emailId;
	
	@FindBy(xpath = "//div[@class='mat-form-field-suffix ng-tns-c2-0 ng-star-inserted']/fa-icon")
	WebElement emailNext;
	
	@FindBy(id = "mat-input-1")
	WebElement passWord;
	
	@FindBy(xpath = "//button[@class='btn signInBtn mat-raised-button mat-button-base ng-star-inserted']")
	WebElement submmit;
	
	@FindBy(id = "r:5ec29a32a975f4517771da27 DL2600_530_staging_19_49")
	WebElement buildingSelect;
	
	//div[@class='fs-topbar__logo__topnav__dropdown']/button/span/span
	
	/*FindBy(xpath = "//li[@class='tcom-global-navigation__menu-option tcom-global-navigation__menu-option--active']/a/span")
	WebElement openPage;*/
	
//	@FindBy(linkText = "BUILDINGS")
	
	@FindBy(xpath="//div[@class='sidenav-wrapper']/nav/ul/li[2]/a")
	WebElement buildingMenu;
	
	@FindBy(xpath="//div[@class='sidenav-wrapper']/nav/ul/li")
	WebElement heapMenu;
	
	@FindBy(id= "add_vacation")
	WebElement addVacation;   //div[@class='sidenav-wrapper']/nav/ul/li[2]
	
	@FindBy(id= "vacation_name")  
	WebElement vacationName;
	
	@FindBy(xpath = "(//div[@class='calendar left ng-star-inserted']/div/table/tbody)1/tr/td[not(contains(@class,'off disabled invalid ng-star-inserted'))]")
	WebElement startDate;
	
	//div[@class='calendar left ng-star-inserted']/div/table/tbody/
	
	
	
	@FindBy(id= "save_vacation_changes")
	WebElement vacationSave;
	
	@FindBy(xpath="//div[@class='fs-topbar__logo__topnav__dropdown']/button/span/span")
	WebElement logOut;
	
	@FindBy(linkText = "Mobiles on a plan")
	WebElement mobilesOnPlan;
	
	
	@FindBy(xpath = "(//div[@class='calendar left ng-star-inserted']//div//table/tbody)[1]//tr//td[not(contains(@class,'off'))]//span[contains(text(), '16')]")
	WebElement start;
	
	@FindBy(xpath = "//div[@class='col first col-100-c0 product-grid clearfix']/a[2]")
	WebElement start1;
	
	@FindBy(id= "vacation_name")
	WebElement existingName;
	
	@FindBy(id= "clear_vacation_name")
	WebElement cancelSave;
	
	@FindBy(xpath= "//div[@class='fs-vacations__body']/table/tbody/tr/td[4]")
	WebElement editVacation;
	
	@FindBy(id= "clear_vacation_name")
	WebElement clearName;
	
	@FindBy(id= "vacation_name")
	WebElement editName;
	
	@FindBy(xpath= "//div[@class='fs-vacations__body']/table/tbody/tr[2]/td[4]")
	WebElement editVariation;
	
	@FindBy(id= "vacation_name")
	WebElement editBuilding88;
	
	///// Zone Operation /////////
	//////////////////////////////
	
	@FindBy(xpath="//div[@class='sidenav-wrapper']/nav/ul/li[4]")
	WebElement zone;
	
	@FindBy(id= "add_vacation")
	WebElement add_zone_vacation;
	
	@FindBy(id= "vacation_name")
	WebElement add_zoneName_vacation;
	
	@FindBy(id= "save_vacation_changes")
	WebElement save_zone_vacation;
	
	
	@FindBy(id= "r:5ec29b18a975f4517771db02 Zone1")
	WebElement zone1;
	
	
	// Web Element for Google Search first option
	@FindBy(xpath = "//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[1]/div[1]/div/span")
	WebElement searchFirstOption;

	
	
	/*******************************************************************************************
	 * All Methods for performing actions
	 * @return 
	 *******************************************************************************************/
	
	
  /*	public void emailId_method(){
		log.info("Open page");
		emailId.sendKeys(data.getProperty("base.username"));
		
		
	} */

	public void emailNext_method(){
		log.info("Open page");
		emailNext.click();
		
	}
	
	public void passWord_method(){
		log.info("Open page");
		passWord.sendKeys("base.password");
		
	}
	
	public void submmit_method(){
		log.info("Open page");
		submmit.click();
		
	}
	
	public void buildingSelect_method(){
		log.info("Open page");
		buildingSelect.click();
	}
	
	public void buildingMenu_method(){
		log.info("Open page");
		buildingMenu.click();
	}
	
	
	public void logOut_method() {
		log.info("Open page");
		logOut.click();
	}
	
	public void addVacation_method() {
		log.info("vacation");
		addVacation.click();
	}
	
	public void vactionName_method() {
		log.info("vacatio name");
		vacationName.sendKeys("Building3");
	}

	public void vacationSave_method(){
		log.info("save");
		vacationSave.click();
		
	}
	
	public void existingName_method(){
		log.info("Building1");
		existingName.sendKeys("Building1");
		
	}	
	
	public void cancelSave_method(){
		log.info("save");
		cancelSave.click();
		
	}
	
	
	public void editVacation_method(){
		log.info("edit vacation");
		editVacation.click();
		
	}
	
	public void clearName_method(){
		log.info("cancel vacation name");
		clearName.click();
		
	}
	
	public void editName_method(){
		log.info("Building2");
		editName.sendKeys("Building2"); 
		
	}	
	
	public void editVariation_method(){
		log.info("edit Building");
		editVariation.click(); 
		
	}	
	
	public void editBuilding88_method(){
		log.info("edit Building");
		editBuilding88.sendKeys("Building88");
		
	}	
	
	
	///// Zone Operation /////////
	//////////////////////////////
	
	
	public void zone_method(){
		log.info("edit Building");
		zone.click(); 
		
	}
	
	public void add_zone_vacation_method() {
		log.info("add zone vacation");
		add_zone_vacation.click();
	}
	
	public void save_zone_vacation_method() {
		log.info("save zone vacation");
		save_zone_vacation.click();
	}
	
	public void add_zoneName_vacation_method() {
		log.info("add_zoneName_vacation");
		add_zoneName_vacation.sendKeys("Zone1");
	}
	
	
	public void heapMenu_method() {
		log.info("heap page");
		heapMenu.click();
	}
	
	public void zone1_method() {
		log.info("click on zone1");
		zone1.click();
	}

	/*	public void calendar_method(){
		
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
		        
	}  			*/
		
	
public void start_method(){
		log.info("date start page");
	start.click();

		
	}
	
/*river.switchTo().alert().sendKeys("Text");
	
	public void mobilesOnPlan_method(){
		log.info("Open page");
		mobilesOnPlan.click();
		
	}
	
	public void mobileNext_method(){
		log.info("Open page");
		mobileNext.click();
	}
	
	
	public void mobileMoto_method(){
		log.info("Open page");
		mobileMoto.click();
	} */
	
/*ublic void enter_text(String Search_text){
		
		log.info("Enter text to search: "+Search_text);
		searchBox.sendKeys(Search_text);
		
	}
	
	public String get_first_option(){
		log.info("Select first option displayed by google search");
		return searchFirstOption.getText();
		
	}
	
	public void select_first_option(){
		log.info("Select first option displayed by google search");
		searchFirstOption.click();
		
	}

	/*******************************************************************************************
	 * This POM method will be exposed in test case
	 * @param 
	 *******************************************************************************************/

/*public void search_by_first_option(String text_to_search) {

		this.enter_text(text_to_search);
		
	}
	
	public void click_on_first_search_option () {

		this.select_first_option();
		
	}*/

	public void search_option () {

	//this.select_first_option();
		
		WebElement table = driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody"));
		String c= table.getText();
		//System.out.println(c);
		List<WebElement> rowNumberList = table.findElements(By.tagName("tr"));
		int rowSize= rowNumberList.size();
		System.out.println("Row Size" +rowSize);
		for(int i=1; i<=rowSize; i++) {
			String value= driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody[1]/tr["+i+"]/td[2]")).getText();
			System.out.println(value);
			if(value.equals("13 Aug 20")) {
				System.out.println("Value found is " + value);
				driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody/tr["+i+"]/td[5]")).click();
			log.info("delete Vacation");
				PageBase.wait(2);
				driver.findElement(By.className("confirmation-dialog__buttongroup__ok")).click();
			log.info("dialog OK");
				break;
			}
		}
		
	}
}
