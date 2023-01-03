import javax.lang.model.SourceVersion;

public class ControlFlowExercises {
    public static void main(String[] args) {
// #1
        // while loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
//        for(int i = 5; i <= 15; i ++){
//            System.out.println(i);
//        }

        // do while loop
//        i = 0;
//        do {
//            System.out.println(i += 2);
//        } while (i < 100);


        i = 105;
        do {
            System.out.println(i -= 5);
        } while (i > -10);

//       int i = 2;
//        do {
//            System.out.println(i *= i);
//        } while (i < 1000000);



    }
}
