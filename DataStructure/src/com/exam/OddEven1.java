package com.exam;

public class OddEven1 {

	public static void main(String[] args) {
		
		Runnable r = new Run();
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = new Run1();
		Thread t1 = new Thread(r1);
		t1.start();

	}
}

class Run implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even numer is = "+i);
			}
		}
	}
	
}

class Run1 implements Runnable{
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println("Odd numer is = "+i);
			}
		}
		
	}
	
}
