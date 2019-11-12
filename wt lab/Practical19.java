/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical19;

/**
 *
 * @author Sourabh
 */
public class Practical19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Class().show('h', 12);
        new Class().show(15, 'e');
    }
    
}
class Class{
    
    void show(char c,int n){
       System.out.println("You entered character then integer.");
    }
    void show(int n,char c){
       System.out.println("You enterd Integer then character.");
    }
}