package assignment8_2;

/**
 * @author MANJUNATH
 *This class is to initialize the thread and start the thread 
 */
import java.util.Scanner;

public class ThreadMainClass {
	public static void main(String[] args) { // Main method
		Scanner sc = new Scanner(System.in); // Scanner class initialization
		System.out.println("Enter the Number:\n ");
		PrimeNumberImplementation primeThread = new PrimeNumberImplementation(sc.nextInt()); // Passing the user
																										// input to
																										// thread
																										// implemented
																										// class to find
																										// number is
																										// prime or not
		Thread t1 = new Thread(primeThread);		//passing the PrimeNumberImplementsRunnable object to thread
		t1.start();		// starting the thread
		sc.close();		//closing the scanner class object 
	}

}
