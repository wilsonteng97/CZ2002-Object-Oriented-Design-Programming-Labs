package lab3;
import java.util.Arrays;
import java.util.Comparator;

public class Plane {
	
	private PlaneSeat[] seat;
	private int numEmptySeat;
	private static int NUM_OF_SEATS = 12;
	
	// Constructors
	public Plane() {
		this.seat = new PlaneSeat[12];
		for (int i=0; i<12; i++) {
			this.seat[i] = new PlaneSeat(i+1);
		}
		this.numEmptySeat = NUM_OF_SEATS;
	}
	
	// Methods
	public PlaneSeat[] sortSeats() {
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
	
	
	public static void main(String[] args) {
		
	}

}
