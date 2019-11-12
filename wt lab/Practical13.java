/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical13;

/**
 *
 * @author Sourabh
 */
public class Practical13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s = new Student();
       Student l = new Student("GAURAV");
    }
    
}
class Student{
    Student(){
        System.out.println("Unknown");
    }
    Student(String S){
        System.out.println(S);
    }
}
