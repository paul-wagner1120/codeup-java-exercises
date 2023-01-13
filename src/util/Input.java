package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public void clear(){
        this.scanner.nextLine();
    }

    public String getString(){
        System.out.println("Input string...");
        return this.scanner.nextLine();
    }

//    public boolean yesNo() {
//        System.out.println("Yes or No?");
//        String input = this.scanner.nextLine();
//        input = input.toLowerCase();
//        switch(input) {
//            case ("no"):
//                return false;
//            case ("n"):
//                return false;
//            case ("nope"):
//                return false;
//            case ("denied"):
//                return false;
//            case ("uh uh"):
//                return false;
//            case ("yes"):
//                return true;
//            case ("y"):
//                return true;
//            case ("yep"):
//                return true;
//            case ("sure"):
//                return true;
//            case ("si"):
//                return true;
//            case ("uh huh"):
//                return true;
//            case ("approved"):
//                return true;
//            case ("maybe"):
//                System.out.println("Ain't you cute?");
//                return yesNo();
//            default:
//                return yesNo();
//        }
//    }
}
