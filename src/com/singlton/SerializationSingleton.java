package com.singlton;

import java.io.Serializable;

public class SerializationSingleton {

	public static void main(String[] args) {
		
		App5 obj = App5.getInstance();

	}

}

class App5 implements Serializable
{
	private static final long serialVersionUID = 50L;
	
	private App5()
	{
		System.out.println("Hello Serialization Singleton");
	}
	
	private static class SingletonHelper
	{
		private static final App5 serialize = new App5();
	}
	
	public static App5 getInstance()
	{
		return SingletonHelper.serialize;
	}
}
