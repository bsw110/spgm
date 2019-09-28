package sleniumpgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmaillogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();// invoke browser
         driver.get("https://www.gmail.com/");// open url
         driver.manage().window().maximize(); // maximize window
         driver.findElement(By.name("identifier")).sendKeys("wankhede.shailesh134@gmail.com");// enter email
         WebDriverWait wait =new WebDriverWait(driver, 20);               

         driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();// click next
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);        
         WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
         password.sendKeys("bunty@2019");   // enter password         

         driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click(); // enter password


         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.close();
      
		
		
	}

}
