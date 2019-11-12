/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

/**
 *
 * @author Sourabh
 */
public class Practical5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.area();
        r.perimeter();
        System.out.println();
        Rectangle s = new Rectangle(5,8);
        s.area();
        s.perimeter();
    }
    
}
class Rectangle{
    int l,b;
    void area(){
        System.out.println("Area of rectangle = "+(l*b));
    }
    void perimeter(){
        System.out.println("Perimeter of rectangle = "+(2*(l+b)));
    }
    Rectangle(int a,int y){
        l=a; b=y;
        
    }
}