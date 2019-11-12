 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical10;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter salary of employee :");
       int x= s.nextInt();
       System.out.println("Enter work per day of employee:");
       int y = s.nextInt();
       Employee e = new Employee();
       e.getinfo(x, y);
       e.addsal();
       e.addwork();
    }
    
}
class Employee{
    int sal,work;
    void getinfo(int a,int b){
        sal=a;
        work=b;
    }
    void addsal(){
       if(sal<500){
           sal=sal+10;
       }
       System.out.println("Salary is "+sal);
    }
    void addwork(){
        if(work>6){
            sal=sal+5;
        }
        System.out.println("Salary is "+sal);
    }
}