package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1class {
	public static void main(String[] args) {
		//String projectLocation = System.getProperty("user.dir");
		//System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\I066337\\Desktop\\Prapthi\\PROJECTS\\Selenium\\geckodriver-v0.29.1-win64");
		//WebDriver Chrome = new ChromeDriver();
		WebDriver Driver = new FirefoxDriver();
		//Chrome.get("https://apiportaldevsaturnxmjlqwr0ig-ed50aclw58.int.sap.eu2.hana.ondemand.com/shell/develop");
		
		Driver.get("https://apiportaldevsaturnxmjlqwr0ig-ed50aclw58.int.sap.eu2.hana.ondemand.com/shell/develop");
		System.out.println("hi rk");
	}
}
