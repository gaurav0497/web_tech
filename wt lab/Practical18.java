/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical18;

/**
 *
 * @author Sourabh
 */
public class Practical18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Printnum("Gaurav");
        new Printnum(1234);
        new Printnum(45.15);
        new Printnum('a');
        new Printnum(true);
    }
    
}
class Printnum{
    Printnum(String s){
        System.out.println(s+" String type. ");
    }
    Printnum(int s){
        System.out.println(s+" Integer type.");
    }
    Printnum(double s){
        System.out.println(s+" Double type.");
    }
    Printnum(char s){
        System.out.println(s+" Char type. ");
    }
    Printnum(boolean s){
        System.out.println(s+" Boolean type. ");
    }
}
