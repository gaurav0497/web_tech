/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical21;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        for (int i =0;i<10;i++){
         System.out.println("Enter name and age: ");
        new Student().setinfo(S.next(), S.nextInt());
        System.out.println("Enter name: ");
        String a=S.next();
         System.out.println("Enter address: ");
        String b=S.next();
         System.out.println("Enter age: ");
        new Student().setinfo( S.nextInt(),a,b );
    }
    }
    
}
class Student{
    String name="unknown";
    int age=0;
    String address="not available";
    void setinfo(String s,int a){
        name=s;
        age=a;
        System.out.println("Name "+name+" age "+age+" address "+address+".");
    }
    void setinfo(int a,String s,String k){
        name=s;
        age=a;
        address=k;
        System.out.println("Name "+name+" age "+age+" address "+address+".");
    }
}
