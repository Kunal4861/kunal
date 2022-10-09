package Testpackage1;

import java.util.Scanner;

public class pandrOme {

	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.println("Please enter String");
		String Original = SC.next();
		System.out.println("original String is "+ Original);
		String rev = "";
		
		for(int i=Original.length()-1;i>=0;i--)
		{
			rev=rev+Original.charAt(i);
		}
		System.out.println("Reverse String is "+ rev);
		
		if(Original.equals(rev))
		{
			System.out.println("String is Palendrome");
		}
		else {
			System.out.println("String is not Palendrome");
		}
	}

}
