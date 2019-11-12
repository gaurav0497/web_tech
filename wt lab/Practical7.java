/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical7;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth :");
        int a =s.nextInt();
        int b=s.nextInt();
        Area k = new Area(a,b);
        
        System.out.println("Area of rectangle = "+k.getArea());
    }
    
}
class Area{
    int l,b;
    
    int getArea(){
        return(l*b);
    }
    Area(int x,int y){
        l=x;
        b=y;
    }
}