package assignment8_2;

/**
 * @author MANJUNATH
 *This class is to extends the thread and implement the Runnable interface 
 */
//	Implementing the Runnable interface and extends the threadMainClass
public class PrimeNumberImplementation extends ThreadMainClass implements Runnable {
	int Number, inputNumber, primeNumber;

	PrimeNumberImplementation(int inputNumber) {		//getting the user input to the constructor
		this.inputNumber = inputNumber;
	}

	public void run() {
		try {
			Number = inputNumber / 2;		//divide the user input and assign the value to Number variable
			for (int i = 2; i <= Number; i++) {		//looping the number to find whether it's prime or not
				if (Number % i == 0) {					
					System.out.println(inputNumber+" "+"Number is not a Primer number");
					primeNumber = 1;
					break;
				}
			}
			if (primeNumber == 0)			
				System.out.println(inputNumber+" "+"Number is Prime number");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Main method
}