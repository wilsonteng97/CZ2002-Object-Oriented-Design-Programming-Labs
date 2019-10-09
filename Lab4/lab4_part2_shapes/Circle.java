package lab4_part2_shapes;

import java.lang.Math;
import java.util.Scanner;

public class Circle extends Shape {
	private static final int DIMENSION = 2;
	private static final double PI = Math.PI;

	private double radius;
	private int dimension;
	
	// Constructor
	public Circle() {
		this.dimension = DIMENSION;
	}
	
	// Override Methods
	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	@Override
	public int getDimension() {
		return this.dimension;
	}
	
	@Override
	public void getMeasurements() {
		this.setRadius();
	}
	
	// Methods
	public double getCircumference() {
		return 2 * PI * radius;
	}
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();
		this.radius = radius;	
	}
}
