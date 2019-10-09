package lab4_part2_shapes;

import java.util.Scanner;

public class Shape2DApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many shapes do you want to add? : ");
		int numOfShapes = sc.nextInt();
		
		Shape[] shapes = new Shape[numOfShapes];
		
		int choice;
		for (int i=1; i<=numOfShapes; i++) {
			System.out.println("===Enter shape #" + (i) + "===");
			System.out.println("[1 Square], [2 Rectangle], [3 Circle], [4 Triangle]");
			
			choice = sc.nextInt();
			if (choice<1 || choice>4) {
				System.out.println("Shape not regconised, please enter shape #" + (i) + " again!");
				i--;
			}
			else {
				switch (choice) {
				case 1:
					Square squ = new Square();
					squ.getMeasurements();
					shapes[i-1] = squ;
					break;
				case 2:
					Rectangle rec = new Rectangle();
					rec.getMeasurements();
					shapes[i-1] = rec;
					break;
				case 3:
					Circle cir = new Circle();
					cir.getMeasurements();
					shapes[i-1] = cir;
					break;
				case 4:
					Triangle tri = new Triangle();
					tri.getMeasurements();
					shapes[i-1] = tri;
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
