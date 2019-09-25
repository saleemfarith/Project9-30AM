package org.cts.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B {
	static WebDriver driver;

	@BeforeClass

	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\GitThirdDay\\POM\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}



@Test
private void testcase1() {
driver.get("https://www.facebook.com/");
Assert.assertTrue(driver.getTitle().contains("Facebook"));
WebElement user = driver.findElement(By.id("email"));
user.sendKeys("Farith@gmail.com");
Assert.assertEquals("Farith@gmai.com", user.getAttribute("value"));

WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("2345456765");

WebElement button = driver.findElement(By.id("loginbutton"));
button.click();

}
}
