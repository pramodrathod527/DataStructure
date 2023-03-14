package com.app;

interface ABC{
	void show();
}

class implementor implements ABC{

	public void show() {
		System.out.println("Anything!");
	}
	
}

public class interfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC obj = new implementor();
		obj.show();

	}

}
