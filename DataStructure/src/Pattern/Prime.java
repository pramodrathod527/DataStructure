package Pattern;

public class Prime {
	
	public static void PrimeFactorNum(int N){
		
		if(N>=2 && N<=100)
		{
			for(int i=1;i<N;i++)
			{
				if(N%i==0) 
				{
					System.out.println(i);
				}
			}
		
		}
		else {
			System.out.println("Invalid Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeFactorNum(12);
	}
}
