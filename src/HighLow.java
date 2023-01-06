import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) Math.floor(Math.random() * (100) + 1);

        System.out.println(randomNum);


        System.out.println("Welcome to HighLow! You have 5 attempts to pick the right number! Good Luck!");
        System.out.println("Enter a number between 1 & 100: ");
        int userInput;
        int userAttempts = 0;

        do {
            userInput = scanner.nextInt();
            if (userInput < randomNum) {
                System.out.println("HIGHER");
                userAttempts++;
                System.out.println("You have made " + userAttempts + " attempts.");
                    if (userAttempts == 5){
                        System.out.println("You have reached the maximum number of attempts!");
                        break;
                    }
            } else if (userInput > randomNum) {
                System.out.println("LOWER");
                userAttempts++;
                System.out.println("You have made " + userAttempts + " attempts.");
                    if (userAttempts == 5){
                        System.out.println("You have reached the maximum number of attempts!");
                        break;
                    }
            }
        } while(userInput != randomNum);
            if(userInput == randomNum){
                System.out.println("Congrats! You have chosen the correct number!!!");
            } else {
                System.out.println("Thanks for Playing!");
            }

    }
}
