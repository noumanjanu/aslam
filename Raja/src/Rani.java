import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rani {

	public static void main (String args[]) throws Exception  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://183.82.103.245/nareshit/login.php");
		 System.out.println("Application opened");
		 Thread.sleep(3000);
		 
	}


}