package sampleJava2;

import java.util.Scanner;

public class TrigonomatryCalculator {
	Scanner in = new Scanner(System.in);
	 public void degreeCalc(int operation) {
		 
		 switch(operation) {
		 case 1:
			 System.out.println("What number do you want in the sin?" );
			 System.out.println(Math.sin(Math.toRadians(in.nextInt())));
			 break;
		 case 2:
			 System.out.println("What number do you want in the cos?" );
			 System.out.println(Math.cos(Math.toRadians(in.nextInt())));
			 break;
		 case 3:
			 System.out.println("What number do you want in the tan?" );
			 System.out.println(Math.tan(Math.toRadians(in.nextInt())));
			 break;
		 }
	 }
	 
	 public void radianCalc(int operation) {
		 switch(operation) {
		 case 1:
			 System.out.println("What number do you want in the cos?" );
			 System.out.println(Math.sin(in.nextInt()));
			 break;
		 case 2:
			 System.out.println("What number do you want in the cos?" );
			 System.out.println(Math.cos(in.nextInt()));
			 break;
		 case 3:
			 System.out.println("What number do you want in the cos?" );
			 System.out.println(Math.tan(in.nextInt()));
			 break;
		 }
	 }
}
