package javaconcepts.encapsulation;

public class Average {

	// Data
	private int number1, number2, number3;

	// Constructor
	private Average(int param1, int param2, int param3) {
		number1 = param1;
		number2 = param2;
		number3 = param3;

	}

	// Method
	private void doAverage() {
		System.out.println("Average.doAverage():entry");
		int averageResult;
		averageResult = (number1 + number2 + number3) / 3;
		System.out.println("Average of " + number1 + " , " + number2 + " and " + number3 + " is: " + averageResult);
		System.out.println("Average.doAverage():exit");
	}

	// Entry
	public static void main(String[] args) {
		// Object Creation
		Average average1 = new Average(10, 20, 30);
		// Method Calling
		average1.doAverage();
	}
}
