package lab3;
import java.util.Arrays;
import java.util.Comparator;

public class Plane {
	
	private PlaneSeat[] seat;
	private int numEmptySeat;
	private static int NUM_OF_SEATS = 12;
	
	// Constructors
	public Plane() {
		this.seat = new PlaneSeat[NUM_OF_SEATS];
		for (int i=0; i<12; i++) {
			this.seat[i] = new PlaneSeat(i+1);
		}
		this.numEmptySeat = NUM_OF_SEATS;
	}
	
	// Methods
	private PlaneSeat[] sortBySeatID() {
		PlaneSeat[] seatCopy = seat.clone();
		Arrays.sort(seatCopy, new Comparator<PlaneSeat>() {
			@Override 
			public int compare(PlaneSeat p1, PlaneSeat p2) {
//				return p1.getCustomerName().compareTo(p2.getCustomerName()); // for comparing strings
				return p1.getSeatID() - p2.getSeatID();
			}
		});
		return seatCopy;
	}
	
	private PlaneSeat[] sortSeats() {
		PlaneSeat[] seatCopy = seat.clone();
		Arrays.sort(seatCopy, new Comparator<PlaneSeat>() {
			@Override 
			public int compare(PlaneSeat p1, PlaneSeat p2) {
//				return p1.getCustomerName().compareTo(p2.getCustomerName()); // for comparing strings
				return p1.getCustomerID() - p2.getCustomerID();
			}
		});
		return seatCopy;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + this.numEmptySeat + " empty seats."); 
		System.out.println();
	}
	
	public void showEmptySeats() {
		if (this.numEmptySeat==0) {
			System.out.println("There are no empty Seats in the Plane!");
			System.out.println();
			return;
		}
		
		System.out.println("The following are empty seats:");
		for (int i=0; i<this.seat.length; i++) {
			if (!this.seat[i].isOccupied()) {
				System.out.println("SeatID " + this.seat[i].getSeatID());
			}
		}
		System.out.println();
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		PlaneSeat[] seatsToDisplay = (bySeatId) ? this.sortBySeatID() : this.sortSeats(); // ? this.seats : this.sortSeats() is possible too since PlaneSeat Array isn't changed.
		System.out.println("Assigned Seats are as shown below:");
		for (PlaneSeat ps : seatsToDisplay) {
			if (ps.isOccupied()) {
				System.out.println("SeatID: " + ps.getSeatID() + " | " +"CustomerID: " + ps.getCustomerID());
			}
		}
		System.out.println();
	}
	
	public void assignSeat(int seatId, int cust_id) {
		if (this.seat[seatId-1].isOccupied()) {
			if (this.numEmptySeat==0) {
				System.out.println("All seats have been assigned!");
				System.out.println(); return;
			}
			else {
				int custID = this.seat[seatId-1].getCustomerID();
				System.out.println("Seat Assigned to CustomerID " + custID + ", please choose another seat!");
				System.out.println(); return;
			}
		}
		
		this.seat[seatId-1].assign(cust_id);
		this.numEmptySeat--;
		System.out.println("Seat Assigned!");
		System.out.println("[SeatID " + seatId + " to customerID " + cust_id + "]");
		System.out.println();
	}
	
	public void unAssignSeat(int seatId) {
		if (this.seat[seatId-1].isOccupied()) {
			int custID = this.seat[seatId-1].getCustomerID();
			this.seat[seatId-1].unAssign();
			this.numEmptySeat++;
			System.out.println("Seat Unassigned!");
			System.out.println("[CustomerID " + custID + " from seatID " + this.seat[seatId-1].getSeatID() + "]");
			System.out.println();
		}
		else {
			System.out.println("Seat is already empty!");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
	}

}
