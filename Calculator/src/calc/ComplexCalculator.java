//anubhav saxena
package calc;
//if using the Math class
//import java.lang.Math;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber += d;
	}
	
	// subtract()
	// subtracts d from current number  
	public void subtract(double e)
	{
		currentNumber -= e;
	}
	
	// multiply()
	// multiplies current number by d
	public void multiply(int e)
	{
		currentNumber *= e;
	}
	
	// divide()
	// divides current number by a given number
	public void divide(int e)
	{
		currentNumber /= e;
	}
	
	// clear()
	// sets current number to 0
	public void clear()
	{
		currentNumber = 0;
	}
	
	// power()
	// raises current number to the power of a given number
	public void power(int e)
	{
		//anything to the power 0 is 1
		if (e==0)
		{
			currentNumber = 1;
		}
		else{
			//copy to local variable
			double originalNumber = currentNumber;
			
			for (int i=1; i<e; i++)
			{
				currentNumber *= originalNumber;
			}
		}
		//currentNumber = Math.pow(currentNumber, e);
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// returns true is current number is even, false otherwise
	public boolean isEven()
	{
		//variable that holds the return value, false by default
		boolean flag = false;
		if (currentNumber%2==0)
		{
			flag=true;
		}
		
		return flag;
	}
	
	// isPrime()
	// returns true if current number is a prime number, false otherwise
	public boolean isPrime()
	{
		//variable that holds the default value, false by default
		boolean flag = false;
		int numberOfDivisors = 0;
		for(int i=1; i<=currentNumber; i++)
		{
			if (currentNumber%i==0)
			{
				numberOfDivisors++;
			}
		}
		
		if (numberOfDivisors==2)
		{
			flag = true;
		}
		
		return flag;
	}
	////////////////////////////////////////////////////
	
}
