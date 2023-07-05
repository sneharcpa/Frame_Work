package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_script.BasePage;

public class Loginpage extends BasePage
{
@FindBy(id="email")
private WebElement unField;

@FindBy(id="pass")
private WebElement pwdField;

@FindBy(name="login")
private WebElement loginbtn;

public Loginpage(WebDriver driver)
{
	super(driver);
}
public void passUN(String un) {
	unField.sendKeys(un);
}
public void passpwd(String pwd) {
	pwdField.sendKeys(pwd);
}
public void btn()
{
	loginbtn.click();
}
}
