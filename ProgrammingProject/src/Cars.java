
public class Cars extends Vehicles{
	

	String name;
	String brand;
	public Cars(String name,int numberOfSeats,int numberOfVehicles)
	{
		super(numberOfSeats, numberOfVehicles);
		this.numberOfVehicles = numberOfVehicles;
		this.name=name;
		
	}


	@Override
	public void increaseTheVehicles() {
		// TODO Auto-generated method stub
		numberOfVehicles ++;
		
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
