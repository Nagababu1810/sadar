package xml;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Login {
	@Parameters({"username","password"})
	@Test
	public void testCaseTwo(String username, String password) {
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	    WebDriver  bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys(username);
	    bo.findElement(By.name("txtPassword")).sendKeys(password);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	   bo.close();  
	}
}
