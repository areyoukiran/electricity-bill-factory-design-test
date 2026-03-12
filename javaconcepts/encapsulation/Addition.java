package javaconcepts.encapsulation;

public class Addition {

	// Data
	private int number1, number2;

	// Constructor
	private Addition(int param1, int param2) {
		System.out.println("Addition.Addition():entry BEFORE initializing " + number1 + " and " + number2);
		number1 = param1;
		number2 = param2;
		System.out.println("Addition.Addition():exit AFTER initializing " + number1 + " and " + number2);
	}

	// Method
	private void doAddition() {
		System.out.println("Addition.doAddition():entry");
		int result;
		result = number1 + number2;
		System.out.println("Sum of " + number1 + " and " + number2 + " is: " + result);
		System.out.println("Addition.doAddition():exit");
	}

	// Entry
	public static void main(String[] args) {
		System.out.println("Addition.main():entry");
		// Object Creation
		Addition addition1 = new Addition(100, 200);
		// Method Calling
		addition1.doAddition();

		// Object Creation
		Addition addition2 = new Addition(400, 600);
		// Method Calling
		addition2.doAddition();
		System.out.println("Addition.main():exit");
	}
}
