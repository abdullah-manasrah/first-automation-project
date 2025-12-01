package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myfirstproject {

	WebDriver driver = new EdgeDriver();
	
	String thewebsite = "https://automationexercise.com/";
	
	String Name = "test";
	String Email = "abdullahtest@test";
	String Password = "test@1234";
	String LastName = "test";
	String CompanyName = "psut";
	String addres = "irbid-jordan";
	String State = "aydoun";
	String City = "irbid";
	String Zipcode = "02184";
	String MobileNumber = "0790121475"; 
	
//	String  ;
	@BeforeTest
public void mySetup() {
		
		driver.get(thewebsite);
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 1)
	public void signup() throws InterruptedException {
		
		WebElement loginsignupbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		
		loginsignupbutton.click();
		
		WebElement newusernameinputfield = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")); 
		WebElement newemailinputfield = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		WebElement signupbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		
		
		newusernameinputfield.sendKeys(Name);
		newemailinputfield.sendKeys(Email);
		Thread.sleep(2000);
		signupbutton.click();
		
		
		
		WebElement gendercheckbox = driver.findElement(By.id("id_gender1"));
		WebElement newpasswordinputfield = driver.findElement(By.id("password")); 
		
		Select day = new Select(driver.findElement(By.id("days")));
		Select month = new Select(driver.findElement(By.id("months")));
		Select year = new Select(driver.findElement(By.id("years")));
		
		WebElement newscheckbox = driver.findElement(By.id("newsletter"));
		WebElement offerscheckbox = driver.findElement(By.id("optin"));
		WebElement firstnameinputfield = driver.findElement(By.id("first_name"));
		WebElement lastnameinputfield = driver.findElement(By.id("last_name"));
		WebElement companynameinputfield = driver.findElement(By.id("company"));
		WebElement firstaddresinputfield = driver.findElement(By.id("address1"));
		WebElement secondaddresinputfield = driver.findElement(By.id("address2"));
		
		Select country = new Select(driver.findElement(By.id("country")));
		
		WebElement stateinputfield = driver.findElement(By.id("state"));
		WebElement cityinputfield = driver.findElement(By.id("city"));
		WebElement zipcodeinputfield = driver.findElement(By.id("zipcode"));
		WebElement mobilenumberinputfield = driver.findElement(By.id("mobile_number"));
		
		WebElement createaccountbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		
		gendercheckbox.click();
		newpasswordinputfield.sendKeys(Password);
		
		day.selectByVisibleText("13");
		month.selectByVisibleText("July");
		year.selectByVisibleText("1998");
		
		newscheckbox.click();
		offerscheckbox.click();
		
		firstnameinputfield.sendKeys(Name);
		lastnameinputfield.sendKeys(LastName);
		companynameinputfield.sendKeys(CompanyName);
		firstaddresinputfield.sendKeys(addres);
		secondaddresinputfield.sendKeys(addres);
		
		country.selectByVisibleText("Singapore");
		
		stateinputfield.sendKeys(State);
		cityinputfield.sendKeys(City);
		zipcodeinputfield.sendKeys(Zipcode);
		mobilenumberinputfield.sendKeys(MobileNumber);
		
		Thread.sleep(2000);
		
		createaccountbutton.click();
		
		WebElement continuetbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		continuetbutton.click();
		
	}
	
	
	@Test (priority = 2)
	public void logout() throws InterruptedException {
		
		WebElement logoutbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Thread.sleep(1000);
		logoutbutton.click();
		
	}
	
	@Test (priority = 3)
	public void login() throws InterruptedException {
		
		WebElement emailinputfield = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]")); 
		WebElement passwordinputfield = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]"));
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		
		emailinputfield.sendKeys(Email);
		passwordinputfield.sendKeys(Password);
		Thread.sleep(2000);
		loginbutton.click();
	}
	
	
	@Test (priority = 4)
	public void deleteaccount() {
		
		WebElement deleteaccountbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		
		deleteaccountbutton.click();
		
		WebElement continuetbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		
		continuetbutton.click();
	}
	
	@AfterTest
	public void aftertest() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
