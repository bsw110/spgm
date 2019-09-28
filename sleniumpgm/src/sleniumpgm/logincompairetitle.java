package sleniumpgm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logincompairetitle{

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();  //invoke browser
        driver.get("http://newtours.demoaut.com/");   //open url     
        driver.findElement(By.name("userName")).sendKeys("mercury"); //enter username
        driver.findElement(By.name("password")).sendKeys("mercury"); //enter password
        
        driver.findElement(By.name("login")).click(); // click on sing in button
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         String exptitle="Find a Flight: Mercury Tours:";
        String acttitle =driver.getTitle(); //return the title of page
        //validation
        if(exptitle.equals (acttitle))
        	
        {
        System.out.println("test is passed");	
        }
       
        else
        {
        	System.out.println("test is failed");
        }
        driver.close();
	}   
}

	
	

        
        
        
        
        
        
        
        
        
	


