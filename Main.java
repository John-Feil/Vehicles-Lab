package morevehicles;

public class Main {
    public static void main(String[] args) {
    Car car = new Car("Ford", 2, 3000.0d);
    Truck truck = new Truck("Toyota",1,7000.0d);
    Horse horse = new Horse("Speed", 1, 1000.0d);
    MotorBike motorbike = new MotorBike("Harley",1,2350.0d);
    Vehicle[] vehicles = {car,truck,horse,motorbike};
    printCalcTotals(vehicles);
        printAllVehicleNames(vehicles);
        horse.printExperience();
        motorbike.printExperience();
    //Vehicle.printVehicleName(car);
    }

    public static void printCalcTotals(Vehicle[] vehicles){
        for (Vehicle v: vehicles){
            v.calcTotal();
        }
    }
    public static void printAllVehicleNames(Vehicle[] vehicles){
        for (Vehicle v: vehicles){
            System.out.println(v.getName());
        }
    }
}
