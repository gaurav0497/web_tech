/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical16;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Programming();
        System.out.println("Please enter something: ");
        Scanner s = new Scanner(System.in);
        String j = s.nextLine();
        new Programming(j);
    }
    
}
class Programming{
    Programming(){
        System.out.println("I love programming languages.");
    }
    Programming(String s){
        System.out.println("I love "+s+".");
    }
}