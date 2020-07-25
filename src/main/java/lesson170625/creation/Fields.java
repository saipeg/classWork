package lesson170625.creation;

public class Fields {

    static class A {

        final int i = 10;

        final long timestamp = System.currentTimeMillis();

    }

    static class B {

        int i; //0
//      final int j; // indefined

        public void doIt(int x) { //formal parameter,
                                  // real parameter variable will be assigned from active program

        }

        public void printIt(String x) {

        }

        public void printState() {
            int x; //local variable need initialization. No default value

            int y = 0; //inited
            System.out.println(y);

        }

    }
}
