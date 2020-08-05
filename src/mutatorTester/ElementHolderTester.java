package mutatorTester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class ElementHolderTester {

	@Test
	void testAORAddition() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORAddition(0, 1), 1);
	}

	@Test
	void testAORSubstraction() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORSubstraction(0, 1), -1);
	}
	
	@Test
	void testAORMultiplication() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORMultiplication(3, 3), 9);
	}
	
	@Test
	void testAORDivision() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORDivision(9, 3), 3);
	}
	
	@Test
	void testAORModulo() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.AORModulo(4, 10), 4);
	}
	
	@Test
	void testRORLess1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLess(0, 1), true);
	}
	
	@Test
	void testRORLess2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLess(1, 1), false);
	}
	
	@Test
	void testRORLessEqual() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLessEqual(0, 1), true);
	}
}
