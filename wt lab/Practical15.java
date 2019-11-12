/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical15;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Addamount();
        System.out.println("Enter amount: ");
        Scanner s = new Scanner(System.in);
        int val=s.nextInt();
        new Addamount(val);
    }
    
}
class Addamount{
    int amount=50;
    Addamount(){
        System.out.println("When no amount is added "+amount);
    }
    Addamount(int a){
        amount+=a;
        System.out.println("When "+a+" is added new amount is "+amount);
    }
}
