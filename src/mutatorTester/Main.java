package mutatorTester;

public class Main {
	public static void main(String[] args) {
		ElementHolder em = new ElementHolder();
		int b = Integer.MAX_VALUE;
		System.out.println(em.SORSignedRightShift(b));
		System.out.println(em.SORUnsignedRightShift(b));
		b = Integer.MIN_VALUE;
		System.out.println(em.SORSignedRightShift(b));		
		System.out.println(em.SORUnsignedRightShift(b));
		
		//System.out.println(em.LORBitwiseExclusiveOR(100,20));
	}
}
