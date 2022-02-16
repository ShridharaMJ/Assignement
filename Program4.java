import java.util.*;

/**
 * Write a program to read an integer number and a digit. Print the total number of
 *  occurrences of the input digit in that number.
 *  Sample Input:
 *  Enter the number : 54585
 *  Enter the digit : 5
 *  Sample Output: Occurs 3 times
 *
 *
 */
public class Program4

{
    public static void main(String[] args){
     
        
        int num;
        int digitToFind;
        int count=0;
        int qdigit;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number :");
        num=sc.nextInt();
        System.out.println(" Enter the digit : ");
        digitToFind=sc.nextInt();
        sc.close();
        while(num>0){
           qdigit=num%10;
           if(qdigit==digitToFind)
           count++;
           num=num/10;
            
            
        }
        
        System.out.println(digitToFind+" Occurs "+count+" times");
        
    }
    
}
