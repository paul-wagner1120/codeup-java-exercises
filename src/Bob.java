import java.util.Scanner;

public class Bob {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;

        while(keepRunning){
            System.out.println("Ask Bob a question!");
            String input = scanner.nextLine();

            boolean question = input.endsWith("?");
            boolean yelling = input.endsWith("!");
            boolean sayNothing = true;
//            boolean whatever = input.endsWith();


        }

//        System.out.println("Ask Bob a question!");
//        String question = scanner.next();
//        System.out.println(question);

    }
}
