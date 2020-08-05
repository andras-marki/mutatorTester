package mutatorTester;

// mutation operators for Java, according to Ammann & Offutt - Introduction to Software Testing, edition 2
// reason: we need functionality to check what / if everything is generated by the mutators (i.e. actual implementations in Major)
public class ElementHolder {

	public ElementHolder() {
		
	}
	
	// NOT_USED_IN_MAJOR
	// ABS - absolute value insertion
	/*public int ABSHolder(int m, int o, int p) {
		int a;
		a = m * (o + p);
		return a;
	}*/
	
	// AOR - Arrithmetic Operator Replacement
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

	public boolean RORLarger(int a, int b) {
		return a > b;
	}

	public boolean RORLargerEqual(int a, int b) {
		return a >= b;
	}

	public boolean ROREqual(int a, int b) {
		return a == b;
	}

	public boolean RORNotEqual(int a, int b) {
		return a <= b;
	}

	// COR - conditional Operator Replacement
	public boolean CORAnd(boolean a, boolean b) {
		return (a && b);
	}

	public boolean COROr(boolean a, boolean b) {
		return (a || b);
	}

	public boolean CORNonConditionalAnd(boolean a, boolean b) {
		return (a & b);
	}

	public boolean CORNonConditionalOr(boolean a, boolean b) {
		return (a || b);
	}

	// SOR - Shift Operator Replacement
	// <<
	public byte SORSignedLeftShift(byte b) {
		b = (byte) (b << 0x0001);
		return b;
	}

	// >>
	public byte SORSignedRightShift(byte b) {
		b = (byte) (b >> 0x0001);
		return b;
	}

	// >>>
	public byte SORUnsignedRightShift(byte b) {
		b = (byte) (b >>> 0x0001);
		return b;
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