package lesson170625.creation;

public class WholePicture { //form begin status object example

    static class A {

        int i;
        int y = 10;     //assign value here in, default
        final int z;

        {
            i = y + 10; //assign value here in
        }

        A() {
            z = 30; //assign value here in, final all info in constructor
        }

    }
}
