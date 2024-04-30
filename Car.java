public class Car {
        public String color;
        public String model;
        public int year;
        public boolean rentalStatus;
    
        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
            this.rentalStatus = false;
        }
    
        public String getColor() {
            return color;
        }
    
        public String getModel() {
            return model;
        }
    
        public int getYear() {
            return year;
        }
    
        public boolean isRented() {
            return rentalStatus;
        }
        public class Main {
            public static void main(String[] args) {
                // Create a new Car instance
                Car myCar = new Car("Red", "Toyota", 2022);
                
                // Print car details
                System.out.println("Car Color: " + myCar.getColor());
                System.out.println("Car Model: " + myCar.getModel());
                System.out.println("Car Year: " + myCar.getYear());
                System.out.println("Is Car Rented? " + myCar.isRented());
            }
        }
}

//Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.
//
// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.