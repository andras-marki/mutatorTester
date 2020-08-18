package mutatorTester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * NOTE: NOT mutation adequate
 * Number of tests should be expanded.
 */

public class ElementHolderLooperTester {
	
	@Test
	public void forCallerRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.forCallerRORLess(5, 6, 2), 2);
	}
	
	@Test
	public void whileCallerRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.whileCallerRORLess(5, 6, 2), 2);
	}
	
	@Test
	public void doWhileCallerRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.doWhileCallerRORLess(5, 6, 2), 2);
	}
	
	@Test
	public void forInlineRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.forInlineRORLess(5, 6, 2), 2);
	}
	
	@Test
	public void whileInlineRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.whileInlineRORLess(5, 6, 2), 2);
	}
	
	@Test
	public void doWhileInlineRORLess1() {
		ElementHolderLooper eml = new ElementHolderLooper();
		assertEquals(eml.doWhileInlineRORLess(5, 6, 2), 2);
	}
}
