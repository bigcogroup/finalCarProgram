package cars;

 //Declaration of Class Engine
public class Engine {
    // Variables For class Engine
    public double mileage = 0;
    public boolean started;
    public double engineCapacity;
    public double fuelEconomy;

    // Constructor for Objects of Engine Class
    public Engine(double mileage, double engineCapacity) {
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        // Assuming Fuel Range in litres for every 100km is 
        //equivalent to the Engine Capacity Multiplied by 4
        fuelEconomy = engineCapacity * 4;
    }
    // Getter for Engine capacity of engine
    public double getEngineCapacity() {
        return engineCapacity;
    }
    //Setter method for Engine Capacity of Car's Engine
    public double setEngineCapacity(double newEngineCapacity){
        this.engineCapacity = newEngineCapacity;
        return newEngineCapacity;
    }
    //Getter for Fuel Range in litres for every 100km
    public double getFuelEconomy() {
        return fuelEconomy;
    }
    // getter for Mileage of car's engine
    public double getMileage() {
        return this.mileage;
    }
    // Method that adds mileage travelled by car
    public double addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
            return this.mileage;
    }
    //method that starts engine
    public void start(){
        started = true;
    }
    //Method that turns of Engine
    public void turnOff() {
        started = false;
    }
}
