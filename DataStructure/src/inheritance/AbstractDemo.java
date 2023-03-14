//package inheritance;
//
//abstract class writer{
//	public abstract void write();
//}
//
//class Pen extends writer{
//	public void write() {
//		System.out.println("I am a Pen");
//	}
//}
//class Pencil extends writer{
//	public void write() {
//		System.out.println("I am a Pencil");
//	}
//}
//class Kit{
//	public void doSomething(writer p) {
//		p.write();
//	}
//	
//	
//
//	
//}
//
//public class AbstractDemo {
//
//	
//	public static void main(String[] args) {
//		
//		Kit k = new Kit();
//		writer p = new Pen();
//		writer pc = new Pencil();
//		
//		
//		k.doSomething(pc);
//		
//		
//	}
//
//}
