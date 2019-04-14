package Classes;
public abstract class Vehicles implements VehiclesInterface {
	
	int numberOfSeats;
	int numberOfVehicles;
	int vehicleNumber ;
	
	public Vehicles(int numberOfSeats,int numberOfVehicles)
	{
		this.numberOfSeats = numberOfSeats;
		this.numberOfVehicles = numberOfVehicles;
		
	}
	

}
