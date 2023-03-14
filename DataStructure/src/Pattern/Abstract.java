package Pattern;

abstract class Human{  //abstract class
	public abstract void eat() ;
	public void walk() {
		
	}
}

class Man extends Human{    //Concrete class
	public void eat() {
		System.out.println("Puri Bhaji");
	}
}


public class Abstract {

	public static void main(String[] args) {
		
		Human obj = new Man();
		obj.eat();
	}

}
