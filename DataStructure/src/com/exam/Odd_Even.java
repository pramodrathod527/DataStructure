package com.exam;
//write a progrsm to create two threads one thread will print even no.
//between 1 to 50 and other will print odd number between 1to 50;
public class Odd_Even {
	public static void main(String[] args) {
		//thread no.1
		Runnable r1 = new Runnable1();
        Thread t = new Thread(r1);
        t.start();
        //thread.no.2
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();   
	}
}
	//for odd number
class Runnable2 implements Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2 == 1)
                System.out.println("odd number is = "+i);
        }
    }
}
	//for even number
class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2 == 0)
                System.out.println("even number is = "+i);
        }
    }
}