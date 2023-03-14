package Pattern;



public class Method_in_Java {

	// calculation odd even number by using static method;
	
	public static boolean evenNumber(int a) {
		
		return a%2==0;
	}
	
	// calculation of even odd Number by Using Non-Static Method:
	
	
	public void even(int a) {
		
		if(a%2==0) {
			System.out.println(a +" is Even Number");
		}else {
			System.out.println(a +" is not Even Number");
		}
	}
 
	public static boolean isPrimeNum(int a) {
	 
		int count = 0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0) {
			 count++;
		 }
	 }
	 return count==2;
	 	
 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr [] = {1,2,3,4,5};
	
		for(int i=0;i<arr.length;i++) {
			if(isPrimeNum(arr[i])) {
				System.out.println(arr[i]+" is Prime NUmber");
			}else {
				System.out.println(arr[i]+" is Not Prime NUmber");
			}
		}
	
		
		 Method_in_Java obj = new  Method_in_Java();
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		

	}

}
