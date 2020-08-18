package mutatorTester;

/*
 * Class to test the looping functionality.
 * TODO: Only ROR less is implemented at the time..
 * */

public class ElementHolderLooper{
	private ElementHolder elementHolder;
	
	public ElementHolderLooper(){
		elementHolder = new ElementHolder();
	}
	
	public int forCallerRORLess(int a, int b, int loopCount) {
		int temp = 0;
		for(int i= 0; i < loopCount; i++) {
			if(elementHolder.RORLess(a,b)) temp++;
		}
		return temp;
	}
	
	public int whileCallerRORLess(int a, int b, int loopCount) {
		int temp = 0;
		int i = 0;
		while (i < loopCount) {
			if(elementHolder.RORLess(a,b)) temp++;
			i++;
		}
		return temp;
	}
	
	public int doWhileCallerRORLess(int a, int b, int loopCount) {
		int temp = 0;
		int i = 0;
		do {
			if(elementHolder.RORLess(a,b)) temp++;
			i++;
		} while (i < loopCount);
		return temp;
	}
	
	public int forInlineRORLess(int a, int b, int loopCount) {
		int temp = 0;
		for(int i= 0; i < loopCount; i++) {
			if(a < b) temp++;
		}
		return temp;
	}
	
	public int whileInlineRORLess(int a, int b, int loopCount) {
		int temp = 0;
		int i = 0;
		while (i < loopCount) {
			if(a < b) temp++;
			i++;
		}
		return temp;
	}
	
	public int doWhileInlineRORLess(int a, int b, int loopCount) {
		int temp = 0;
		int i = 0;
		do {
			if(a < b) temp++;
			i++;
		} while (i < loopCount);
		return temp;
	}
}
