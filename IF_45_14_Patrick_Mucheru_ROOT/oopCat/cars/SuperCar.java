package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperCar extends Car {
	//Declaration of Class Super Car variables
    
	SuperCar[] superCars = new SuperCar[20];
    ArrayList<SuperCar> superCarList = new ArrayList<SuperCar>();

    public SuperCar(int carNumber, String name, double engineCapacity, double mileage,
    		double fuel, double leftFuel, double userSpeed, double userTime) {
        this.carNumber = carNumber;
        this.name = name;
        this.fuel = fuel;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.leftFuel = leftFuel;
        // Instantiation of new Engine for new Car object
        engine = new Engine(mileage, engineCapacity);
    }
	
	public SuperCar() {
		
		super();
	}
	public void createSuperCar() {
	    	//User's new Car name
	        Scanner superCarName = new Scanner(System.in);
	        System.out.println(" Create Super Car Name :");
	        String carName  = superCarName.nextLine();
	        //User's new Car engine Capacity
	        Scanner superCarEngineCapacity = new Scanner(System.in);
	        System.out.println(" Create Super Car's Engine Capacity : ");
	        Double carEngineCapacity = superCarEngineCapacity.nextDouble();
	        //User's new Car mileage
	        Scanner superCarMileage = new Scanner(System.in);
	        System.out.println(" Create Super Car's mileage :");
	        Double carMileage = superCarMileage.nextDouble();
	        // User's new Car Fuel Capacity
	        Scanner superCarFuel = new Scanner(System.in);
	        System.out.println("Enter fuel level in litres : ");
	        Double carFuel = superCarFuel.nextDouble();
	        //Adds the new car object into a new array of class Car
	        userCar[i] = new Car( i, carName, carEngineCapacity, carMileage, carFuel, carFuel);
	        carList.add(userCar[i]);
	        
	        //User inputs new Car speed
	        Scanner newSpeed = new Scanner(System.in);
	        System.out.println("Enter Super Car Speed : ");
	        this.userSpeed = newSpeed.nextDouble();
	        // User inputs new Car time of travel
	        Scanner newTime = new Scanner(System.in);
	        System.out.println("Enter Supercar Travel Time in Hours : ");
	        this.userTime = newTime.nextDouble();
	        //User's new Car starts automatically
	        superCars[i] = new SuperCar( i, carName, carEngineCapacity, carMileage, carFuel, carFuel, userSpeed, userTime);
	        superCars[i].start(userSpeed, userTime);
	        superCars[i].mileage = userCar[i].getMileage();
	        
	        //user's car is turned off
	        superCars[i].turnOff();
	        
	        //user's car information is output to user's console
	        System.out.println("Super Car number : " + superCars[i].carNumber);
	        // Every Car has a number which is it's position in the array
	        System.out.println(" Super Car's name is " + superCars[i].getName());
	        System.out.println("Super Car's Engine Capacity is " + superCars[i].getEngineCapacity());
	        System.out.println(" Current Mileage " + superCars[i].getMileage() + " Kilometres");
	        System.out.println(" Fuel volume is " + superCars[i].getFuel() + " litres");
	        System.out.println(" Using Fuel at " + superCars[i].getFuelEconomy() + " litres per 100 Kilometres");
	        System.out.println("Used Fuel is " + superCars[i].getUsedFuel() + " litres");
	        System.out.println("Fuel left is " + superCars[i].fuelLeft() + " litres\n");
	 	
	}
	public void retrieveSuperCar(){
	    Scanner carGet =  new Scanner(System.in);
        // The user can check the car number from the previous entries on the console
        System.out.println("Enter the Car name to Retreive");
        
        String search2 = carGet.nextLine();
        for (int a = 0 ; a < superCarList.size(); a++ ){
            if (superCarList.get(a).name.contains(search2)){
                
                 // The retreival displays the the car's name, engine capacity and mileage
                System.out.println("Car number : " + a);
                System.out.println("Car name " + superCarList.get(a).name );
                System.out.println("Car displacement " + superCarList.get(a).engineCapacity +" cc ");
                System.out.println("Car mileage " + superCarList.get(a).mileage +" km");
                System.out.println("Car Fuel Deficit " + superCarList.get(a).leftFuel +" litres \n");
            }else {
                System.out.println("No car matches your search");
            }
        }
	}
	public void editSuperCar(){
	    Scanner carEdit = new Scanner(System.in);
        System.out.println("Enter the Car name to Edit");
        
        
        String search3 = carEdit.nextLine();
        for (int a = 0 ; a < superCarList.size(); a++ ){
            if (superCarList.get(a).name.contains(search3)){
                // the user can edit the car name
                Scanner newCarName = new Scanner(System.in);
                System.out.println("Enter new name");
                superCarList.get(a).name = newCarName.nextLine();
                //the user can edit the car's engine capacity
                Scanner newCarCapacity = new Scanner(System.in);
                System.out.println("Enter new Car Engine Capacity");
                superCarList.get(a).engineCapacity = newCarCapacity.nextDouble();
                // the user can edit the car's engine displacement
                Scanner newCarMileage = new Scanner(System.in);
                System.out.println("Enter new Mileage");
                superCarList.get(a).mileage = newCarMileage.nextDouble();
    
            }else {
                System.out.println("No car matches your search");
            }
        }
    }
    public void deleteSuperCar(){
        	Scanner carDelete = new Scanner(System.in);
        // The user can check the car number from the previous entries on the console
        System.out.println("Enter the Car name to Delete");
        
        String search1 = carDelete.nextLine();
        for (int a = 0 ; a < superCarList.size(); a++ ){
            if (superCarList.get(a).name.contains(search1)){
                superCarList.remove(a);
                System.out.println("Entry Deleted \n");
                
            }else {
                System.out.println("No car matches your search");
            }
        }
    }
    
	
}
