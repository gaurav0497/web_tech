/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical20;

/**
 *
 * @author Sourabh
 */
public class Practical20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Area().rectangle(15, 18);
        new Area().square(12);
    }
    
}
class Area{
    void rectangle(int a,int b){
        System.out.println("Area of rectangle = "+(a*b));
    }
    void square(int a){
        System.out.println("Area of square = "+(a*a));
    }
}
