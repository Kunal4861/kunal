package Testpackage1;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.println("please enter string value");
		String name = SC.next();
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse String is "+ rev);
		
		
	}

}
