package lesson170625.creation;

public class Z {

    static int s = 99; //static variable initialization

    static { // static bloc init

        System.out.println("static init"); //Performed once

    }

    long timestamp = System.currentTimeMillis(); // variable initialization

    {
        System.out.println("init"); //init example
    }

    Z() {
        System.out.println("constructor"); //constructor bloc init
    }

}
