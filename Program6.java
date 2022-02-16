import java.util.*;

/**
 * Write a Java program to input a number and check whether it is a Pronic
 * Number or not. A
 * Pronic number is a number which is the product of two consecutive integers,
 * that is, a number of the form n(n + 1).
 * Sample Input : 110
 * Sample Output: Pronic Number.
 * (Hint: Since it is a product of 10*11 that is, n*n+1)
 */
public class Program6
{
   public static void main(String[] args){
       
       
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to check whether it is a Pronic");
        num=sc.nextInt();
        
        int n=(int)Math.sqrt(num);
        
        if(n*(n+1)==num)
        System.out.println("Pronic number.");
        else
        System.out.println("Not a pronic number");
        
       
       
       
   }
    
}
