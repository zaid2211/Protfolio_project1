package com.nopcommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.nopcommerce.util.WebEventListner;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver ;
	protected Properties prop;
	protected EventFiringWebDriver e_driver;
	protected WebEventListner eventListner;
	
	
	
	public TestBase(){
		prop =new Properties();
		try {
		 
			FileInputStream file =new FileInputStream("C:\\Users\\jaids\\eclipse-git\\Protfolio_project1\\src\\main\\java\\com"
					+ "\\nopcommerce\\config\\config.properties");
		prop.load(file);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@SuppressWarnings("deprecation")
	public void initialize(){
		
		if(prop.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("start-maximized");
			opt.addArguments("incognito");
			
			
			driver=new ChromeDriver(opt);
		}
		
		else if (prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		else if (prop.getProperty("browser").equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		eventListner =new WebEventListner();
		 e_driver=new EventFiringWebDriver(driver);
		 e_driver.register(eventListner);
		 driver=e_driver;
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get(prop.getProperty("url"));
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		
		
	}
	
	
}
