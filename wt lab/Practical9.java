/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical9;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length,breadth,width of box : ");
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        Box h = new Box(a,b,c);
        
        System.out.println("Volume of box is "+h.volume());
    }
    
}
class Box{
    int l,b,w;
    int volume(){
        return(l*b*w);
    }
    Box(int a,int y,int c){
        l=a;  b=y; w=c;
        
    }
}