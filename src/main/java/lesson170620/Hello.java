package lesson170620;

import java.io.Serializable;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        A a = new A();  // "a" - сreate a link to the object, type A
        B b = new B();  // create an example class B. ""New B() - object

        Object o = a;   // cast types

        A x = b;

        b = (B)x;

        Serializable s = b;
        ((B)s).m();

    }

    static class A implements Serializable {

    }

    static class B extends A {
        public void m() {}
    }
}
