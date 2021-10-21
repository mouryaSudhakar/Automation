import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Laptop {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe\\");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com/");

	File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

    File dest=new File("D:\\Software\\ScreenShot\\sudha.jpg");

    FileHandler.copy(src,dest);

    

}
}
