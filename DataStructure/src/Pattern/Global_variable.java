package Pattern;

public class Global_variable {
	

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		
		
		
		for(int i=0;i<arr.length;i++) {      
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is Even Number");
			}
			else {
				System.out.println(arr[i]+" is Not Even Number");
			}
			
		}
		
	}

}
