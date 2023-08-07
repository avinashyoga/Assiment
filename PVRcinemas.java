package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRcinemas {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='search-cities']")).click();
		
		
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		
		
		driver.findElement(By.xpath("//li[@class='sidebar-list-item'][6]")).click();
	}


}
