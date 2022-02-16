import java.util.*;
import java.util.Scanner;

/**
 * Write a program to input a number and find its factorial.
 *  Sample Input 5:
 *  Sample Output : 120 [Hint : 1x2x3x4x5].
 *
 * 
 */
public class Program5
{
   
   public static void main(){
       
       int num;
       int factorial=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Input a number to find its factorial.");
       num=sc.nextInt();
       
       for(int i=1;i<=num;i++){
          factorial*=i;
       }
       System.out.println("Output: "+factorial);
       
       
   }
}
