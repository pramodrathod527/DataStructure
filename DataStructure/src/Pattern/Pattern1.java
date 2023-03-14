package Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Pattern:1------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern:2---------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=7; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
System.out.println("Pattern:3---------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=6; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
System.out.println("Pattern:4---------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
System.out.println("Pattern:5---------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
System.out.println("Pattern:6---------------");
		
		for(int i=1; i<=7; i++) {
			for(int j=6; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("Pattern:7---------------");

		for(int i=1; i<=7; i++) {
			for(int j=6; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=2; i<=7; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Pattern No:8---------------");
		
		for(int i=1;i<=7;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=2;i<=7;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Test------------");
		
		
		for(int a=1; a<=5; a++) { 
			for(int b=2;b<=a;b++){     //----------> space
				System.out.print(" ");
			}
			for(int b=5; b>=a;b--){
				System.out.print("*");
			}//--->line
		
			System.out.println();
		}

		
		
			
			
		

	}

}
