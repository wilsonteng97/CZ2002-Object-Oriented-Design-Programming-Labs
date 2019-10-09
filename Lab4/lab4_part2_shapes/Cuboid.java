package lab4_part2_shapes;

import java.lang.Math;

public class Cuboid extends Rectangle{
	@Override
	public double getArea() {
		double sides = super.getArea() * 4;
		double topandbtm = Math.pow(this.getBreath(), 2) * 2;
		
		double area = sides + topandbtm;
		return area;
	}

}
