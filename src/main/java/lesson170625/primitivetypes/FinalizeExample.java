package lesson170625.primitivetypes;

import java.util.LinkedList;
import java.util.List;

public class FinalizeExample {

    static List<A> storage = new LinkedList<>();

    static class A {

        protected void finalize() throws Throwable {
            System.out.print("I am dying");
        }

    }

    public static void main(String[] args) {

        while (true) { //garbage collector work
            storage.add(new A());
        }



    }
}
