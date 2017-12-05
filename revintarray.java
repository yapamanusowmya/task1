/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class revintarray {
     public static void  main(String []Args){
    Scanner s=new Scanner(System.in);
    
System.out.println("enter the number of integers to be printed:");
        int n=s.nextInt();
    int[] a= new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        }
        int[] al=new int[n];
        System.out.println("Reverse of the entered integer array is:");
         for(int j=0;j<n;j++)
    {
         al[j]=a[n-1];
         System.out.print(al[j]+" ");
         n--; 
    }  
     
}
}