package Classes;



public class Buses extends Vehicles{

	
	String name;
	int vehicleNumber;
	int totalSeats ;
	public Buses(String name,int vehicleNumber, int numberOfSeats, int totalSeats , int numberOfVehicles) {
		super(numberOfSeats, numberOfVehicles);
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.totalSeats = totalSeats ;
		
	}
	int maxSeats = 40;
	
	@Override
	public void increaseTheVehicles() {
		numberOfVehicles++;
		
	}

	@Override
	public void decreaseNumberOfSeats() {
		// TODO Auto-generated method stub
		numberOfSeats--;
	}

	@Override
	public void decreaseNumberOfVehicles() {
		// TODO Auto-generated method stub
		numberOfVehicles--;
		
	}

}
