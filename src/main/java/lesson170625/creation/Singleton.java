package lesson170625.creation;

public class Singleton {

    static private Singleton instance = new Singleton();
// static - this is variable exists in a single copy in program.
    private Singleton() {} //use only in this constructor

    static public Singleton get() {
        return instance;
    }

    public void doIt() {
        System.out.println("did it");
    }

}
