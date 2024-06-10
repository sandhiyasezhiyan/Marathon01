package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRcinemas {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//enter the location as chennai
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//li[contains(text(),'PVR AEROHUB Chennai')]"));
		driver.executeScript("arguments[0].click();", clk);
		Thread.sleep(3000);
		WebElement clk1 = driver.findElement(By.xpath("//li[contains(text(),'Tomorrow, 11 May')]"));
		driver.executeScript("arguments[0].click();", clk1);
		Thread.sleep(3000);
		WebElement clk2 = driver.findElement(By.xpath("//li[contains(text(),'KINGDOM OF THE PLANET OF THE APES')]"));
		driver.executeScript("arguments[0].click();", clk2);
		WebElement clk3 = driver.findElement(By.xpath("//span[text()='03:40 PM'][1]"));
		driver.executeScript("arguments[0].click();", clk3);
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
	
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[3]")).click();
		
		String BookSummary= driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();
		System.out.println(BookSummary);
		String Billamt =  driver.findElement(By.xpath("//h6[text()='82.82']")).getText();
		System.out.println(Billamt);
	}
}
