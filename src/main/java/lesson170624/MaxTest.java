package lesson170624;

import mytestframework.Asserts;

public class MaxTest {
    public static void main(String[] args) {

        System.out.println(Asserts.assertEquals(MathUtils.max(20,10), 20));
        System.out.println(Asserts.assertNotEquals(MathUtils.max(10,20), 10));
        System.out.println(Asserts.assertEquals(MathUtils.max(10,30), 30));
        System.out.println(Asserts.assertEquals(MathUtils.max(20,10), 20));
        System.out.println(Asserts.assertEquals(MathUtils.max(30,10), 30));

        System.out.println(Asserts.assertEquals(MathUtils.max(Integer.MAX_VALUE,0), Integer.MAX_VALUE));
        System.out.println(Asserts.assertEquals(MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

        System.out.println(Asserts.assertNotEquals(MathUtils.max(30,10), 10));
    }
}
