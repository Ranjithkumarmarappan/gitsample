package org.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("Name")
	public void firstGear(String name) {
		System.out.println("First Gear "+name);
	}
	
	

	
	
}
