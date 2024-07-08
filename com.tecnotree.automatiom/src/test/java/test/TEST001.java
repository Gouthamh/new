package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.CustomTestListener.class)
public class TEST001 {

	@Test
	private void test11() {
		// TODO Auto-generated method stub
		Assert.assertEquals(false, false);
	}
	
	@Test
	private void test1() {
		// TODO Auto-generated method stub
		Assert.assertEquals(true, false);
	}
}
