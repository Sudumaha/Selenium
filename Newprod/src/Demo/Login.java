package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver cd = WebDriverManager.chromedriver().create();
		cd= new ChromeDriver();
		cd.get("https://www.facebook.com");
		//sihjsjks
		
	}

	}


