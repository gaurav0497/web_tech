/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical12;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Applicant a = new Applicant();
        a.Enter();
        a.result();
    }
    
}
class Applicant{
    long ano;
    String name;
    float agg;
    char grade;
    void Enter(){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter admission no: ");
        ano=S.nextLong();
        
        System.out.println("Enter marks: ");
        agg=S.nextFloat();
        System.out.println("Enter name: ");
        name=S.nextLine();
        GradeMe();
    }
    void GradeMe(){
        if(agg>=80){
            grade='A';
        }
        else if(agg<80 && agg>=65){
            grade='B';
        }
        else if(agg<65 && agg>=50){
            grade='C';
            
        }
        else{
            grade='D';
        }
}
    void result(){
        System.out.println("Name "+name+" Admission number "+ano+" Marks "+agg+" Grade "+grade);
    }
     
}
