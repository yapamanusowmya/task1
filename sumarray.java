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
public class sumarray {
    public static void main(String []Args)
    {
            Scanner s=new Scanner(System.in);
        System.out.println("Enter number of array integers: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the integers in array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        
       System.out.println("Sum of the array elements is:");
            for(int j=1;j<n;j++)
            {
            a[0]=a[0]+a[j];
            }
        System.out.println(a[0]);
        
    }
    
    
    
}
