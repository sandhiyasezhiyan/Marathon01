package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAmazon {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys",Keys.ENTER);
	WebElement pricedisplay = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span"));
	String text = pricedisplay.getText();
	System.out.println(text);
	String bagresults = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
	driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]")).click();
	
	driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	driver.findElement(By.linkText("Newest Arrivals")).click();
	
	
	WebElement bagname = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
	String bagname1 = bagname.getText();
	System.out.println(bagname1);
	
	WebElement discountprice = driver.findElement(By.xpath("//span[@class='a-letter-space']/following-sibling::span"));
	String discountprice1 = discountprice.getText();
	System.out.println(discountprice1);

	String title=driver.getTitle();
	System.out.println(title);

	

	
}
}
