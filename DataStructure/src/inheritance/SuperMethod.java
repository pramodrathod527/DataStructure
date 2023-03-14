package inheritance;
class A{
	public A(){
		System.out.println("I am in A");
	}
	
	public A(int i) {
		System.out.println("I am in int A");
	}
}

 class B extends A {
	public B() {
		System.out.println("I am in B");
	}
	
	public B(int i) {
		super(i);
		System.out.println("I am in int B");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new B(65);
		

	}

}
