//The prime factors of a number are all of the integers below that number that are
//divisible into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6,
//and 12.
//● Write a Java class with a static method that will take a number and print all the prime factorial
//of that number.
//● The Supplied number should be between 2 and 100. otherwise, it should print “Invalid
//number”.
//● Call this method from the main method by supplying any valid argument.

package Pattern;
public class PrimeFactor1 {

	public static void Prime(int N) {       
		
		
		if(N>=2 && N<=100) {
			for(int i=1; i<=N; i++) {
				if(N%i==0) {
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime(102);
	}
}
