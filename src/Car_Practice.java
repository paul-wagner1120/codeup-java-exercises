public class Car_Practice {
    // using constructors
    String make;
    String model;
    String color;
    int year;
    Car_Practice(String make, String model, String color, int year){

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void drive(){
        System.out.println(this.make + " " + this.model + " is driving");
    }


    //building standard objects and methods with OOP
//    String make = "Honda";
//    String model = "CRX";
//    int year = 1989;
//    String color = "blue";
//    double price = 13000.00;
//
//    void drive(){
//        System.out.println("You drive the car!");
//    }
//
//    void brake(){
//        System.out.println("You press on the brakes");
//    }

}
