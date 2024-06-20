package com.npu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdateTest {
	
	@Test
	public void UpdateNaukriPro() throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("usernameField")).sendKeys();
        driver.findElement(By.id("passwordField")).sendKeys();
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("View profile")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='widgetHead']/span[text()='editOneTheme']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //textarea[@id='resumeHeadlineTxt']")).sendKeys("a");
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //textarea[@id='resumeHeadlineTxt']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        Thread.sleep(1000);
        driver.quit();
        
	}

}
