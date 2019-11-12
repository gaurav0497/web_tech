/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical11;

import java.util.Scanner;

/**
 *
 * @author Sourabh
 */
public class Practical11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Enter row of first matrix ");
         int a = s.nextInt();
         System.out.println("Enter column of first matrix ");
         int b = s.nextInt();
         System.out.println("Enter row of second matrix ");
         int d = s.nextInt();
         System.out.println("Enter column of second matrix ");
         int e = s.nextInt();
        Matrix m = new Matrix();
        m.insert(a, b, d, e);
        m.col();
        m.row();
        m.add();
        
    }
    
}
class Matrix{
    int a,b,d,e;
    int arr[][];
    int brr[][];
   
    void row(){
        System.out.println("Row and Column of first matrix :"+a+" "+b);
    }
    void col(){
        System.out.println("Row and Column of second matrix :"+d+" "+e);
    }
    void insert(int x,int y,int z,int k){
         a=x; b=y; d=z; e=k;
          arr = new int[a][b];
          brr= new int[d][e];
         Scanner s = new Scanner(System.in);
         for (int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 System.out.println("Enter elements:");
                arr[i][j]=s.nextInt();
             }
         }
         for (int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 System.out.println("Enter elements:");
                 brr[i][j]=s.nextInt();;
             }
         }
    }
    void add(){
        
        if((a!=d)||(b!=e)){
            System.out.println("Sum not possible");
        }
        else{
            int sum[][] = new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                   sum[i][j] = arr[i][j]+ brr[i][j]; 
                }
            }
            System.out.println("Sum is:");
             for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                   System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
    
}