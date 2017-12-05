/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//a program to remove a specific element from an array.
package task2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class rmelement {
    public static void  main(String []Args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements to be entered:");
        int n=s.nextInt();
        char[] a= new char[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
        {
        a[i]=s.next().charAt(0);
        }
        
        System.out.println("Enter an element that must be removed form the above elements:");
        char c=s.next().charAt(0);
        System.out.println("Entered element is removed and remaining elemennts are as following: ");
        for(int j=0;j<n;j++)
        {
            if(a[j]!=c)
            {
            
            System.out.println(a[j]);
           
            }
       
        }
        
    }
}
