package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Listeners(test.CustomTestListener.class)
public class TEST001 {

	public static Logger log = LogManager.getLogger(TEST001.class);

	@Test
	private void test11() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}
	@Test
	private void test12() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}
	@Test
	private void test13() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}
	@Test
	private void test14() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}
	@Test
	private void test15() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}

//	@Test
//	private void test1() {
//		// TODO Auto-generated method stub
//		Assert.assertEquals(true, false);
//	}
}
