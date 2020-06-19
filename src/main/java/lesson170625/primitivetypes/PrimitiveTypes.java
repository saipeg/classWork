package lesson170625.primitivetypes;

import java.sql.SQLOutput;

public class PrimitiveTypes {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);

        long l = 21474836470L; //L - need show, what number is long

        int x = 0xff;
        int o = 077;
        int b = 0b11; // Двоичная

        char c = 100;

        System.out.println(c); //c = d
        System.out.println((char)65); // = A.
        int i = 'c'; //constant symbol type, i = 99
        System.out.println(i);

        long l2 = 100;

        int i2 = (int)l2;

        double d = 10;

        int i3 = (int)d;

        System.out.println(d);

        System.out.println(x); // 10-ричное система исчисления
        System.out.println(Integer.toBinaryString(x)); // 2-ричное система исчисления
        System.out.println(Integer.toHexString(x)); // 16-ричное система исчисления
        System.out.println(Integer.toOctalString(x)); // 8-ричное система исчисления

        String result = "";

        result += 1;
        result += 1;
        result += 1;

        System.err.println(result);


    }

}
