import java.util.*;

/**
 * Write a program to input a number and display the new number after reversing the digits of the original number. 
 * The program also displays the absolute difference the original number and the reversed number. 
 * Sample Input: 194 
 * Sample Output: 491 
 * Absolute difference = 297�
 *
 * 
 */
public class Program9
{
    public static void main(String[] args){
        
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        input=sc.nextInt();
        int num=input;
        int output=0;
        int digit=0;
        int difference;
        
        while(num>0){
            digit=num%10;
            output=(output*10+digit);
            num=num/10;
            
        }
        difference= Math.abs(input- output);
        
        System.out.println("Output              : "+output);
        System.out.println("Absolute difference : "+difference);
        
        
        
        
        
    }
}
