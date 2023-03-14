package Pattern;

public class Number {
	
	public void OddEven(int i) {
		if(i%2==0) {
			int result = (i/10)+1;
			System.out.println("Input: "+i+" Output: "+result*10);
		}else if(i%2==1) {
			System.out.println("Input: "+i+" Output: "+i);
		}else {
			System.out.println("Input: "+i+" Output: "+"Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number obj = new Number();
		
		obj.OddEven(44);
		obj.OddEven(45);
		obj.OddEven(-5);

	}

}
