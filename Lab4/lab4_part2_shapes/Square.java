package lab4_part2_shapes;

import java.util.Scanner;

public class Square extends Shape {
	private static final int DIMENSION = 2;

	private double length;
	private int dimension;
	
	// Constructor
	public Square() {
		this.dimension = DIMENSION;
	}
	
	// Override Methods
	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public int getDimension() {
		return this.dimension;
	}
	
	@Override
	public void getMeasurements() {
		this.setLength();
	}
	
	// Methods
	public double getLength() {
		return this.length;
	}
	
	public void setLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		double length = sc.nextDouble();
		this.length = length;
	}
}
