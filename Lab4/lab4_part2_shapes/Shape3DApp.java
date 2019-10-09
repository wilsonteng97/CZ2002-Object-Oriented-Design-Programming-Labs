package lab4_part2_shapes;

import java.util.Scanner;

public class Shape3DApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many shapes do you want to add? : ");
		int numOfShapes = sc.nextInt();
		
		Shape[] shapes = new Shape[numOfShapes];
		
		int choice;
		for (int i=1; i<=numOfShapes; i++) {
			System.out.println("===Enter shape #" + (i) + "===");
			System.out.println("(1 Sphere), (2 Square Base Pyramid), (3 Cuboid)");
			
			choice = sc.nextInt();
			if (choice<1 || choice>3) {
				System.out.println("Shape not regconised, please enter shape #" + (i) + " again!");
				i--;
			}
			else {
				switch (choice) {
				case 1:
					Sphere cir = new Sphere();
					cir.getMeasurements();
					shapes[i-1] = cir;
					break;
				case 2:
					Pyramid tri = new Pyramid();
					tri.getMeasurements();
					shapes[i-1] = tri;
					break;
				case 3:
					Cuboid rec = new Cuboid();
					rec.getMeasurements();
					shapes[i-1] = rec;
					break;
				default:
					break;
				}
				System.out.println();
			}
		}
		
		double result = 0;
		for (Shape sh : shapes) {
//			System.out.println(sh.getArea());
			result += sh.getArea();
		}
		System.out.println("Total Area is : " + result);
	}
}
