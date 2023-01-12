public class OOP_Main_Practice {

    public static void main(String[] args) {

        Car_Practice myCar1 = new Car_Practice("Honda","CRX","Blue",1989);
        Car_Practice myCar2 = new Car_Practice("Nissan","Skyline","Blue",1993);

        System.out.println(myCar1.make);
        System.out.println(myCar2.make);

        myCar2.drive();


//        Car_Practice myCar1 = new Car_Practice();
//        Car_Practice mycar2 = new Car_Practice();
//
//        System.out.println(myCar1.color);
//        System.out.println(myCar1.make);
//        System.out.println(mycar2.model);
//        System.out.println(mycar2.price);
//
//        myCar1.drive();
//        mycar2.brake();
    }

}
