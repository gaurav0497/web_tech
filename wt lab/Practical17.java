/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical17;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.total();
    }
    
}
class Student{
    String name;
    int regno,total=0;
    // int intarr[];
     int[] arr = new int[5];
    Student(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many student detail you want to enter: ");
        int val=s.nextInt();
        System.out.println("Enter name: ");
        name=s.nextLine();  
       
        for(int i=0;i<val;i++){
            
             System.out.println("Enter registraton number: ");
             regno=s.nextInt();
             System.out.println("Enter marks of 5 subject: ");
             
             for(int j=0;j<5;j++){
                 
                arr[i] = s.nextInt();
                total +=arr[i];
            
            }
            
            
             
             
        
        }
    }
    void total(){
         System.out.println(name+" total marks is :"+total+".");
    }
}