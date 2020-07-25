package lesson170629.classstructure;
// члены класса относящиеся только к классу

public class A {

    //class
    static final int MAX = 10;
    static final String SECRET_WORD = "Hello";

    static int instanceCounter = 0;

    static {

    }

    public static int compare(A first, A second) {
        return first.x - second.x;
    }

    //instance - члены класса, относящиеся к экземпляру
    int x = 0; //поля экземпляра, состояние
    int y = 0;

    {
       instanceCounter++; // счетчик экземпляров, создали раз
    }

    //constructor
    public A() {
        x = 10;
        y = 10;
    }

    public void move(int shiftX, int shiftY) { //передаем сообщение объекту
        x += shiftX; //работаем с полями экземпляра или класса
        y += shiftY;
    }

    public int compare(A other) {
        return compare(this, other);
    }

}
