package mutatorTester;

// based on mutation operators for Java, according to Ammann and Offutt - Introduction to Software Testing, edition 2
// the mutators are synchronized with the Major mutation framework (see all.mml in Major)
// reason: we need functionality to check what / if everything is generated by the mutators (i.e. actual implementations in Major)
public class ElementHolder {

	public ElementHolder() {
		
	}
	
	// AOR - Arithmetic Operator Replacement
	public int AORAddition(int a, int b) {
		return a + b;
	}

	public int AORSubstraction(int a, int b) {
		return a - b;
	}

	public int AORMultiplication(int a, int b) {
		return a * b;
	}

	public int AORDivision(int a, int b) {
		return a / b;
	}

	public int AORModulo(int a, int b) {
		return a % b;
	}

	// ROR - Relational Operator Replacement
	public boolean RORLess(int a, int b) {
		return a < b;
	}

	public boolean RORLessEqual(int a, int b) {
		return a <= b;
	}

	public boolean RORGreater(int a, int b) {
		return a > b;
	}

	public boolean RORGreaterEqual(int a, int b) {
		return a >= b;
	}

	public boolean ROREqual(int a, int b) {
		return a == b;
	}

	public boolean RORNotEqual(int a, int b) {
		return a != b;
	}

	// COR - conditional Operator Replacement
	public boolean CORAnd(boolean a, boolean b) {
		return (a && b);
	}

	public boolean COROr(boolean a, boolean b) {
		return (a || b);
	}

	// Conditional AND is not implemented in Major
	//public boolean CORNonConditionalAnd(boolean a, boolean b) {
	//	return (a & b);
	//}

	// Conditional OR is not implemented in Major
	//public boolean CORNonConditionalOr(boolean a, boolean b) {
	//	return (a || b);
	//}

	// SOR - Shift Operator Replacement
	// <<
	public int SORSignedLeftShift(int b) {
		return b << 0x0001;
	}

	// >>
	public int SORSignedRightShift(int b) {
		return b >> 0x0001;
	}

	// >>>
	public int SORUnsignedRightShift(int b) {
		return (b >>> 0x0001);
	}

	// LOR - Logical Operator Replacement
	// & bitwise AND
	public int LORBitwiseAND(int a, int b) {
		return a & b;
	}

	// & bitwise OR
	public int LORBitwiseOR(int a, int b) {
		return a | b;
	}

	// & bitwise OR
	public int LORBitwiseExclusiveOR(int a, int b) {
		return a ^ b;
	}
}