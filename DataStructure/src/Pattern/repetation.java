package Pattern;

public class repetation {
public static void main(String[] args){
int arr [] = {1,2,3,4,2,2,4,5,1};
	for(int i=0;i<arr.length;i++)
	{
		int count = 1;
		boolean isRepeated = false;
		for(int j=0;j<i;j++) {
			if(arr[j]==arr[i]) {
				isRepeated=true;
				break;
			}
		}
		if(!isRepeated) {
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
					count++;
				}
			}
			
		if(count>1) {
			System.out.println("Element "+arr[i]+ " is Repeated "+ count+" times");
		}
		}
	}
}

}
