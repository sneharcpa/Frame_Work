package Runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_script.Loginpage;
import generic_script.base_test;

public class Runner_script extends base_test
{
@Test(dataProvider= "test1")
public void test2(String un, String pwd) throws InterruptedException
{
	Loginpage p1 = new Loginpage(driver);
	p1.passUN(un);
	p1.passpwd(pwd);
	Thread.sleep(2000);
	p1.btn();
	Assert.fail();
}
@DataProvider(name = "test1")
public Object[][] createData1() {
 return new Object[][] {
   { "ammu", "1234" },
   { "bujji", "5426"},
 };
}
}
