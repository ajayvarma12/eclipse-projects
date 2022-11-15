package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass {
@Test
	
	public void Test_One() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ajayvarma");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("completed test one...");
		
	}

@Test
public void Test_two() {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Sachin Varma");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	System.out.println("completed test two...");
	
}
@Test
public void Login_test() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.id("placeholder")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div")).click();
	
	
}

}
