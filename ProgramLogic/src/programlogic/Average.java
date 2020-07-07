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
public class Average {
    public static void main(String args[])
    {
            int sum=0;
    
    int avg=0;
    int[] A={20,30,40};
    for(int i=0;i<A.length;i++)
    {
        sum+=A[i];
        System.out.println("Sum: "+sum);
   
    }
    System.out.println("length: "+A.length);
    avg=sum/(A.length);
    System.out.println("Average: "+avg);
    }
}
