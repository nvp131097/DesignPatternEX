package com.singlton;

public class EnumSingleton {

	public static void main(String[] args) {
		
		Test t = Test.INSTANCE;
		t.getInstance();
	}

}

enum Test
{
	INSTANCE;
	
	
	public static void getInstance()
	{
		System.out.println("Hello enum");
	}
}