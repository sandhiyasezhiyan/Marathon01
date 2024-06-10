package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//div[text() = 'Chennai']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//div[text() = 'Hyderabad']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).sendKeys("18/03/2024");
	driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
	Thread.sleep(3000);
	WebElement FirstresultingBus = driver.findElement(By.xpath("//h5[text()='TSRTC']"));
	String FirstresultingBus1 = FirstresultingBus.getText();
	System.out.println(FirstresultingBus1);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	Thread.sleep(3000);
	WebElement seats =  driver.findElement(By.xpath("//small[text()='26']"));
	String FirstResultingbusseats = seats.getText();
	System.out.println(FirstResultingbusseats);
	
	driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
	driver.findElement(By.xpath("//span[text()='L3']")).click();
	
	WebElement boardingpoint = driver.findElement(By.xpath("//span[text()='Chennai Madhavaram Bus Terminus']"));
	String FirstResultingbusBoardingpoint = boardingpoint.getText();
	System.out.println(FirstResultingbusBoardingpoint);
	
	WebElement Droppingpoint = driver.findElement(By.xpath("//span[text()='L.b.nagar- C.coffee Day']"));
	String FirstResultingbusDroppoint = boardingpoint.getText();
	System.out.println(FirstResultingbusDroppoint);
	
	String BaseFare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
	System.out.println(BaseFare);
	
	String SeatsSelected = driver.findElement(By.xpath("//span[@class='text-primary']")).getText();
	System.out.println(SeatsSelected);
	
	System.out.println(driver.getTitle());
	
	
	
	 
}
}
