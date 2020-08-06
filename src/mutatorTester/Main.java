package mutatorTester;

public class Main {
	public static void main(String[] args) {
		ElementHolder em = new ElementHolder();
		int a = 5;
		int b = 6;
		System.out.println(a & b);
		System.out.println(em.LORBitwiseAND(a, b));
		System.out.println(a | b);
		System.out.println(em.LORBitwiseOR(a, b));
		System.out.println(a ^ b);
		System.out.println(em.LORBitwiseExclusiveOR(a, b));
		
		// System.out.println(em.LORBitwiseExclusiveOR(100,20));
	}
}
