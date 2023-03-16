package javaDemo;

public class Rectangle implements Shape {

	int length=34;
	int width=15;
	@Override
	public void Drop() {
		
		int area=length*width;
		System.out.println("The Area of Rectangle: "+area);
		
	}
}
