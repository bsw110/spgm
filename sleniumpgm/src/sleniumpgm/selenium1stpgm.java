package sleniumpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1stpgm {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\selenium\\chromedriver\\chromedriver.exe");//set property for browser
		WebDriver driver =new ChromeDriver();//launch the browser
		driver.get("https://www.seleniumhq.org/");// get url
		driver.quit();// quit url page
	}

}
