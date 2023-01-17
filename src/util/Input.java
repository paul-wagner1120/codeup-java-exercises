package util;
import java.util.Scanner;

// fell behind during class, worked through the exercise 1 by 1 using the walk through. wanted to make sure i had the correct information so that I could better understand what was going on.

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void clear(){
        this.scanner.nextLine();
    }

    public String getString(){
        System.out.println("Input string: ");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public Boolean yesNo(){
        System.out.println("Would you like to continue? Enter Yes or No?");
        String input = this.scanner.nextLine();
        input = input.toLowerCase();
        return switch (input) { //enhanced switch statement
            case ("no"), ("n") -> false;
            case ("yes"), ("y") -> true;
            default -> yesNo();
        };
    }

//    public Boolean yesNo(){
//        System.out.println("Yes or No?");
//        String input = this.scanner.nextLine();
//        input = input.toLowerCase();
//        switch (input) { // standard switch statement
//            case ("no"):
//            case ("n"):
//                return false;
//            case ("yes"):
//            case ("y"):
//                return true;
//            default:
//                return yesNo();
//        }
//    }

    public int getInt(int min, int max){
        int input;
        String accept = "Acceptable Input";
        String invalid = "Invalid Input";
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextInt();
                if (input < min || input > max){
                    System.out.println(invalid);
                }
        } while (input < min || input > max);
            System.out.println(accept);
        return input;
    }

    public int getInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.println(prompt);
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public int getInt() { // ask for clarification about this problem
        System.out.println("Input number...");
        while (true) {
            try {
//                int userInput = Integer.valueOf(this.scanner.nextLine());
                int userInput = Integer.parseInt(this.scanner.nextLine());
                System.out.println("Input acceptable");
                return userInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not an integer. Try again.");
            }
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                int userInput = Integer.parseInt(this.scanner.nextLine());
                System.out.println("Input acceptable");
                return userInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not an integer. Try again.");
            }
        }
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public double getDouble() {
        System.out.println("Input number...");
        while (true) {
            try {
                double userInput = Double.parseDouble(getString());
                System.out.println("Input acceptable");
                return userInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not an double. Try again.");
            }
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                double userInput = Double.parseDouble(getString());
                System.out.println("Input acceptable");
                return userInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Input not an double. Try again.");
            }
        }
    }

}
