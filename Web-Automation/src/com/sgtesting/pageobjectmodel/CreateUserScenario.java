package com.sgtesting.pageobjectmodel;
/*launchBrowser=>navigate=>login=>create user=>modify user=>delete user=>logout=>close application */
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUserScenario {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	@Test(priority=1)
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void  navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getCreadentials()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority=3,dataProvider="getCreadentials")

	private static void Login(String user, String pwd)
	{
		try
		{
			oPage.getUsername().sendKeys(user);
			oPage.getPwd().sendKeys(pwd);
			oPage.getoLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getUser()
	{
		return new Object[][] {{"Demo","User1","DemoUser@gmail.com","ProjectDemo","welcome123","welcome123"}};
	}
	@Test(priority=5, dataProvider="getUser")
	private static void createUser(String fname,String lname,String ename,String uname,String pname,String pcpname )
	{
		try
		{
			oPage.getoCreate().click();
			Thread.sleep(2000);
			oPage.getoAddUser().click();
			Thread.sleep(2000);						
			oPage.getFirstName().sendKeys(fname);
			Thread.sleep(2000);	
			oPage.getLastName().sendKeys(lname);
			Thread.sleep(2000);
			oPage.getEmail().sendKeys(ename);
			Thread.sleep(2000);	
			oPage.getUserDataLightBox_usernameField().sendKeys(uname);
			Thread.sleep(2000);
			oPage.getPassword().sendKeys(pname);
			Thread.sleep(2000);
			oPage.getPasswordCopy().sendKeys(pcpname);
			Thread.sleep(2000);			
			oPage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(3000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getModify()
	{
		return new Object[][] {{"Demo_New"}};
	}
	@Test(priority=6, dataProvider="getModify")
	private static void modifyUser(String name)
	{
		try
		{
			oPage.getModifyLink().click();
			Thread.sleep(3000);
			oPage.getUserDataLightBox_lastNameField().clear();
			Thread.sleep(3000);
			oPage.getUserDataLightBox_lastNameField().sendKeys(name);
			Thread.sleep(3000);
			oPage.getModLastname().click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	private static void deleteuser()
	{
		try
		{
			oPage.getModifyLink().click();
			Thread.sleep(4000);
			oPage.getUserDataLightBox_deleteBtn().click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(4000);			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	private static void Logout()
	{
		try
		{
			oPage.getoLogout().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}			
	}
}
