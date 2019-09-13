package lab3;
//import java.util.Random;

public class PlaneSeat {
	private int seatId, customerId;
	private boolean assigned;
	
	// Constructor
	public PlaneSeat(int seatId) {
		this.seatId = seatId;
		this.customerId = -1;
		this.assigned = false;
	}
	
	// Methods
	public int getSeatID() {
		return seatId;
	}
	
	public int getCustomerID() {
		return customerId;
	}
	
	public boolean isOcuppied() {
		return assigned;
	}
	
	public void assign(int customerId) {
		this.customerId = customerId;
		this.assigned = true;
	}
	
	public void unAssign() {
		this.customerId = -1;
		this.assigned = false;
	}
	
//	public static void main(String[] args) {
//		
//	}

}
