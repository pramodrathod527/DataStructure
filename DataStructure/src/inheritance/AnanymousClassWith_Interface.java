package inheritance;

interface Abc{
	void show();
	
}

public class AnanymousClassWith_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj = new Abc() {
			public void show() {
				System.out.println("I am the best");
			}
		};
		
		obj.show(); 

	}

}
