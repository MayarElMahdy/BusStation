 package Classes;
 import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.*;
import java.util.*;

public class files {
		
		private Formatter x;
		private Scanner y ;
		private BufferedWriter bw;
		int flag=0 ;
		int i=0;
		int sizeEx ;
		int sizeIn ;
		int sizereserve ;
		int sizeCars;
		int sizeMiniBus;
		int size;
		Buses[] p;
		Reservations[] r ;
		 void changePass(String Password)
		 {
		     try{
		    	    // Create file 
		    	    FileWriter fstream = new FileWriter("Pass.txt",false);
		    	    BufferedWriter out = new BufferedWriter(fstream);
		    	    out.write(Password);
		    	    //Close the output stream
		    	    out.close();
		    	    }catch (Exception e){//Catch exception if any
		    	      System.err.println("Error: " + e.getMessage());
		    	    } 
		    	  }
		 
		 void AddTrip(String[] Trips,String filename)
		 {
		     try{
		    	    // Create file 
		    	    FileWriter fstream = new FileWriter(filename,true);
		    	    BufferedWriter out = new BufferedWriter(fstream);
		    	    for(int i=0 ; i< Trips.length ; i++)
		    	    { out.write(Trips[i]);}
		    	    //Close the output stream
		    	    out.close();
		    	    }catch (Exception e)
		               {//Catch exception if any
		    	         System.err.println("Error: " + e.getMessage());
		   	    }
    	  }
		 
		 public Buses[] Read_File_ToBuses() {
		        try {
		        	int i=0;
		        	size=0;
		        	Buses[]  p = new Buses[30];
		            File f = new File("Buses.txt");
		            Scanner sc = new Scanner(f);
		            size=0;
		            while(sc.hasNextLine())
		            {
		                String line = sc.nextLine();
		                String[] details = line.split(",");
		                String name = details[0];
		                int vehicleNum = Integer.parseInt(details[1]);
		                int numberOfSeats = Integer.parseInt(details[2]);
		                int totalSeats = Integer.parseInt(details[3]);
		                int numberOfVehicles = Integer.parseInt(details[4]);
		                p[i]= new Buses(name, vehicleNum, numberOfSeats , totalSeats , numberOfVehicles);
		                size++; 
		                i++; 
		            }
		           
		            sc.close();
		            return p;
		        } catch (FileNotFoundException e) {         
		            System.out.println("File not found");
		            return null;
		        }
		    }
	
