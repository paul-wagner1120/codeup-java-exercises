import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) Math.floor(Math.random() * (100) + 1);

        System.out.println(randomNum);

        System.out.println("Enter a number between 1 & 100: ");
        int userInput;

        do {
            userInput = scanner.nextInt();
            if (userInput < randomNum) {
                System.out.println("HIGHER");
            } else if (userInput > randomNum) {
                System.out.println("LOWER");
            }
        } while(userInput != randomNum);
            System.out.println("GREAT GUESS!");
    }
}
