package Test;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import drivers.driverSetup;
import page.Adding;
import page.HomePage;
import page.numberButton;
import page.output;



public class NewTest extends driverSetup{
  @Test
  public void addingScenario1() throws Exception {
	  System.out.println(driver);
	  Adding adding=new Adding(getDriver());
	  HomePage home=new HomePage(getDriver());
	  numberButton number=new numberButton(getDriver());
	  output out=new output(getDriver());
	  home.goToURL();
	  number.click1Button();
	  adding.clickPlusButton();
	  number.click2Button();
	  out.clickEqual();

	  assertEquals(out.getOutputText(), "3");
	 
  }
  
  
  

	  @Test
	  public void addingScenario2() throws Exception {
		  System.out.println(driver);
		  Adding adding=new Adding(getDriver());
		  HomePage home=new HomePage(getDriver());
		  numberButton number=new numberButton(getDriver());
		  output out=new output(getDriver());
		  home.goToURL();
		  number.click3Button();
		  adding.clickPlusButton();
		  number.click5Button();
		  out.clickEqual();

		  assertEquals(out.getOutputText(), "8");
		 
	  }
	  
  
  
  
  
}
