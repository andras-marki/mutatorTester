package mutatorTester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElementHolderTester {

	@Test
	public void testAORAddition() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORAddition(0, 1), 1);
	}

	@Test
	public void testAORSubstraction() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORSubstraction(0, 1), -1);
	}
	
	@Test
	public void testAORMultiplication() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORMultiplication(3, 3), 9);
	}
	
	@Test
	public void testAORDivision() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORDivision(9, 3), 3);
	}
	
	@Test
	public void testAORModulo() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORModulo(4, 10), 4);
	}
	
	@Test
	public void testRORLess1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLess(0, 1), true);
	}
	
	@Test
	public void testRORLess2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLess(1, 1), false);
	}
	
	@Test
	public void testRORLessEqual1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLessEqual(0, 1), true);
	}
	
	@Test
	public void testRORLessEqual2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLessEqual(1, 1), true);
	}
	
	@Test
	public void testRORGreater1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreater(1, 0), true);
	}
	
	@Test
	public void testRORGreater2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreater(1, 1), false);
	}
	
	@Test
	public void testRORGreaterEqual1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreaterEqual(1, 0), true);
	}
	
	@Test
	public void testRORGreaterEqual2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreaterEqual(1, 0), true);
	}
	
	@Test
	public void testROREqual1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.ROREqual(1, 1), true);
	}
	
	@Test
	public void testROREqual2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.ROREqual(1, 0), false);
	}
	
	@Test
	public void testRORNotEqual1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORNotEqual(1, 0), true);
	}
	
	@Test
	public void testRORNotEqual2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORNotEqual(1, 1), false);
	}
}
