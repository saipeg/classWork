package lesson170625.primitivetypes;

public class Examples {

    public static void main(String[] args) {

        int i; // 32 bite (4 byte)

        long l; // 64

        short s; //16

        byte b; //8 bit    -128 : 127   целочисленные это и выше integer type

        char c = 'a'; //16 перечислимый тип, взаимозаменяемость с целыми числами и символами.

        float f; //32 bit вещественные /real type
        double d; //64 bit вещественные

        boolean bool; // true  false

        String a;

        Object o;

        Examples e = new Examples(); //in e save address for object!
        System.out.println(e);

        Examples e2 = e; // copy old link

        c = 'b';

        e = new Examples();

        System.out.print(e);

    }

}
