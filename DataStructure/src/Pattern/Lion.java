package Pattern;

//Q2) Create a class Lion with following members:
//● String name;
//● boolean isHungry;
//● int age;
//● static int totalDeaths;
//● static printKillings() : void
//● thinking() : void
//printKillings() should print this ("Total killings by lions in jungle = "+ totalDeaths);
//Implement thinking() in the following manner-
//● if isHungry=false then print LionName is sleeping;
//● if isHungry=true and age>12 then increase the totalDeaths by two and print lionName has eaten two
//animal
//● if isHungry=true and age<=12 and age >=2 then increase the totalDeaths by one and print lionName
//has eaten one animal
//● if isHungry=true and age<2 then print lionName is calling Mom;
//Inside the main method of Lion Make 3 objects(lion1, lion2, lion3) of class Lion and assign valid values to
//variables and call thinking() for each object. then print totalDeaths by calling printKillings() ;
//Sample outputlion1 has killed two animal
//lion2 has killed one animal
//lion is sleeping
//Total Killings by lion in jungle 3
//Note: This output is just for reference, you can assign any value to the lion object.





public class Lion {
	
	String name;
	
	boolean isHungry;
	
	int age;
	
	static int totalDeaths;
	
	static int total = 0;
	
	public static void printKillings() {
		System.out.println("Total killings by lions in jungle = " + total);
	}
	
	public void thinking() {
		if (isHungry==false) {
			System.out.println(name +" is sleeping");
		}
		else if(isHungry==true && age>12){
			int eaten = totalDeaths+2;
			total= total+2;
			System.out.println(name +" has eaten  animal "+eaten);
		}
		else if(isHungry=true && age<=12 && age >=2) {
			int eaten = totalDeaths+1;
			total++;
			System.out.println(name +" has eaten  animal " + eaten);
		}
		else if(isHungry=true && age<2) {
			System.out.println(name +" is calling Mom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion1 = new Lion();
		lion1.name = "Bada Sher";
		lion1.isHungry = true;
		lion1.age = 11;
		
		lion1.thinking();
		
		
		Lion lion2 = new Lion();
		
		lion2.name = "Javan Sher";
		lion2.isHungry = true;
		lion2.age = 11;
		
		lion2.thinking();
		
		Lion lion3 = new Lion();
		
		lion3.name = "Chhota Sher";
		lion3.isHungry = true;
		lion3.age = 1;
		
		lion3.thinking();
		
		printKillings() ;
		
		
	
		
		
		

	}

	private static void thinking(Lion lion1) {
		// TODO Auto-generated method stub
		
	}

}

