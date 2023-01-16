import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f.%n",pi);
//
//        System.out.println("Please enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: " + userInput);
//
//        System.out.println("Please enter 3 words");
//        String word1;
//        String word2;
//        String word3;
//
//        word1 = scanner.next();
//        word2 = scanner.next();
//        word3 = scanner.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//
//        // if you enter more than 3 words, only the 1st three words will be logged due to using the scanner.next() method;
//        scanner.nextLine();
//        System.out.println("Please enter a sentence:");
//        String mySentence = scanner.nextLine();
//        System.out.println(mySentence);

        System.out.println("Enter length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter width: ");
        int width = Integer.parseInt(scanner.nextLine());
        int perimeter = (width * 2) + (length * 2);
        int area = (width * length);
        System.out.printf("Your room perimeter is %s! %n", perimeter);
        System.out.printf("Your room area is %s!", area);
    }
}
