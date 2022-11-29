package com.singlton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	public static void main(String[] args) {
		
		App eager1 = App.getInstance();
		App eager2 = null;
		
		try
		{
			Constructor[] constructors = App.class.getDeclaredConstructors();
			for(Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				eager2 = (App) constructor.newInstance();
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(eager1.hashCode());
		System.out.println(eager2.hashCode());

	}

}
