import javax.lang.model.SourceVersion;
import java.util.Objects;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// #1
        // while loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        // do while loop
//        i = 0;
//        do {
//            System.out.println(i += 2);
//        } while (i < 100);
//
//
//        i = 105;
//        do {
//            System.out.println(i -= 5);
//        } while (i > -10);
//
//       long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

        //for loops
//        for(int i = 5; i <= 15; i ++){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//        for(long num = 2; num < 1000000; num *= num){
//            System.out.println(num);
//        }

        //fizzbuzz

//        for (int i = 1; i <= 100; i++){
//            if ((i % 3)==0 && (i % 5)==0){
//                System.out.println("fizzbuzz");
//            } else if((i % 5)==0){
//                System.out.println("buzz");
//            } else if ((i % 3) == 0){
//                System.out.println("fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //table of powers
        String answer;
//        do {
//            System.out.println("What number would you like to go up to?");
//
//            final int NMAX = 3;
//            final double XMAX = scanner.nextDouble();
//
//            for (int n = 1; n <= NMAX; n++) {
//                String title1 = "number";
//                String title2 = "squared";
//                String title3 = "cubed";
//                if (n == 1) {
//                    System.out.printf("%10s", title1);
//                } else if (n == 2) {
//                    System.out.printf("%10s", title2);
//                } else {
//                    System.out.printf("%10s", title3);
//                }
//            }
//            System.out.println();
//            for (int n = 1; n <= NMAX; n++) {
//                System.out.printf("%10s", "------");
//            }
//            System.out.println();
//
//            for (double x = 1; x <= XMAX; x++) {
//                for (int n = 1; n <= NMAX; n++) {
//                    System.out.printf("%10.0f", Math.pow(x, n));
//                }
//                System.out.println();
//            }
//
//            System.out.println("Would you like to continue? Yes or No");
//            answer = scanner.next();
//
//        } while (answer.toLowerCase().equals("yes"));

        //convert number grades to letter grades
        do {
            System.out.println("Please enter a grade number between 0 and 100.");
            int grade = scanner.nextInt();
            if (grade >= 88 && grade <= 100) {
                System.out.println("Your letter grade is: A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Your letter grade is: B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Your letter grade is: C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Your letter grade is: D");
            } else {
                System.out.println("Your letter grade is: F");
            }

            System.out.println("Would you like to continue? Yes or No");
            answer = scanner.next();

        } while (answer.toLowerCase().equals("yes"));

    }
}
