/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical6;
import java.util.Scanner;
/**
 *
 * @author Sourabh
 */
public class Practical6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth :");
        int a =s.nextInt();
        int b=s.nextInt();
        Area k = new Area();
        k.setdim(a, b);
        k.getArea();
    }
    
}
class Area{
    int l,b;
    void setdim(int a,int d){
        l=a;
        b=d;
    }
    void getArea(){
        System.out.println("Area of rectangle = "+(l*b));
    }
}