package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    //Declaration of Class Car variables
    public int carNumber;
    public String name;
    public Engine engine; 
    public double fuel, usedFuel, mileage, engineCapacity, leftFuel, userSpeed, userTime;
    Car[] userCar = new Car[20];
    //Creating an ArrayList of class Car
    ArrayList<Car> carList = new ArrayList<Car>();
    int i;

    //Constructor for Class Car objects
    public Car(int carNumber, String name, double engineCapacity, double mileage, double fuel, double leftFuel) {
        this.carNumber = carNumber;
        this.name = name;
        this.fuel = fuel;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.leftFuel = leftFuel;
        // Instantiation of new Engine for new Car object
        engine = new Engine(mileage, engineCapacity);
    }
    public Car() {
    	this.carNumber = 0;
    	this.name = "car";
    	this.fuel = 0.0;
    	this.engineCapacity = 0;
    	this.mileage = 0;
    	this.leftFuel = 0;
    	this.userSpeed = 0.0;
    	this.userTime = 0.0;
    	engine = new Engine(this.mileage, this.engineCapacity);
    }
    public void testCar() {
    	Car newCar = new Car(99,"Ferrari",2.0, 20000, 15.0, 0);
        
        //Starting Ferrari with 80km/h speed for 5 hours
        newCar.start(80.0, 5.0);
        
        //Turning off Ferrari
        newCar.turnOff();
        
        //Output for Ferrari after being running and turning off
        
        System.out.println("Test Car's name is " + newCar.getName());
        System.out.println(" Test Car's Engine Capacity is " + newCar.getEngineCapacity());
        System.out.println(" Test Car Current Mileage " + newCar.getMileage() + " Kilometres");
        System.out.println(" Test car Fuel volume is " + newCar.fuel + " litres");
        System.out.println(" Test car Fuel Range is " + newCar.getFuelEconomy() + " litres per 100 Kilometres");
        System.out.println("Test Car Used Fuel is " + newCar.getUsedFuel() + " litres");
        System.out.println("Test car Fuel left is " + newCar.fuelLeft() + " litres \n");
    
        
    }
    public void createCar() {
    	//User's new Car name
        Scanner anotherCarName = new Scanner(System.in);
        System.out.println(" Create Car Name :");
        String carName  = anotherCarName.nextLine();
        //User's new Car engine Capacity
        Scanner anotherCarEngineCapacity = new Scanner(System.in);
        System.out.println(" Create new Car's Engine Capacity : ");
        Double carEngineCapacity = anotherCarEngineCapacity.nextDouble();
        //User's new Car mileage
        Scanner anotherCarMileage = new Scanner(System.in);
        System.out.println(" Create Car's mileage :");
        Double carMileage = anotherCarMileage.nextDouble();
        // User's new Car Fuel Capacity
        Scanner anotherCarFuel = new Scanner(System.in);
        System.out.println("Enter fuel level in litres : ");
        Double carFuel = anotherCarFuel.nextDouble();
        //Adds the new car object into a new array of class Car
        userCar[i] = new Car( i, carName, carEngineCapacity, carMileage, carFuel, carFuel);
        carList.add(userCar[i]);
        //User inputs new Car speed
        Scanner newSpeed = new Scanner(System.in);
        System.out.println("Enter Car Speed : ");
        Double userSpeed = newSpeed.nextDouble();
        // User inputs new Car time of travel
        Scanner newTime = new Scanner(System.in);
        System.out.println("Enter Travel Time in Hours : ");
        Double userTime = newTime.nextDouble();
        //User's new Car starts automatically
        userCar[i].start(userSpeed, userTime);
        userCar[i].mileage = userCar[i].getMileage();
        
        //user's car is turned off
        userCar[i].turnOff();
        
        //user's car information is output to user's console
        System.out.println("Car number : " + userCar[i].carNumber);
        // Every Car has a number which is it's position in the array
        System.out.println(" Car's name is " + userCar[i].getName());
        System.out.println("Car's Engine Capacity is " + userCar[i].getEngineCapacity());
        System.out.println(" Current Mileage " + userCar[i].getMileage() + " Kilometres");
        System.out.println(" Fuel volume is " + userCar[i].getFuel() + " litres");
        System.out.println(" Using Fuel at " + userCar[i].getFuelEconomy() + " litres per 100 Kilometres");
        System.out.println("Used Fuel is " + userCar[i].getUsedFuel() + " litres");
        System.out.println("Fuel left is " + userCar[i].fuelLeft() + " litres\n");
        
    }
    public void deleteCar(){
    	Scanner carDelete = new Scanner(System.in);
        // The user can check the car number from the previous entries on the console
        System.out.println("Enter the Car name to Delete");
        
        String search1 = carDelete.nextLine();
        for (int a = 0 ; a < carList.size(); a++ ){
            if (carList.get(a).name.contains(search1)){
                carList.remove(a);
                System.out.println("Entry Deleted \n");
                
            }else {
                System.out.println("No car matches your search");
            }
        }
    }
    public void getCar() {
    	Scanner carGet =  new Scanner(System.in);
        // The user can check the car number from the previous entries on the console
        System.out.println("Enter the Car name to Retreive");
        
        String search2 = carGet.nextLine();
        for (int a = 0 ; a < carList.size(); a++ ){
            if (carList.get(a).name.contains(search2)){
                
                 // The retreival displays the the car's name, engine capacity and mileage
                System.out.println("Car number : " + a);
                System.out.println("Car name " + carList.get(a).name );
                System.out.println("Car displacement " + carList.get(a).engineCapacity +" cc ");
                System.out.println("Car mileage " + carList.get(a).mileage +" km");
                System.out.println("Car Fuel Deficit " + carList.get(a).leftFuel +" litres \n");
            }else {
                System.out.println("No car matches your search");
            }
        }
        
       
    }
    public void editCar() {
    	Scanner carEdit = new Scanner(System.in);
        System.out.println("Enter the Car name to Edit");
        
        
        String search3 = carEdit.nextLine();
        for (int a = 0 ; a < carList.size(); a++ ){
            if (carList.get(a).name.contains(search3)){
                // the user can edit the car name
                Scanner newCarName = new Scanner(System.in);
                System.out.println("Enter new name");
                carList.get(a).name = newCarName.nextLine();
                //the user can edit the car's engine capacity
                Scanner newCarCapacity = new Scanner(System.in);
                System.out.println("Enter new Car Engine Capacity");
                carList.get(a).engineCapacity = newCarCapacity.nextDouble();
                // the user can edit the car's engine displacement
                Scanner newCarMileage = new Scanner(System.in);
                System.out.println("Enter new Mileage");
                carList.get(a).mileage = newCarMileage.nextDouble();
    
            }else {
                System.out.println("No car matches your search");
            }
        }
    }
    public String getName() {
        return name;
    }
    // Setter method for name in Class Car
    public String setName(String newName){
        this.name = newName;
        return newName;
    }
    // Getter method for Engine Capacity in Class Car
    public double getEngineCapacity() {
        return engine.getEngineCapacity();
    }
    // Setter method for Engine Capacity in Class Car
    public double setEngineCap(double newEngineCap){
        engine.engineCapacity = newEngineCap;
        return newEngineCap;
    }
    //Getter method for Car Mileage in Class car
    public double getMileage() {
        return engine.getMileage();
    }
    //Getter method for Fuel of car
    public double getFuel() {
        return this.fuel;
    }
    // Setter method for Fuel of Car
    public double setFuel(double newFuel){
        this.fuel = newFuel;
        return newFuel;
    }
    // Getter method for fuel range of car
    public double getFuelEconomy() {
        return engine.getFuelEconomy();
    }
    //Gettor for Fuel used by car
    public double getUsedFuel() {
        return usedFuel;
    }
    // Method that calculates fuel left in car
    public double fuelLeft() {
        this.leftFuel = this.fuel - usedFuel;
        return this.leftFuel;
    }
    // Method that turns car off
    public void turnOff() {
        engine.turnOff();
    }
    // Method that starts car
    public void start(Double speed, double hours) {  
        engine.start();
        double distance = hours * speed;
        engine.addMileage(distance);
        usedFuel += distance / 100 * engine.getFuelEconomy();
        
    }
}

