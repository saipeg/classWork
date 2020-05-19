package lesson170624;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("start");

        System.out.println(assertEquals("Hello", "Hello"));  //Hello - this is a string literal
    }

    public static boolean assertEquals(String actual, String expected) {
        //FIXME fill the body - tracked comment
        //TODO - tracked comment
        return actual.equals(expected);
        /* Not return actual == expected; Comparison operator always compares the values ​​of variables.

         */
    }
}