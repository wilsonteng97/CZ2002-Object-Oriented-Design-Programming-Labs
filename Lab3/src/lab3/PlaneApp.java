package lab3;
import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plane myPlane = new Plane();
		
		int choice, seatID, custID;
		System.out.println("Welcome to PlaneApp Services!");
		
		do {
			System.out.println("(1) Show number of empty seats.");
			System.out.println("(2) Show the list of empty seats.");
			System.out.println("(3) Show the list of seat assignments by seat ID");
			System.out.println("(4) Show the list of seat assignments by customer ID");
			System.out.println("(5) Assign a customer to a seat");
			System.out.println("(6) Remove a seat assignment");
			System.out.println("(7) Exit");
			
			System.out.print("	Please enter your choice : ");
			choice = sc.nextInt();
//			while (choice>7 || choice<1) {
//				System.out.println("Please re-enter your choice");
//				choice = sc.nextInt();
//			}
			
			switch(choice) {
			case 1:
				myPlane.showNumEmptySeats();
				break;
			case 2:
				myPlane.showEmptySeats();
				break;
			case 3:
				myPlane.showAssignedSeats(true);
				break;
			case 4:
				myPlane.showAssignedSeats(false);
				break;
			case 5:
				System.out.println("Assigning Seat ..");
				System.out.print("	Please enter SeatID: ");
				seatID = sc.nextInt();
				System.out.print("	Please enter Customer ID: ");
				custID = sc.nextInt();
				myPlane.assignSeat(seatID, custID);
				break;
			case 6:
				System.out.print("	Enter SeatID to unassign customer from: ");
				seatID = sc.nextInt();
				myPlane.unAssignSeat(seatID);
				break;
			case 7:
				System.out.println("Program terminated...");
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
		} while (choice>0 && choice!=7);
	}

}
