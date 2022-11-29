package com.singlton;

public class BillPugh {

	public static void main(String[] args) {
		
		App4 obj1 = App4.getInstance();
		App4 obj2 = App4.getInstance();
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are same");
		

	}

}

class App4
{

	private App4()
	{
		System.out.println("Hello Bill Pugh singleton..");
	}
	
	private static class SingletonHelper
	{
		private static final App4 pugh = new App4();
	}
	
	public static App4 getInstance()
	{
		return SingletonHelper.pugh;
	}
	
}