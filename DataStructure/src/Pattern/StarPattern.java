package Pattern;

public class StarPattern {

	public static void main(String[] args) {
		
//      Pattern1:
		
//		intention for star pattern
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
		System.out.println("Pattern1:");
		
		for(int i=1;i<=5;i++) {
			String bag = "";
			for(int j=1;j<=5;j++) {
				bag+= "*"+" ";
			}
			System.out.println(bag);
		}
		
		
		
		
//	   Pattern2:
			
//			intention for star pattern
//			* 
//			* * 
//			* * * 
//			* * * * 
//			* * * * *
		
		System.out.println("Pattern2:");
		int N = 5;
		
		for(int i=0;i<N;i++) {
			String bag = "";
			for(int j=0;j<=i;j++) {
				bag+= "*"+" ";
			}
			System.out.println(bag);
		}
		
		
		
//		   Pattern3:
				
//				intention for star pattern
//				* * * * *
//				* * * * 
//				* * * 
//				* * 
//				*
		
		
		System.out.println("Pattern3:");
		int M = 5;
		
		for(int i=0;i<M;i++) {
			String bag = "";
			for(int j=M;j>i;j--) {
				bag+= "*"+" ";
			}
			System.out.println(bag);
		}
		
		
		
		
//		   Pattern3:
				
//				intention for star pattern
//				* * * * *
//				  * * * *
//				    * * *
//				      * *
//				        *
          		
//				
		
				
		
		
		
		
		
		
		

	}

}
