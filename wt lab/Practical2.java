/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

/**
 *
 * @author Sourabh
 */
public class Practical2 {

   
    public static void main(String[] args) {
        Studend s = new Studend();
        s.print(789654123, 1703001001, "sam");
        s.print(987456321,170301002, "john");
    }
    
}
class Studend{
    
   
    void print(long phn,long roll_no, String name){
        System.out.println("Name of student : "+name);
        System.out.println("Roll_no : "+roll_no);
        System.out.println("Phone number : "+phn);  
        System.out.println();
    }
}