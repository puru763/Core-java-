//  this  is   also  called as  compile  time  polymorphism   or  static polymorphism 

package Polymorphism;

public class CompileTimePolymorphism {

    public void print(String s) {
        System.out.println("String: " + s);
    }

    public void print(int i) {
        System.out.println("Int: " + i);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism poly = new CompileTimePolymorphism();
        poly.print("Hello");
        poly.print(123);
    }

}