		public Cars[] Read_File_ToCars() {
			try {
	        	int i=0;
	        	sizeCars=0;
	        	 Cars[]  pi = new Cars[30];
	            File f = new File("Cars.txt");
	            Scanner sc = new Scanner(f);
	            sizeCars=0;
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(",");
	                String name = details[0];
	                int numberOfSeats = Integer.parseInt(details[1]);
	                int numberOfVehicles = Integer.parseInt(details[2]);
	                pi[i]= new Cars(name, numberOfSeats,  numberOfVehicles);
	               sizeCars++; 
	                i++; 
	            }
	           
	            sc.close();
	            return pi;
	        } catch (FileNotFoundException e) {         
	            System.out.println("File not found");
	            return null;
	        }
	    }
		public MiniBus[] Read_File_ToMiniBus() {
			try {
	        	int i=0;
	        	sizeMiniBus=0;
	        	MiniBus[]  p = new MiniBus[30];
	            File f = new File("MiniBus.txt");
	            Scanner sc = new Scanner(f);
	            size=0;
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(",");
	                String name = details[0];
	                int vehicleNum = Integer.parseInt(details[1]);
	                int numberOfSeats = Integer.parseInt(details[2]);
	                int totalSeats = Integer.parseInt(details[3]);
	                int numOfVehicles = Integer.parseInt(details[4]);
	                p[i]= new MiniBus(name, vehicleNum,  numberOfSeats , totalSeats , numOfVehicles);
	                sizeMiniBus++; 
	                i++; 
	            }
	           
	            sc.close();
	            return p;
	        } catch (FileNotFoundException e) {         
	            System.out.println("File not found");
	            return null;
	        }
	        
	    }
		
		public Reservations[] Read_File_ToReservations() {
	        try {
	        	int i=0;
	        	sizereserve=0;
	        	 Reservations[]  p = new Reservations[30];
	             File f = new File("Reservations.txt");
	             Scanner sc = new Scanner(f);
	            sizereserve=0;
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(",");
	                String Client = details[0];
	                String destination = details[1];
	                String vehicle  =details[2];
	                String vehicleNum = details[3];
	                String ticketClass = details[4];
	                int NumOfSeats = Integer.parseInt(details[5]);
	                p[i]= new Reservations(Client, destination,  vehicle , vehicleNum , ticketClass , NumOfSeats);
	               sizereserve++; 
	                i++; 
	            }
	            sc.close();
	            return p;
	            
	        }   
	        catch (FileNotFoundException e)
	        {         
	            System.out.println("File not found");
	            return null;
	        }
	    }
		
		
	
		
		public Trips[] Read_File_ToExTrips() {
	        try {
	        	sizeEx=0;
	        	int i=0;
	            Trips[]  p = new Trips[30];
	            File f = new File("ExternalTrips.txt");
	            Scanner sc = new Scanner(f);
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(",");
	                String type ="External" ;
	                String destination = details[0];
	                Double price = Double.parseDouble(details[1]);
	                p[i]= new Trips(type, destination,  price);
	                i++; 
	                sizeEx++;
	            }
	           
	            return p;
	        } catch (FileNotFoundException e) {         
	            System.out.println("File not found");
	            return null;
	        }
	    }
		
		
		public Trips[] Read_File_ToIntTrips() {
	        try {
	        	sizeIn=0;
	        	int i=0;
	            Trips[]  p = new Trips[30];
	            File f = new File("InternalTrips.txt");
	            Scanner sc = new Scanner(f);
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                String[] details = line.split(",");
	                String type ="Internal" ;
	                String destination = details[0];
	                Double price = Double.parseDouble(details[1]);
	                p[i]= new Trips(type, destination,  price);
	                i++;
	                sizeIn++;
	            }
	           
	            return p;
	        } catch (FileNotFoundException e) {         
	            System.out.println("File not found");
	            return null;
	        }
	    }
		
		
			 
			 public String readPass()
			 {
				   try {
			        	
					   String line = null;
			            File f = new File("Pass.txt");
			            Scanner sc = new Scanner(f);
			            while(sc.hasNextLine()){
			                 line = sc.nextLine();
			          
			            }
			            
						return line;
			            
			        } catch (FileNotFoundException e) {         
			            System.out.println("File not found");
			            return null;
			        }
			
					
			 }

			 void writeToExTrips(Trips ExTrips[]) 
			 {
				 try {
					 File f = new File("ExternalTrips.txt");
					 FileWriter fstream = new FileWriter(f,false);
					 PrintWriter out = new PrintWriter(fstream);
					 out.print(ExTrips[0].destination+"," + ExTrips[0].price);
					 int i=1;
			     while(i<sizeEx){
			    	  out.println();
			          out.print(ExTrips[i].destination+"," + ExTrips[i].price);
			          out.flush();
			    	  i++;
			     }
			    	  out.close();
			       }catch (IOException ioe) {
				 System.out.println("Not Found");
			      }                      
			 
			      }
			 
			 void writeToInTrips(Trips InTrips[]) 
			 {
				 try {
					
					 File f = new File("InternalTrips.txt");
					 FileWriter fstream = new FileWriter(f,false);
					 PrintWriter out = new PrintWriter(fstream);
					 out.print( InTrips[0].destination+"," + InTrips[0].price);
					 int i=1;
			     while(i<sizeIn){
			    	  out.println();
			          out.print( InTrips[i].destination+"," + InTrips[i].price);
			          out.flush();
			    	  i++;
			     }
			    	  out.close();
			       }catch (IOException ioe) {
				 System.out.println("Not Found");
			      } 
			 }
			 
			 void writeToBus(Buses buses[]) 
			 {
				 try {
					 p = new Buses[30];
					 p=buses;
					 File f = new File("Buses.txt");
					 FileWriter fstream = new FileWriter(f,false);
					 PrintWriter out = new PrintWriter(fstream);
					 out.print(p[0].name+"," +p[0].vehicleNumber+","+ p[0].numberOfSeats+","+p[0].totalSeats+"," + p[0].numberOfVehicles);
					 int i=1;
					 
					 while(i<size)
					 {
			    	  out.println();
			          out.print(p[i].name+ ","+ p[i].vehicleNumber+"," + Integer.toString(p[i].numberOfSeats));
			          out.print(","+p[i].totalSeats+","+Integer.toString(p[i].numberOfVehicles));
			          out.flush();
			    	  i++;   
			    	  
					 }
			    	  out.close();
			       }catch (IOException ioe) {
				 System.out.println("Not Found");
			      }                      
				
				
			 
			      }
			 void writeToCars(Cars cars[])
			 {
				 
					 try {
							
						 File f = new File("Cars.txt");
						 FileWriter fstream = new FileWriter(f,false);
						 PrintWriter out = new PrintWriter(fstream);
						 out.print(cars[0].name+"," + cars[0].numberOfSeats+"," + cars[0].numberOfVehicles);
						 int i=1;
				     while(i<sizeCars){
				    	  out.println();
				          out.print(cars[i].name+ "," + Integer.toString(cars[i].numberOfSeats));
				          out.print(","+Integer.toString(cars[i].numberOfVehicles));
				          
				          out.flush();
				    	  i++;
				     }
				    	  out.close();
				       }catch (IOException ioe) {
					 System.out.println("Not Found");
				      } 

			          
			    	  
			    
				
			 }
			 void writeToMinibus(MiniBus minibus[])
			 {
				 
					 try {
							
						 File f = new File("MiniBus.txt");
						 FileWriter fstream = new FileWriter(f,false);
						 PrintWriter out = new PrintWriter(fstream);
						 out.print(minibus[0].name+","+ minibus[0].vehicleNumber+","+ minibus[0].numberOfSeats+"," +minibus[0].totalSeats+"," +minibus[0].numberOfVehicles);
						 int i=1;
				     while(i<sizeMiniBus){
				    	  out.println();
				          out.print(minibus[i].name+ ","+ minibus[i].vehicleNumber+"," + Integer.toString(minibus[i].numberOfSeats));
				          out.print(","+Integer.toString(minibus[i].totalSeats));
				          out.print(","+Integer.toString(minibus[i].numberOfVehicles));
				          
				          out.flush();
				    	  i++;
				     }
				    	  out.close();
				       }catch (IOException ioe) {
					 System.out.println("Not Found");
				      } 

			          
			    	  
			    
				
			 }
			 void writeToReservations(Reservations reservations[])
			 {
				 try {
					  r = new Reservations[30];
					  r= reservations;
					  File f = new File("Reservations.txt");
					  FileWriter fstream = new FileWriter(f,false);
					  PrintWriter out = new PrintWriter(fstream);
					  out.print(r[0].Client+"," + r[0].destination+"," + r[0].vehicle + ","
					                + r[0].vehicleNum +"," + r[0].ticketClass + "," + r[0].NumOfSeats);
					  int i=1;
			          while(i<sizereserve){
			    	  out.println();
			          out.print(r[i].Client+ "," + r[i].destination);
			          out.print(","+r[i].vehicle + "," + r[i].vehicleNum +"," + r[i].ticketClass + "," + r[i].NumOfSeats);
			          out.flush();
			    	  i++;	  
			     }
			    	  out.close();
			       }catch (IOException ioe) {
				 System.out.println("Not Found");
			      }                 
				
			 }
			 
				
			 
			      
	

	
		
	}