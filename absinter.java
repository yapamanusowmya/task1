/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abst;

/**
 *
 * @author Dell
 */
interface A{
    public void numbers(int a,int b);
    public void sum();
}

abstract class B implements A{
    public void numbers(int a,int b)
    {
        System.out.println(a+b);
    }
    
    public void sum()
    {
        System.out.println("The sum ");
    }
    
}

class C extends B{
    public void numbers(int a,int b)
    {
       System.out.println(a+b+a+b);
    }
    public void sum()
    {
       System.out.println("Sum is :");
    }
}

public class absinter {
    public static void main(String[] Args)
    {
        C c=new C();
         c.sum();
        c.numbers(2,3);
       
        
        
    }
}
