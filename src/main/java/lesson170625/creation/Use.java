package lesson170625.creation;

public class Use {

    public static void main(String[] args) {

 //       A a = new A();

 //       System.out.println(a);
        B b = new B();

        C c = new C(); // call to constructor

        c.C(); // call to method

        Singleton.get().doIt();

        new Z();
        new Z();


    }

}
