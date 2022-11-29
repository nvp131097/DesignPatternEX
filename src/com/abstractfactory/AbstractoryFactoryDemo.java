package com.abstractfactory;

public class AbstractoryFactoryDemo {

	public static void main(String[] args) {
		
		//get shape factory
		AbstractFactory shapefactory = FactoryProducer.getFactory(false);
		
		//get an object of shape Rectangle
		Shape shape1 = shapefactory.getShape("RECTANGLE");
		shape1.drawing();
		
		//get an object of shape Square
		Shape shape2 = shapefactory.getShape("SQUARE");
		shape2.drawing();
		
		AbstractFactory shapefactory1 = FactoryProducer.getFactory(true);
		
		
		Shape shape3 = shapefactory1.getShape("RECTANGLE");
		shape3.drawing();
		
		Shape shape4 = shapefactory1.getShape("SQUARE");
		shape4.drawing();

	}

}
