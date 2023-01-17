package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();
        String userString = in.getString();
        System.out.printf("User input: %s%n", userString);
        System.out.println(in.yesNo());
        System.out.println(in.getInt(1,10));
        System.out.println(in.getInt("Enter a number", 1, 10));
        System.out.println(in.getInt("enter a number"));
        System.out.println(in.getDouble("enter a number"));

    }

}
