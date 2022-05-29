package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //Get all the links (using findElements)
		 List<WebElement> list1 = driver.findElements(By.tagName("a"));
		 //Click on the first link (using get method with index as 0)
		 list1.get(0).click();
		 //Print the title
		 System.out.println(driver.getTitle());
		 // Navigate back on the browser (driver.navigate().back())
		 driver.navigate().back();
		 // Get all the links again (using findElements)
		 List<WebElement> list2 = driver.findElements(By.tagName("a"));
		 //Print the count of the links (size)
		 System.out.println("count of the elements "+list2.size());
		 // print the href value (getAttribute) of the second link
		 String hrefvalue=list2.get(2).getAttribute("href");
		 System.out.println(hrefvalue);
		 
		 driver.close();
		 
		 
		 
		 

	}

}
