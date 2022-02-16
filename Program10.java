import java.util.Scanner;

/**
 * Write Java programs to find the sum of the first ten terms of the following series 
 * a) 1 + 3 + 5+ 7 + 9 +………
 * b) 2 + 4 + 8 + 16+ 32 …….�
 */
public class Program10
{
   
    public static void main(String[]  args){
        
        int initialNumber;
        int differenceNmber;
        int numberOfTerms;
        int i;
        int sum=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial number.");
        initialNumber=sc.nextInt();
        System.out.println("Enter difference number.");
        differenceNmber=sc.nextInt();
        System.out.println("Enter number of terms.");
        numberOfTerms=sc.nextInt();
        i=initialNumber;
        
        while(numberOfTerms!=0){
           System.out.print(i+" +");
            sum=sum+i;
            i=i+differenceNmber;
            numberOfTerms--;
            
            
        }
        
        System.out.println("\n"+sum);
        
        
        
        
    }
    
    
}
