import java.util.Scanner;

public class MethodsExercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static void modulus(int num1, int num2){
        System.out.println(num1 % num2);
    }

    public static void fancyMultiply(int num1, int num2){
        int ans = 0;
        for(int i = 0; i < num2; i++){
            ans += num1;
        }
        System.out.println(ans);
    }

    public static int getInteger(int min, int max){
            while(true) {
                System.out.printf("Enter a number between %s and %s: ", min, max);
                int input = scanner.nextInt();
                if (input >= 1 && input <= 10) {
                    return input;
                }
                System.out.println("Invalid entry, please try again.");
            }
    }

    public static void factorial(){
        String answer;
        do {
            int i;
            int fact = 1;
            int num;
            System.out.println("Enter Number");
            num = scanner.nextInt();
            if (num < 1 || num > 10) {
                System.out.println("Invalid entry, Please try again!");
                factorial();
                break;
            } else {
                for (i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + num + " is: " + fact);
            }
            System.out.println("Would you like to continue? Yes or No");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void dice() {
        String repeat;
        do {
            System.out.println("Please enter a number to represent the number of sides on the pair of dice: ");

            int userInput = scanner.nextInt();

            int dice1 = (int) Math.floor(Math.random() * (userInput) + 1);
            int dice2 = (int) Math.floor(Math.random() * (userInput) + 1);

            System.out.println("Your first value is " + dice1);
            System.out.println("Your first value is " + dice2);

            System.out.println("Would you like to continue? Yes or No");
            repeat = scanner.next();

        } while (repeat.equalsIgnoreCase("yes"));
    }




    public static void main(String[] args) {
//        addition(4,4);
//        System.out.println(subtraction(4,4));
//        System.out.println(multiply(4,4));
//        System.out.println(divide(4,4));
//        modulus(20,5);
//        fancyMultiply(4,5);
//        System.out.println(getInteger(1,10));
//        factorial();
        dice();
    }
}
