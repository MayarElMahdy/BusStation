package Classes;
public class Reservations {
	
	String Client;//
	String ticketdirection;//
	String type;//
	int NumOfSeats ;
	int phoneNum ;//
	String vehicleNum ;
	String vehicle;//
	String ticketClass;
	String Departing;//
	String destination;//
	Double fees ;
	
	public Reservations(String Client ,  String destination 
			          , String vehicle , String vehicleNum     , String ticketClass , int noseats)
	{   
		
		this.Client = Client;
		this.vehicleNum = vehicleNum ;
		this.destination = destination;
		this.vehicle = vehicle ;
		this.ticketClass = ticketClass;
		this.NumOfSeats = noseats ;
		
	}

}
