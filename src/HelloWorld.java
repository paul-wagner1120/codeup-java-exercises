public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.print("Hello World \n");


        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "My favorite number is 4";
//        String myString2 = 2;
        System.out.println(myString);

        // String variable types will not accept character values;
        // String variable types will not accept numbers or decimals... recommends using String.valueOf()

        long myNumber = 123;
        System.out.println(myNumber);
        // without assigning a number to the long variable... it throws an error saying it has not been initialized
        // long and int data types do not accept decimal values

//        float myNumber2 = 3.14;
        // 2 ways to fix the float; 1. add a "f" to the end of your 3.14; 2. change the float to a double

        float myNumber3 = 3.14f;
        double myNumber4 = 3.14;


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // the first system out is only printing the value of x. it is not accounting for the "++" feature. the code is reading left to right and it prints the variable before it adds 1 to it.
        // the second system out prints the final value of x after the "++" is applied to the variable

//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

        // the first system out has the "++" feature before the variable, therefore it modifies the variable by adding 1 to the y variable and then prints the variable, the second system out prints the same variable b/c there were no changes to it.

//        String class;

        // class is a reserved word

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//
//        int three = (int) "three";

        // int variables cannot accept sting values

//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
//        x = x+=5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//          y*=x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
//        System.out.println(x);
//        System.out.println(y);

        // if you exceed the data type capacity, it will throw an error and not run or compile properly

    }

}
