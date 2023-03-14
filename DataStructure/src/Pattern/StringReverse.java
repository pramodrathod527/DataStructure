package Pattern;

public class StringReverse {
	
	public static void Reverse(String string) {
		
		String str1[] = string.split("");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]);
		}
	}

	public static void main(String[] args) {
		
		String str = "Pramod Rathod";
		
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			Reverse(arr[i]+" ");
		}
	}
}
