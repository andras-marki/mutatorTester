package mutatorTester;

public class Main {
	public static void main(String[] args) {
		ElementHolderLooper eml = new ElementHolderLooper();
		int a = 5;
		int b = 6;
		int loop = 2;
		
		System.out.println(eml.doWhileInlineRORLess(a, b, loop));
	}
}
