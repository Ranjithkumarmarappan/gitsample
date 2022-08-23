package org.sample;

import org.testng.annotations.Test;

public class DependenciesMangement {
	
	@Test(enabled=true,invocationCount=2,priority=1)
	public void primarySchool() {
		System.out.println("Primary Education");
	}
	@Test(dependsOnMethods="primarySchool",priority=2)
	public void secondarySchool() {
		System.out.println("Secondary EEducation");
	}
	@Test(priority=3)
	public void engineering() {
		System.out.println("Engineering");
	}
	@Test(priority=4)
	public void postGraduate() {
		System.out.println("PG");
	}
}
