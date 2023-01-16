import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ask Bob a question!");
            String input = scanner.nextLine();

            boolean question = input.endsWith("?");
            boolean yelling = input.endsWith("!");
            boolean sayNothing = input.isEmpty();

            if(question){
                System.out.println("Sure");
            } else if(yelling) {
                System.out.println("Whoa, chill out!");
            } else if (sayNothing){
                System.out.println("Fine! Be that way!");
            } else {
                System.out.println("Whatever!");
            }
        }



}
