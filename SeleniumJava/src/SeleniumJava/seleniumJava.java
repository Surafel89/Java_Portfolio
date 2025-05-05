package SeleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class seleniumJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Opens google chrome
      WebDriver driver=new ChromeDriver();
      WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(40));
     
      //opens the specific web page to be tested 
     driver.get("https://www.thelocal.se/membership-offer");
     // driver.get("https://www.google.com");
      driver.findElement(By.className("cmptxt_btn_yes")).click();
      driver.manage().window().maximize();
     
     
      //Testing Membership Plan
    
  
      Thread.sleep(9000);
      WebElement Iframe3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='buy.tinypass.com']")));
      driver.switchTo().frame(Iframe3);
      WebElement basicMembership = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[20]/div[2]/div/div/div[3]/section[2]/div[1]/a/div")));
      basicMembership.click();
      Thread.sleep(9000);
      WebElement MemebershiplusBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[20]/div[2]/div/div/div[3]/section[1]/div[1]/a/div")));
      MemebershiplusBtn.click();
     //testing both membership plans 
      
     
     //Switching to another iframe to access the login button
      Thread.sleep(9000);
      driver.switchTo().defaultContent();
      WebElement Iframe1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
      driver.switchTo().frame(Iframe1);
      WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-login")));
     loginBtn.click();
     
  
     
     //switching to default content and entering the iframe the of the modal screen login btn opens  
    
     driver.switchTo().defaultContent();
      Thread.sleep(9000);
      WebElement iframe2= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='https://id.piano.io/id/?client_id=']")));
     driver.switchTo().frame(iframe2);
    Thread.sleep(9000); 
    //testing functionality of the login process 
   WebElement enterEmail=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
   enterEmail.sendKeys("surafeldesta2489@gmail.com");
   
   WebElement nextBtn= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit'] span")));
     nextBtn.click();
     driver.switchTo().defaultContent(); 
     Thread.sleep(9000); 
     
     //close dialog box 
     WebElement closeBtn=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[aria-label='Close']")));
     closeBtn.click();
     
 	
 	 // Testing getnewsletter functionality 
     WebElement getnewsletter=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
   getnewsletter.sendKeys("vamaso4277@idoidraw.com");
   
   //scrolling down
   JavascriptExecutor js=(JavascriptExecutor) driver;	
	js.executeScript("window.scrollBy(0,1000);");
	
	
	
	WebElement getnewsletterbtn= driver.findElement(By.cssSelector("button[type='submit']")); 
	Thread.sleep(9000);
	getnewsletterbtn.click();
	
	
	
	
	
	driver.quit();
	
	
	}

}
