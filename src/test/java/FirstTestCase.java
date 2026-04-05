import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws AWTException, IOException {		
		WebDriver driver=new ChromeDriver();
		driver.get("https://helloskillio.com/assignment/");
		driver.manage().window().maximize();
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("usingselenium.png"));*/
		Rectangle rec=new Rectangle(1920, 1080);
		Robot robo=new Robot();
		BufferedImage image=robo.createScreenCapture(rec);
		ImageIO.write(image, "png", new File("usingRobot.png"));
		
		
	}
	

}
