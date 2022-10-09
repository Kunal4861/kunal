package Testpackage1;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input number");
		int input = sc.nextInt();
		int count = 0;

		for (int i=2;i<input;i++) {
			
			if (input%i==0) {
				count++;
			}
		
		}
		 if  (count ==0) 
		{
			System.out.println("it is a prime number");

		} 
		else 
		{
			System.out.println("it is not a prime number");
		}
	}
}
	
