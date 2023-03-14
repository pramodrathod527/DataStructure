package Pattern;

public class corection {

		static String Employee_name;
		static  float Employee_salary;
		 
		public static void set(String n, float p) {
		 Employee_name = n;
		 Employee_salary = p;
		 }
		 
		 static void get() {
		 System.out.println("Employee name is: " +Employee_name );
		 System.out.println("Employee CTC is: " + Employee_salary);
		 }
		 
		 public static void main(String args[]) {
			 corection.set("Class", 10000.0f);
			 corection.get();
		 }

}
		

	


