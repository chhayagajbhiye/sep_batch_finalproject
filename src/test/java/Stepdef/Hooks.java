package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import sep_batch_finalproject.factory.DriverFactory;

public class Hooks {
	@Before
	public void setup() {
		DriverFactory.initiateDriver();
	}
//	@After
//	public void teardown() {
//		DriverFactory.closeDriver();
//	}

}
