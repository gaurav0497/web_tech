/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4;

/**
 *
 * @author Sourabh
 */
public class Practical4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Triangle t = new Triangle(3,4,5);
        
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
    Triangle(int x,int y,int z){
        b=y; h=z;
        a=x;
        
    }
}