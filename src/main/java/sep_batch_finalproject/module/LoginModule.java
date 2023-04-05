package sep_batch_finalproject.module;

import sep_batch_finalproject.factory.DriverFactory;
import sep_batch_finalproject.pageobject.LoginPageObject;
import sep_batch_finalproject.utils.ActionUtil;

public class LoginModule extends LoginPageObject {

	//module represent functionality
	public void OpenLink() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}
	
	public void OpenLoginPage() {
		DriverFactory.getDriver().get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}
	
	public void ValidateHomePage() {
		DriverFactory.getDriver().getTitle();
	}
	
	public void User_click_on_login_button() {
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_login()).click();
	}
	
	public void login(String username,String password) {
		
		//driver.findElement(By.xpath("").sendKeys();
//	DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys("7030709512");
//	DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys("honey08");
//	DriverFactory.getDriver().findElement(LoginPageObject.getBtn_login()).click();
		ActionUtil.enterText(getTxt_username(),"7030709512");
		ActionUtil.click(getBtn_continue());
		ActionUtil.enterText(getTxt_password(),"honey08");
//		ActionUtil.click(getBtn_login());
	
	}
	
	public void login_without_username(String username,String password) {
		
//		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
//		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_login()).click();
		ActionUtil.enterText(getTxt_username(),"7030709513");
		ActionUtil.click(getBtn_continue());
		ActionUtil.enterText(getTxt_password(), "honey08");
		ActionUtil.click(getBtn_login());
		
	}
	
	public void login_without_password(String username,String password) {
		
//		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username);
//		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_login()).click();
		ActionUtil.enterText(getTxt_username(),username);
		ActionUtil.click(getBtn_login());
		
	}
	
	public void login_without_credential(String username,String password) {
		
//		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_login()).click();
		
		ActionUtil.click(getBtn_login());
	}

	public void login_forgotpassword() {
		ActionUtil.enterText(null, null);
		
	}
}
