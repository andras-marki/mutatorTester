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
	
	// needed to detect the != mutant
	@Test
	public void testRORLess3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLess(1, 0), false);
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
	
	// needed to detect the TRUE mutant
	@Test
	public void testRORLessEqual3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORLessEqual(1, 0), false);
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
	
	// needed to detect the != mutant
	@Test
	public void testRORGreater3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreater(0, 1), false);
	}
	
	@Test
	public void testRORGreaterEqual1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreaterEqual(1, 0), true);
	}
	
	@Test
	public void testRORGreaterEqual2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreaterEqual(0, 0), true);
	}
	
	// needed to detect the TRUE mutant
	@Test
	public void testRORGreaterEqual3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORGreaterEqual(0, 1), false);
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
	
	// needed to detect the <= mutant
	@Test
	public void testROREqual3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.ROREqual(0, 1), false);
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
	
	// needed to detect the > mutant
	@Test
	public void testRORNotEqual3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.RORNotEqual(0, 1), true);
	}
	
	@Test
	public void testCORAnd1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.CORAnd(true, true), true);
	}
	
	@Test
	public void testCORAnd2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.CORAnd(true, false), false);
	}
	
	// needed to detect the == mutant	
	@Test
	public void testCORAnd3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.CORAnd(false, false), false);
	}
	
	// needed to detect the RHS mutant	
	@Test
	public void testCORAnd4() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.CORAnd(false, true), false);
	}
	
	@Test
	public void testCOROr1() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.COROr(true, false), true);
	}
	
	@Test
	public void testCOROr2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.COROr(false, false), false);
	}
	
	// needed to detect the != mutant
	@Test
	public void testCOROr3() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.COROr(true, true), true);
	}
	
	// needed to detect the LHS mutant
	@Test
	public void testCOROr4() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.COROr(false, true), true);
	}
	
	@Test
	public void testSORSignedLeftShift() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.SORSignedLeftShift(10),20);
	}
	
	@Test
	public void testSORSignedRightShift1() {
		ElementHolder em = new ElementHolder();		
		assertEquals(em.SORSignedRightShift(10),5);
	}
	
	@Test
	public void testSORSignedRightShift2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.SORSignedRightShift(Integer.MIN_VALUE),-1073741824);
	}
	
	@Test
	public void testSORUnsignedRightShift1() {
		ElementHolder em = new ElementHolder();		
		assertEquals(em.SORSignedRightShift(10),5);
	}
	
	@Test
	public void testSORUnsignedRightShift2() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.SORUnsignedRightShift(Integer.MIN_VALUE),1073741824);
	}
	
	@Test
	public void testLORBitwiseAND() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.LORBitwiseAND(5, 6), 4);
	}
	
	@Test
	public void testLORBitwiseOR() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.LORBitwiseOR(5, 6), 7);
	}
	
	@Test
	public void testLORBitwiseExclusiveOR() {
		ElementHolder em = new ElementHolder();
		assertEquals(em.LORBitwiseExclusiveOR(5, 6), 3);
	}
}
