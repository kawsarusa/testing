package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/Users/jarrellsimon/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle().contains("facebook"));
		driver.findElement(By.id("email")).sendKeys("kawsar_faith@yahoo.com.au");
		driver.findElement(By.id("pass")).sendKeys("hggghhghv");
		driver.findElement(By.xpath("//input[@value='log In']")).click();
		
	}

}
