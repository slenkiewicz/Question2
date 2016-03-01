package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tuition_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		
	}
	@Test
	public void testcalc() {
	double predictedresult = 597.34;
	double actualresult = costOfTuition.calc(20000, .05, .05, 20);
	assertEquals(predictedresult, actualresult);
		
	}
	@Test
	public void testcalc2() {
	double predictedresult = 1887.49;
	double actualresult = costOfTuition.calc(50000, .01, .03, 10);
	assertEquals(predictedresult, actualresult);
		
	}
	@Test
	public void testcalc3() {
	double predictedresult = 6835.01;
	double actualresult = costOfTuition.calc(100000, .2, .01, 100);
	assertEquals(predictedresult, actualresult);
		
	}
	@Test
	public void testcalc4() {
	double predictedresult = 834.00;
	double actualresult = costOfTuition.calc(12345, .08, .4, 50);
	assertEquals(predictedresult, actualresult);
}
}