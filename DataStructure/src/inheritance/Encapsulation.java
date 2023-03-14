package inheritance;

//Encapsulation: it is prcess in which Binding data with methods

class Student{
	private int rollno;
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int i) {
		this.rollno=i;
	}
	public int getRollno() {
		return rollno;
		}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.setRollno(38);
		s1.setName("Pramod");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
