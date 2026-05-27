package com.tnsif.packs.pack1;

public class c2 {

    public void test1() {

        c1 ob = new c1();

        // System.out.println(ob.a); // private → cannot access

        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);

        // ob.show1(); // private → cannot access

        ob.show2();
        ob.show3();
        ob.show4();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        c2 obj = new c2();

        obj.test1();
    }
}