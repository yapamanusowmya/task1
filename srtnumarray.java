/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class srtnumarray {
    public static void main(String[] Args){
        String str;
        int n;
      
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String array:");
        str=s.nextLine();
        char t[]=str.toCharArray(); 
          Arrays.sort(t);
          System.out.println(t);
          
    
       int i[]={9,3,4,5};
          Arrays.sort(i);
         for(int j=0;j<i.length;j++)
         {
             System.out.print(i[j]+" ");
             
         }
         
         
//          System.out.println("Enter a number of Strings to be entered:");
//          n=s.nextInt();
//           System.out.println("Enter the strings: ");
//           String[] st=new String[n];
//          for(int k=0;k<n;k++)
//          {
//             st[k]=s.nextLine();
//          }
          
          
          
          
          
          
          
    }
    
}
