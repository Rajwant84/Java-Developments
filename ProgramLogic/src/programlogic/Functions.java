/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlogic;

/**
 *
 * @author KHUSHWANT SINGH
 */
public class Functions {
    
    public static void main(String args[])
    {
        int x=14;
        
        double sqrt_x=Math.sqrt(x);
        System.out.println(sqrt_x);
        
        System.out.printf("Square root of %d is %.2f is: ",x,sqrt_x);
        
        double radius=5;
        double area=radius*radius*Math.PI;
        System.out.println(area);
        System.out.println(Math.abs(-4));
        System.out.println(Math.max(100,200));
        
        
    }
}
