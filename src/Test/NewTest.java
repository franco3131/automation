package Test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import drivers.driverSetup;
import page.Adding;
import page.numberButton;
import page.output;
import page.HomePage;
public class NewTest extends driverSetup{
  @Test
  public void addingScenario1() throws Exception {
	  Adding adding=new Adding(getDriver());
	  //assertEquals(adding.addTwoNumber(1, 2), 3);
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
}
