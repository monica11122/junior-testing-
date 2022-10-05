
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
@Test
	public void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		driver.findElement(By.id("input")).sendKeys("Cars in London");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button/div/span/svg")).click();
		List<WebElement> adlinks = driver.findElements(By.tagName("span"));
		int adlinksCount = adlinks.size();
		System.out.println("ad links number is : " + adlinksCount);
		int i;Object expectedresult; String actualresult="true";
		for (i=0 ; i < adlinksCount ; i++ );
		{
			driver.findElements(By.tagName("span")).get(i).click();
			expectedresult = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).getText();
			if ((boolean) (expectedresult ="Cars in London") )  {
			 expectedresult = "false";
				
			}
			else expectedresult ="true";
			assertEquals(expectedresult,actualresult);
			driver.close();
			driver.get("www.google.com");
			driver.findElement(By.id("input")).sendKeys("Cars in London");
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button/div/span/svg")).click();
		}
	 
	
	
	}


}


