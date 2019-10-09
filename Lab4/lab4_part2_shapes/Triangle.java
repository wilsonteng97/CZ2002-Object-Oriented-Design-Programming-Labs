package lab4_part2_shapes;

import java.util.Scanner;

public class Triangle extends Shape {
	private static final int DIMENSION = 2;

	private double base;
	private double height;
	private int dimension;
	
	// Constructor
	public Triangle() {
		this.dimension = DIMENSION;
	}
	
	// Override Methods
	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	@Override
	public int getDimension() {
		return this.dimension;
	}
	
	@Override
	public void getMeasurements() {
		this.setBase();
		this.setHeight();
	}
	
	// Methods
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setBase() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base: ");
		double base = sc.nextInt();
		this.base = base;
	}
	
	public void setHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height: ");
		double height = sc.nextDouble();
		this.height = height;
	}
}
