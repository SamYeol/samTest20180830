package com.mycom.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class addTest {
	@Test
	public void addition() {
	 adder add = new adder();
	 int sum = add.addition("5+10+30+55");
	 assertEquals(100,sum);
	 }
}
