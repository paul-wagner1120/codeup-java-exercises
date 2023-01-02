public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello, World!");

        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "I love pizza!";
        System.out.println(myString);

//        String myString = 'I';
//        System.out.println(myString);
//        does not run b/c the variable type defined is a string not a character

//        String myString = 3.14159;
//        System.out.println(myString);
//        does not run b/c the variable type is defined as a string not a float or double

//        long myNumber;
//        System.out.println(myNumber);
//        nothing to print out

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        doesnt run b/c long is not the proper variable type for decimals

//        long myNumber = 123L;
//        System.out.println(myNumber);

//        long myNumber = 123;
//        System.out.println(myNumber);

//        #8 = b/c int and long are for whole numbers and not decimal numbers

//        float myNumber = 3.14;
//        System.out.println(myNumber);
//        throws an error

        float myNumber = 3.14f;
        System.out.println(myNumber);
//        1st way to fix - add 'f' to the end of the value
//        2nd way to fix - change variable type to double

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        logs variable before adding 1

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        adds 1 and then logs variable

//        String class = "hello class";

//        #11 - you cannot name a variable class

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        code breaks - cannot convert a string to a number at this point

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);

//        byte num = 130;
//        integer overflow error. code will not run while data type is not correct







    }
}