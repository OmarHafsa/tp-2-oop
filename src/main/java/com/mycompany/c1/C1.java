/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c1;

/**
 *
 * @author FAROUK
 */
public class C1 {
     public C1() {
        System.out.println("la classe C1");
    }
}
class C2 extends C1 {
    public C2() {
        System.out.println("la classe C2 extends C1");
    }
}
class C5 extends C2 {
    public C5() {
        System.out.println("la classe C5 extends C2");
    }
}
class C6 extends C2 {
    public C6() {
        System.out.println("la classe C6 extends C2");
    }
}
// Classe dérivée C3 de C1
class C3 extends C1 {
     public C3() {
        System.out.println("la classe C3 extends C1");
    }
}

// Classe dérivée C4 de C1
class C4 extends C1 {
    public C4() {
        System.out.println("la classe C4 extends C1");
    }
}
class C7 extends C4 {
    public C7() {
        System.out.println("la classe C7 extends C4");
    }
}