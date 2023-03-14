package inheritance;

class X{
	void show () {
		System.out.println("I am Original");
	}
}

class Y extends X{
	void show() {
//		super.show();
		System.out.println("I am over Written");
	}
}

class Z extends X{
	void show() {
		System.out.println("I am in C");
	}
}

public class Overriding {
	
	public static void main(String[] args) {
		
		X obj = new Y();
		
//		obj.show();
		
		obj = new Z(); //runtime polymorphism
		
//		for dispath we have to take care of runtime and pocompile time polymorphism
		
		
		obj.show();  // Dynamic Dispatch
		
	}

}
