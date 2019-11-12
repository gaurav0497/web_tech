/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author Sourabh
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a=3;
        t.b=4;
        t.h=5;
        t.area();
        t.perimeter();
    }
    
}
class Triangle{
    int a,b,h;
    void area(){
    System.out.println("Area of triangle = "+0.5*b*h);
}
    void perimeter(){
        System.out.println("Perimeter = "+(a+b+h));
    }
}