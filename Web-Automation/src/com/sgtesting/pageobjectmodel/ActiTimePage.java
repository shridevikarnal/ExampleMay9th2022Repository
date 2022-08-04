package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//WebElement for Login Page UserName text field
	private WebElement username;

	//WebElement for Login Page Password text field
	private WebElement pwd;

	//WebElement for Login Page Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	
	//WebElement for Home Page Flyout Window 
	private WebElement gettingStartedShortcutsPanelId;

	//WebElement for create user window
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement oCreate;

	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	
	private WebElement firstName;
	private WebElement lastName;
	private WebElement email;
	private WebElement userDataLightBox_usernameField;
	private WebElement password;
	private WebElement passwordCopy;
	private WebElement userDataLightBox_commitBtn;
	
	//WebElement for ModifyUser window
	
	@FindBy(xpath="//td[@class='userNameCell first']")
	private WebElement modifyLink;
	
	private WebElement userDataLightBox_lastNameField;
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement modLastname;   //modify name
	
	//WebElement for Delete User
	private WebElement userDataLightBox_deleteBtn;  //delete user
	
	//WebElement for Home Page Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	
	//For Create Customer
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
	private WebElement taskLink;
	
	//For AddCustomer
	@FindBy(xpath="//*[@*='addNewButton']")
	private WebElement addNew;
	
	//For New Customer
	@FindBy(xpath="//*[@*='item createNewCustomer ellipsis']")
	private WebElement newCustomer;
	
	private WebElement customerLightBox_nameField;
	private WebElement customerLightBox_descriptionField;
	private WebElement customerLightBox_commitBtn;
	
	// Delete customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement SettingButton;
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actionabutn;
	
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deletebutn;
	
	private WebElement customerPanel_deleteConfirm_submitTitle;   //delete permanently
	
	//Modify customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modifydiscription;
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closebutton;
	
	//Create Project
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement NewProject;
	
	private WebElement projectPopup_projectNameField;   //Project name
	
	private WebElement projectDescriptionField;  //project discreption
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproj;
	
	//Delete project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")    //project setting button
	private WebElement Projsettingbtn;
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")    //project delete actions button
	private WebElement projActionbtn;
	

	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")    //project delete button
	private WebElement projDeletebtn;
	
	private WebElement projectPanel_deleteConfirm_submitTitle;//project permanent delete button
	
	// Create Task, delete task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")      //      //div[text()='Add New Task']
	private WebElement AddnewTask;
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement CreateNewTask;    //create new task link
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement TaskName;
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]")
	private WebElement CreateTask;             //create task link
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement clicktask;                 // Task1 click
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement taskAction;
	
	@FindBy(xpath="//div[text()='Delete']")      //     //*[@id="taskListBlock"]/div[3]/div[4]/div/div[3]/div
	private WebElement taskDelete;
	
	private WebElement taskPanel_deleteConfirm_submitTitle;    // task permanent delete
	
	
	


	public WebElement getClicktask() {
		return clicktask;
	}

	public WebElement getTaskAction() {
		return taskAction;
	}

	public WebElement getTaskDelete() {
		return taskDelete;
	}

	public WebElement getTaskPanel_deleteConfirm_submitTitle() {
		return taskPanel_deleteConfirm_submitTitle;
	}

	public WebElement getAddnewTask() {
		return AddnewTask;
	}

	public WebElement getCreateNewTask() {
		return CreateNewTask;
	}

	public WebElement getTaskName() {
		return TaskName;
	}

	public WebElement getCreateTask() {
		return CreateTask;
	}

	public WebElement getProjActionbtn() {
		return projActionbtn;
	}

	public WebElement getProjDeletebtn() {
		return projDeletebtn;
	}

	public WebElement getProjectPanel_deleteConfirm_submitTitle() {
		return projectPanel_deleteConfirm_submitTitle;
	}

	public WebElement getModifydiscription() {
		return modifydiscription;
	}

	public WebElement getClosebutton() {
		return closebutton;
	}

	public WebElement getSettingButton() {
		return SettingButton;
	}

	public WebElement getActionabutn() {
		return actionabutn;
	}

	public WebElement getDeletebutn() {
		return deletebutn;
	}

	public WebElement getCustomerPanel_deleteConfirm_submitTitle() {
		return customerPanel_deleteConfirm_submitTitle;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getoLogin() {
		return oLogin;
	}

	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}

	public WebElement getoLogout() {
		return oLogout;
	}

	public WebElement getoCreate() {
		return oCreate;
	}
	public WebElement getoAddUser() {
		return oAddUser;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPasswordCopy() {
		return passwordCopy;
	}

	public WebElement getoClickCreateUser() {
		return oClickCreateUser;
	}
	public WebElement getUserDataLightBox_commitBtn() {
		return userDataLightBox_commitBtn;
	}

	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oClickCreateUser; 
	
	public WebElement getModifyLink() {
		return modifyLink;
	}

	public WebElement getUserDataLightBox_lastNameField() {
		return userDataLightBox_lastNameField;
	}

	public WebElement getModLastname() {
		return modLastname;
	}
	public WebElement getUserDataLightBox_deleteBtn() {
		return userDataLightBox_deleteBtn;
	}

	public WebElement getTaskLink() {
		return taskLink;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
	}

	public WebElement getCustomerLightBox_descriptionField() {
		return customerLightBox_descriptionField;
	}

	public WebElement getCustomerLightBox_commitBtn() {
		return customerLightBox_commitBtn;
	}
	public WebElement getNewProject() {
		return NewProject;
	}

	public WebElement getProjectPopup_projectNameField() {
		return projectPopup_projectNameField;
	}

	public WebElement getProjectDescriptionField() {
		return projectDescriptionField;
	}

	public WebElement getCreateproj() {
		return createproj;
	}
	
	public WebElement getProjsettingbtn() {
		return Projsettingbtn;
	}

	
	 

}
