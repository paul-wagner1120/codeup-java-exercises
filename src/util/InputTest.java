package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();
        String userString = in.getString();
        System.out.printf("User input: %s%n", userString);
//        System.out.println(in.yesNo());
//        System.out.println(in.getInt(1,100));
//        System.out.println(in.getDouble(1,100));
//        System.out.println(in.getInt());
//        System.out.println(in.getDouble());
    }

}
