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
public class dupvalarray {
    public static void main(String[] Args)
    {
        Scanner s=new Scanner(System.in);
    System.out.println("enter the number of integers to be entered:");
        int n=s.nextInt();
    int[] a= new int[n];
        System.out.println("Enter the array: ");
        for(int k=0;k<n;k++)
        {
        a[k]=s.nextInt();
        }
 int c=a.length;
   System.out.println("Duplicate elements from the above entered integers are : ");
        for (int i = 0; i < c-1; i++)
        {
            for (int j = i+1; j < c; j++)
            {
                if ((a[i] == a[j]) && (i != j))
                {
                    System.out.print(a[j]+" ");
                }
            }
        }
    }    
    
    
}
