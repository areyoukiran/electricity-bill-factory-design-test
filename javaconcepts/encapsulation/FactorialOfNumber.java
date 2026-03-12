package javaconcepts.encapsulation;

public class FactorialOfNumber {

	// Data
	private int number;

	// All Argument Constructor
	private FactorialOfNumber(int param1) {
		number = param1;
	}

	// Zero Argument Constructor
	public FactorialOfNumber() {

	}

	// To String Method
	@Override
	public String toString() {
		return "Number: " + number;
	}

	// Setter
	public void setNumber(int number) {
		this.number = number;
	}

	// Getter
	public int getNumber() {
		return number;
	}

	// Business Method
	private void calculateFactorial() {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial is: " + factorial);
		System.out.println();
	}

	// Entry
	public static void main(String[] args) {
		// Object Creation
		FactorialOfNumber factorialOfNumber1 = new FactorialOfNumber(5);
		// To String Method
		System.out.println(factorialOfNumber1);
		// Calling Business Method
		factorialOfNumber1.calculateFactorial();

		// Object Creation
		FactorialOfNumber factorialOfNumber2 = new FactorialOfNumber(6);
		// To String Method
		System.out.println(factorialOfNumber2);
		// Calling Business Method
		factorialOfNumber2.calculateFactorial();

		FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
		System.out.println("Default Value");
		System.out.println("Number: " + factorialOfNumber.getNumber());
		System.out.println();

		// Factorial of a number: First Time
		factorialOfNumber.setNumber(7);
		System.out.println("Number (Getter): " + factorialOfNumber.getNumber());
		factorialOfNumber.calculateFactorial();

		// Factorial of a number: Second Time
		factorialOfNumber.setNumber(8);
		System.out.println("Number (Getter): " + factorialOfNumber.getNumber());
		factorialOfNumber.calculateFactorial();
	}

}
