package lesson170624;

public class Equals {


    public static void main(String[] args) {

        String a;

        String b;

        compare(null);

    }

    private static void compare(String a) {
        if ("Hello".equals("a")) { //Inverted the condition to avoid an error
            System.out.print("Equals");
        }
    }
}