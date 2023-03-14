package inheritance;
class P{
	final int i;
	public  P(){
		i=5; //once we use final we cannot reassign
	}
	public final void show() {
		System.out.println("im in P");
	}
}
final class E {	
}
class F extends P{
	//we cannot extends final class
	
	//public void show() {
		//when we never want to override method then we can make that method as final 
	//}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj = new P();
		System.out.println(obj.i);
	}

}
