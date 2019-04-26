package FactoryPatternTP;

public class FactoryClass {

	
	public IShape getInstance(String className)
	{
		if(className.equalsIgnoreCase("square"))
				return new Square();
		else if(className.equalsIgnoreCase("rectangele"))
				return new Rectangle();
		else if(className.equalsIgnoreCase("circle"))
				return new Circle();
		return null;
	}
}
