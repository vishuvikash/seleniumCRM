package sele252;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("firstsale123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("firstsale123");
		driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
		//driver.findElement(By.xpath("/html/body/header/div[2]/div/div[3]/div/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));

	}

}
