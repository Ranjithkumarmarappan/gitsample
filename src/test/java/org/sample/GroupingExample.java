package org.sample;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"moto"})
	public void moto() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"moto"})
	public void vivo() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"moto"})
	public void moto2() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"lenevo"})
	public void lenovo() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"lenevo"})
	public void sony() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"techno"})
	public void techno() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"techno"})
	public void onePlus() {
		System.out.println("Apple Testing");
	}
}
