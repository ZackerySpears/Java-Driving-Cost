import java.util.Scanner;

public class LabProgram {
   
   //Driving Cost method 
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
      double drivingCost;
      //Gets the total Driving cost 
      drivingCost = milesDriven / milesPerGallon * dollarsPerGallon;
      
      return drivingCost; 
   }
   
   public static void main(String[] args) {
      double milesPerGallon;
      double dollarsPerGallon;
      
      Scanner scnr = new Scanner(System.in);
      //Get's user input for miles per gallon and dollars per gallon
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      scnr.close();
      
      //Prints out to the user the driver total cost for 10 miles, 50 miles and 400 miles
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
   }
}
