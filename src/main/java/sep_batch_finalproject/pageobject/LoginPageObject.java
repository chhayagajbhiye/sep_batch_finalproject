package sep_batch_finalproject.pageobject;

import org.openqa.selenium.By;

public class LoginPageObject {
	
	//locator
   private static By txt_username = By.xpath("//input[@id='ap_email']");
   private static By txt_password = By.xpath("//input[@id='ap_password']");
   private static By btn_login = By.xpath("//input[@id='signInSubmit']");
   private static By btn_continue = By.xpath("//input[@id='continue']");
   private static By btn_submit =By.xpath("//input[@id='continue']");
   
   public static By getTxt_username() {
	return txt_username;
    }

    public static By getBtn_submit() {
	return btn_submit;
    }
	public static By getTxt_password() {
	return txt_password;
    }

   public static By getBtn_login() {
	return btn_login;
   }

   public static By getBtn_continue() {
	return btn_continue;
   }
            
}
