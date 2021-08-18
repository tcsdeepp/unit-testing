package testing;

public class Calculator {
	public int add(int a, int b) { // only public methods should be tested
		return a + b;
	}

	public float add(float a, float b) { // only public methods should be tested
		return a + b;
	}

	public int negativeInteger(int a, int b) {
		return a - b;
	}

	public float divide(int a, int b) {
		return a / b;
	}

}
