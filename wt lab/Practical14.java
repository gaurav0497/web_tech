/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical14;

/**
 *
 * @author Sourabh
 */
public class Practical14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rectangle r1 = new Rectangle();
        System.out.println("Area "+r1.area());
        Rectangle r2 = new Rectangle(12);
        System.out.println("Area "+r2.area());
        Rectangle r3 = new Rectangle(12,14);
        System.out.println("Area "+r3.area());
    }
    
}
class Rectangle{
    int l,b;
    Rectangle(){
        l=b=0;
    }
    Rectangle(int a){
        l=b=a;
    }
    Rectangle(int f,int c){
        l=f;
        b=c;
    }
    int area(){
        return(l*b);
    }
}
