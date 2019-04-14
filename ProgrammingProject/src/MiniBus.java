
public class MiniBus extends Vehicles {

	String name;
	int vehicleNumber;
	int totalSeats ;
	public MiniBus(String name,int vehicleNumber, int numberOfSeats, int totalSeats , int numberOfVehicles) {
		super(numberOfSeats, numberOfVehicles);
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.totalSeats = totalSeats ;
		
	}

	int maxSeats = 12;
	@Override
	public void increaseTheVehicles() {
		// TODO Auto-generated method stub
		numberOfVehicles ++;
		
	}

	@Override
	public void decreaseNumberOfSeats() {
		// TODO Auto-generated method stub
		numberOfSeats --;
		
	}

	@Override
	public void decreaseNumberOfVehicles() {
		// TODO Auto-generated method stub
	}
	

}
