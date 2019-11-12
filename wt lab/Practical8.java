/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical8;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a =s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Average g = new Average(a,b,c);
        System.out.println("Average of three numbers = "+g.calculate());
    }
    
}
class Average{
    int a,b,c;
    Average(int x,int y,int z){
        a=x; b=y; c=z;
    }
    float calculate(){
       return((a+b+c)/3); 
    }
}