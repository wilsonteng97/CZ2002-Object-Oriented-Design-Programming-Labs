package lab4_part2_shapes;

public class Sphere extends Circle {
	@Override
	public double getArea() {
		// Surface area of sphere = 4 * PI * r * r 
		return super.getArea() * 4;
	}
}
