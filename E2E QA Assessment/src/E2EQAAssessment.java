import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2EQAAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code-
		
				// Create Driver object for chrome browser
				// we will strictly implement methods of webdriver
				
				/* class name = ChromeDriver
						""
						X driver=new X();*/
				//invoke .exe file first
				
				System.setProperty("webdriver.chrome.driver", "C:\\Work Selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("https://etsy-react-client.surge.sh");//Hit URL on the Browser
				System.out.println(driver.getTitle());//Validate if Page Title is correct
				
				//System.out.println(driver.findElements(By.tagName("a")).size());
				driver.findElement(By.linkText("ABOUT THE DEVELOPER")).click();
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\'app\']/div/div/h2")).getText());
				
				//System.out.println(driver.findElements(By.tagName("a")).size());
				
				WebElement linksdriver=driver.findElement(By.xpath("//*[@id=\'app\']/div/div/ul"));
				
				System.out.println(linksdriver.findElements(By.tagName("a")).size());
				
				List<WebElement> alllinks=linksdriver.findElements(By.tagName("a"));
				
				for(WebElement link:alllinks)
					System.out.println(link.getText());
				
				driver.findElement(By.linkText("SEARCH ETSY CATALOG")).click();
				System.out.println(driver.findElement(By.xpath("//*[@id=\'app\']/div/div/h2")).getText());
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\'full-width\']")).getAttribute("placeholder"));
				
				try {
					driver.findElement(By.xpath("//*[@id=\'app\']/div/div/button/span[1]"));
					System.out.println("Search button  Exist");
				}
				catch(NoSuchElementException e) {
					System.out.println("Search button does not Exist");
				}
				
				
				WebElement etsylinksdriver=driver.findElement(By.xpath("//*[@id=\'app\']/div/div/ul"));
				System.out.println(etsylinksdriver.findElements(By.tagName("a")).size());
				
				List<WebElement> etsylinks=etsylinksdriver.findElements(By.tagName("a"));
				
				for(WebElement link:etsylinks)
					System.out.println(link.getText());
				
				
				driver.findElement(By.xpath("//*[@id=\'full-width\']")).sendKeys("Disney");
				
				driver.findElement(By.xpath("//*[@id=\'app\']/div/div/button/span[1]")).click();
				
					
				WebElement newlinksdriver=driver.findElement(By.xpath("//*[@id=\'app\']/div/div/ul"));
				System.out.println(newlinksdriver.findElements(By.tagName("a")).size());
				
				WebDriverWait w =new WebDriverWait(driver,10);
				w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
				
								
				List<WebElement> newlinks=newlinksdriver.findElements(By.tagName("a"));
				
				for(WebElement link:newlinks)
					System.out.println(link.getText());
				
				driver.quit();
				
	}
	

}   




	

