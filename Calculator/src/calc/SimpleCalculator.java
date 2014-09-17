//anubhav saxena
package calc;

public class SimpleCalculator {

	private double currentNumber;
	
	public SimpleCalculator(double d) {
		this.currentNumber = d;
		
	}
	
	public void add(double d) {
		//adds the supplied value
		currentNumber += d;
	}
	
	public double getCurrentNumber() {
		
		return currentNumber;
		
	}
	
	
}
