package cars;


//import Scanner Class for Use input
import java.util.Scanner;
//import ArrayList class for arrayList storage and data manipulation
//Declare new Class Car

//Declaration of Class Engine

public class Main {
    public static void main(String[] args) {
    	Car usrCar = new Car();
    	SuperCar newSuperCar = new SuperCar();
      int i;
        //Test car 
        usrCar.testCar();
         // Loop that creates less than 25 cars
        for(i = 0; i<25; i++){
            //Creates main menu where user selects from four options
            System.out.println("Choose Car Type\n 1. SuperCar \n2. Normal Car");
            Scanner input1 = new Scanner(System.in);
            int choose = input1.nextInt();
            
            switch (choose){
                case 1:
                    //Super Car
                	Scanner input = new Scanner(System.in);
                    System.out.println("Press 1 to create Super car \nPress 2 to Delete Super Car\n Press 3 to Retrieve Super Car \n Press 4 to edit Supercar");
                    int userInput = input.nextInt();
                	switch (userInput) {
                	   case 1: 
                            newSuperCar.createSuperCar();
                            break;
                        //case 2 Deletes a Car from Objects Array
                        case 2: 
                            newSuperCar.deleteCar();
                            break;
                        //case 3 enables the user to retreive car objects from the array
                        case 3:
                            newSuperCar.getCar();
                            break;
                        //case 4 enables the user to edit previous entries from the stored array
                        case 4:
                            newSuperCar.deleteCar();
                                    
                            break;
                        //Exception handler for invalid entry
                        default:
                            System.out.println("Invalid Entry!");
                            break;  
                        }                    
                                            
                                			
                        break;
                case 2:
                    Scanner input0 = new Scanner(System.in);
                    System.out.println("Press 1 to create new car \nPress 2 to Delete Car\n Press 3 to Retrieve Car \n Press 4 to edit car");
                    int userInput0 = input0.nextInt();
                    switch  (userInput0){
                        case 1: 
                            usrCar.createCar();
                             break;
                            //case 2 Deletes a Car from Objects Array
                        case 2: 
                            usrCar.deleteCar();
                            break;
                            //case 3 enables the user to retreive car objects from the array
                        case 3:
                            usrCar.getCar();
                            break;
                            //case 4 enables the user to edit previous entries from the stored array
                        case 4:
                            usrCar.deleteCar();
                                    
                            break;
                             //Exception handler for invalid entry
                        default:
                            System.out.println("Invalid Entry!");
                            break; 
                        }
                        
                        break;
                        
                default:
                    System.out.println("Invalid Entry!");
                    break;         
                }
            }
        }
       
    
}
