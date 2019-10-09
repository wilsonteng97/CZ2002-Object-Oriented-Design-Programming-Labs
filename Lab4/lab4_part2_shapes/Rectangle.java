package lab4_part2_shapes;

import java.util.Scanner;

public class Rectangle extends Shape {
	private static final int DIMENSION = 2;

	private double length;
	private double breath;
	private int dimension;
	
	// Constructor
	public Rectangle() {
		this.dimension = DIMENSION;
	}
	
	// Override Methods
	@Override
	public double getArea() {
		return length * breath;
	}

	@Override
	public int getDimension() {
		return this.dimension;
	}
	
	@Override
	public void getMeasurements() {
		this.setLength();
		this.setBreath();
	}
	
	// Methods
	public double getLength() {
		return this.length;
	}
	
	public double getBreath() {
		return this.breath;
	}
	
	public void setLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		double length = sc.nextDouble();
		this.length = length;
	}
	
	public void setBreath() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Breath: ");
		double breath = sc.nextDouble();
		this.breath = breath;
	}
}
