import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

    System.out.format("The value of pi is approximately %.2f\n", pi);


    System.out.print("Enter Number Here: ");
    int userInput = scanner.nextInt();
    System.out.println("You entered: " + userInput + "!");
// if you enter something other than a number, it throws an error "input mismatch exception"

        System.out.print("Enter 3 words separated by spaces: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.printf("Your words are:%n %s %n %s %n %s %n", firstWord, secondWord, thirdWord);

        scanner.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence is as follows: %s", sentence);


    }
}