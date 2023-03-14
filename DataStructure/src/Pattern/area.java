package Pattern;

public class area {
	
	 public void area(double radius)
	   {    
		 	double x = 3.14*radius*radius;
		   System.out.println("area of circle = "+x);
	   }
	   
    public void area(int length,int breadth)
	   {
    		int x= length*breadth;
		   System.out.println("area of rectangle = "+x);
	   }
	   public void area(int side)
	   {
		   	int x =side*side;
		   System.out.println("area of square = "+x);
	   }
	   
	   public static void main(String[]args)
		 {   
		     
			 area obj=new area();
			 obj.area(4.6);   //circle
			 
			 obj.area(4,5);    //rectangle
			 obj.area(6);   //square
		 
		 
		 }

}
