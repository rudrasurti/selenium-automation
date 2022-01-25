package com.rudra;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rudra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://demo.guru99.com/test/upload/";

		driver.get(baseURL);

		WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

		uploadElement.sendKeys("C:\\Users\\Rudra\\Downloads\\Rudra Surti.pdf");

		driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();

		driver.findElement(By.name("send")).click();

		driver.findElement(By.xpath("//h3[contains(.,'has been successfully uploaded')]"));

		Thread.sleep(5000);

		WebElement suceesMessge = driver.findElement(By.xpath("//h3[contains(.,'has been successfully uploaded')]"));
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		if (suceesMessge.isDisplayed()) {
			File file = screenshot.getScreenshotAs(OutputType.FILE);

			File changePath = new File("D:\\SS\\" + new Date().getTime());
			changePath.createNewFile();
			Files.move(file, changePath);

			System.out.println("From has been successfully uploaded");

		} else {
			System.out.println("From is not displayed displayed");
		}

		driver.quit();
	}

}