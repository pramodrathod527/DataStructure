package Pattern;

import java.util.Scanner;

public class Addition {
	
	public static void add(double i , double j) {
		double res = i+j;
		System.out.println("Summison of numbers = "+res);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter value here press Enter after each value"); 
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		add(n1,n2);
		

	}

}
