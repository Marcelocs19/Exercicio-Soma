package pucrs.java.maven.somar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		
		super(testName);
		
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		
		return new TestSuite(AppTest.class);
		
	}

	/**
	 *  
	 * $ somar 10 20
	 * 30
	 * $ *
	 */
	public void testApp() {	
		
		assertEquals(30, Somar.somar(10,20));
		
	}
}
