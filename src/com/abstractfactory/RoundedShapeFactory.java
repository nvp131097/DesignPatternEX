package com.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new RoundRactangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new RoundSquare();
		}
		return null;
	}

}
