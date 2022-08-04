package com.sgtesting.pageobjectmodel;
/*  launchBrowser=>navigate=>login=>createCustomer=>create project=>
   create task=>delete task=>delete project=>delete customer=>logout=>closeApplication */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateDeleteTaskScenario {
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
	public Object[][] getCustomer()
	{ 
		return new Object[][] {{"customer1","Welcome to Actitime Application"}};
	}
	@Test(priority=5,  dataProvider="getCustomer")

	private static void createCustomer(String cust, String discr)
	{
		try
		{
			oPage.getTaskLink().click();
			Thread.sleep(2000);					
			oPage.getAddNew().click();
			Thread.sleep(2000);			
			oPage.getNewCustomer().click();
			Thread.sleep(2000);			
			oPage.getCustomerLightBox_nameField().sendKeys(cust);
			oPage.getCustomerLightBox_descriptionField().sendKeys(discr);
			oPage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getProject()
	{ 
		return new Object[][] {{"Project1","Its actiTime Selenium Project"}};
	}
	@Test(priority=6,  dataProvider="getProject")

	private static void createProject(String projname, String discr)
	{
		try
		{
			oPage.getAddNew().click();
			Thread.sleep(3000);
			oPage.getNewProject().click();
			Thread.sleep(3000);
			oPage.getProjectPopup_projectNameField().sendKeys(projname);
			Thread.sleep(3000);
			oPage.getProjectDescriptionField().sendKeys(discr);
			Thread.sleep(3000);
			oPage.getCreateproj().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getTask()
	{ 
		return new Object[][] {{"Task1"}};
	}
	@Test(priority=7,  dataProvider="getTask")	 

	private static void createTask(String tname)
	{
		try
		{
			oPage.getAddnewTask().click(); 
 			Thread.sleep(2000);
 			oPage.getCreateNewTask().click(); 
 			Thread.sleep(3000);	
 			oPage.getTaskName().sendKeys(tname);
 			Thread.sleep(3000);
 			oPage.getCreateTask().click();
 			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void deleteTask()
	{
		try
		{
			oPage.getClicktask().click(); 
			Thread.sleep(3000);
			oPage.getTaskAction().click();
 			Thread.sleep(3000);
 			oPage.getTaskDelete().click();
 			Thread.sleep(3000);	
 			oPage.getTaskPanel_deleteConfirm_submitTitle().click();
 			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	private static void deleteProject()
	{
		try
		{
			oPage.getProjsettingbtn().click();
			Thread.sleep(3000);
			oPage.getProjActionbtn().click();
			Thread.sleep(3000);
			oPage.getProjDeletebtn().click();
			Thread.sleep(3000);
			oPage.getProjectPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=10)
	private static void deleteCustomer()
	{
		try
		{
			oPage.getSettingButton().click();
			Thread.sleep(3000);
			oPage.getActionabutn().click();
			Thread.sleep(3000);
			oPage.getDeletebutn().click();
			Thread.sleep(3000);
			oPage.getCustomerPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=11)
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
	@Test(priority=12)
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
