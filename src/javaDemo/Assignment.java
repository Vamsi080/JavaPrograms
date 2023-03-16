package javaDemo;
import java.lang.Math;
public class Assignment {  //Program on Java Math Class

	public static void main(String[] args) {
		
		double angle = Math.PI / 4; // angle in radians
		double sinVal = Math.sin(angle);
		double cosVal = Math.cos(angle);
		System.out.println("sin(" + angle + ") = " + sinVal);
		System.out.println("cos(" + angle + ") = " + cosVal);
	}

}
