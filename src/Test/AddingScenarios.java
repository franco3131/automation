package Test;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import drivers.driverSetup;
import page.Adding;
import page.HomePage;
import page.numberButton;
import page.output;



public class AddingScenarios extends driverSetup{
  @Test
  public void addingScenario1() throws Exception {
	  System.out.println(driver);
	  int x=1;
	  Adding adding=new Adding(getDriver());
	  HomePage home=new HomePage(getDriver());
	  numberButton number=new numberButton(getDriver());
	  output output=new output(getDriver());
	  home.goToURL();
	  number.click1Button();
	  adding.clickPlusButton();
	  number.click2Button();
	  output.clickEqual();

	  assertEquals(output.getOutputText(), "3");
	 
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
	  
	  @Test
	  public void addingScenario3() throws Exception {
		  System.out.println(driver);
		  Adding adding=new Adding(getDriver());
		  HomePage home=new HomePage(getDriver());
		  numberButton number=new numberButton(getDriver());
		  output out=new output(getDriver());
		  home.goToURL();
		  number.click5Button();
		  adding.clickPlusButton();
		  number.click5Button();
		  out.clickEqual();

		  assertEquals(out.getOutputText(), "10");
		 
	  }
	  @Test
	  public void addingScenario4() throws Exception {
		  System.out.println(driver);
		  Adding adding=new Adding(getDriver());
		  HomePage home=new HomePage(getDriver());
		  numberButton number=new numberButton(getDriver());
		  output out=new output(getDriver());
		  home.goToURL();
		  number.click2Button();
		  adding.clickPlusButton();
		  number.click3Button();
		  out.clickEqual();

		  assertEquals(out.getOutputText(), "5");
		 
	  }
  
  
  
  
  
}
