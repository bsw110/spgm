package sleniumpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxgettitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\selenium\\chromedriver\\chromedriver.exe");//set property for browser
		WebDriver driver =new ChromeDriver();//launch the browser
		driver.get("https://www.seleniumhq.org/");// get url
		driver.manage().window().maximize();

		 String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  
		Thread.sleep(2000);
		driver.quit();
}
}