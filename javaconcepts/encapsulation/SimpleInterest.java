package javaconcepts.encapsulation;

public class SimpleInterest {

	// Data
	private int principal, tenure, rateOfInterest;

	// All Argument Constructor
	private SimpleInterest(int param1, int param2, int param3) {
		principal = param1;
		tenure = param2;
		rateOfInterest = param3;
	}

	// Zero Argument Constructor
	public SimpleInterest() {

	}

	// To String Method
	@Override
	public String toString() {
		return "Principal: " + principal + " , Tenure: " + tenure + " , Rate of Interest: " + rateOfInterest;
	}

	// Setters
	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	// Getters
	public int getPrincipal() {
		return principal;
	}

	public int getTenure() {
		return tenure;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	// Business Method
	private void calculateSimpleInterest() {
		// System.out.println("SimpleInterest.calculateSimpleInterest():entry");
		int interest;
		interest = (principal * tenure * rateOfInterest) / 100;
		System.out.println("Interest is: " + interest);
		// System.out.println("SimpleInterest.calculateSimpleInterest():exit");
		System.out.println();
	}

	// Entry
	public static void main(String[] args) {
		// Object Creation
		SimpleInterest simpleInterest1 = new SimpleInterest(100, 1, 2);
		// To String Method
		System.out.println(simpleInterest1);
		// Calling Business Method
		simpleInterest1.calculateSimpleInterest();

		// Object Creation
		SimpleInterest simpleInterest2 = new SimpleInterest(200, 2, 3);
		// To String Method
		System.out.println(simpleInterest2);
		// Calling Business Method
		simpleInterest2.calculateSimpleInterest();

		// Object Creation
		SimpleInterest simpleInterest3 = new SimpleInterest(300, 3, 4);
		// To String Method
		System.out.println(simpleInterest3);
		// Calling Business Method
		simpleInterest3.calculateSimpleInterest();

		SimpleInterest simpleInterest = new SimpleInterest();
		// Default Values
		System.out.println("Default Values");
		System.out.println("Principal: " + simpleInterest.getPrincipal());
		System.out.println("Tenure: " + simpleInterest.getTenure());
		System.out.println("Rate of Interest: " + simpleInterest.getRateOfInterest());
		System.out.println();

		// Simple Interest: First Time
		simpleInterest.setPrincipal(400);
		simpleInterest.setTenure(4);
		simpleInterest.setRateOfInterest(5);
		System.out.println("Principal (Getter): " + simpleInterest.getPrincipal());
		System.out.println("Tenure (Getter): " + simpleInterest.getTenure());
		System.out.println("Rate of Interest (Getter): " + simpleInterest.getRateOfInterest());
		simpleInterest.calculateSimpleInterest();

		// Simple Interest: Second Time
		simpleInterest.setPrincipal(500);
		simpleInterest.setTenure(5);
		simpleInterest.setRateOfInterest(6);
		System.out.println("Principal (Getter): " + simpleInterest.getPrincipal());
		System.out.println("Tenure (Getter): " + simpleInterest.getTenure());
		System.out.println("Rate of Interest (Getter): " + simpleInterest.getRateOfInterest());
		simpleInterest.calculateSimpleInterest();

		// Simple Interest: Third Time
		simpleInterest.setPrincipal(600);
		simpleInterest.setTenure(6);
		simpleInterest.setRateOfInterest(7);
		System.out.println("Principal (Getter): " + simpleInterest.getPrincipal());
		System.out.println("Tenure (Getter): " + simpleInterest.getTenure());
		System.out.println("Rate of Interest (Getter): " + simpleInterest.getRateOfInterest());
		simpleInterest.calculateSimpleInterest();
	}
}
