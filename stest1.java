package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class stest1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		 WebElement signIn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a"));
		 signIn.click();
		 WebElement userName = driver.findElement(By.id("login_field"));
		 WebElement password = driver.findElement(By.id("password"));
		 userName.sendKeys("saitapaswee.sreeram@gmail.com");
		 password.sendKeys("Rohith@1991");
		 WebElement loginId = driver.findElement(By.name("commit"));
		 loginId.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement newRep = driver.findElement(By.xpath("/html/body/div[4]/div/aside/div[2]/div[1]/div/h2/a"));
		 newRep.click();
		 
		 WebElement repName = driver.findElement(By.xpath("/html/body/div[4]/main/div/form/div[2]/auto-check/dl/dd/input"));
		 repName.sendKeys("TestRep4");
		 
		 Thread.sleep(2000);
		 
		 WebElement crRep = driver.findElement(By.xpath("/html/body/div[4]/main/div/form/div[4]/button"));
		 
		crRep.click();
		
		WebElement settings = driver .findElement(By.xpath("/html/body/div[4]/div/main/div[1]/nav/ul/li[9]/a"));
		
		settings.click();
		
		Thread.sleep(2000);
		
		WebElement delete = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div/div[2]/div/div[10]/ul/li[4]/details/summary"));
		
		delete.click();
		Thread.sleep(2000);
		
  WebElement verify = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div/div[2]/div/div[10]/ul/li[4]/details/details-dialog/div[3]/form/p/input"));
		
		verify.sendKeys("SaiTapaswee/TestRep4");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div/div[2]/div/div[10]/ul/li[4]/details/details-dialog/div[3]/form/button/span[1]"));
		
		submit.click();
	
	
	 
		
	}
}


