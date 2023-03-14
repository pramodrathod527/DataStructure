package inheritance;

class S{
	void show() {
		System.out.println("I am in S");
	}
}

//class T extends S{
//	@Override
//	
//	void show() {
//		System.out.println("I am the Best");
//	}
//	
//}

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S obj = new S() {
			void show() {
				System.out.println("I am the Best");
			}
		};
		obj.show();

	}
	
	//Note: for override only once we can use ananymous class

}
