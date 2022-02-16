import java.util.*;

/**
 * Write a program to input the five subject marks ( English, Maths, Physics,
 *  Chemistry and Biology) for 40 students using a for loop and calculate and print
* the class average for the following subjects:
a) Science
b) English
c) Maths
 *
 * 
 */
public class Program2
{
   public static void main(String[] args){
       
         
    int numberOfStudent=5;
    Scanner sc=new Scanner(System.in);
    int englishMarks=0;
    int mathsMarks=0;
    int physicsMarks=0;
    int chemesryMarks=0;
    int biologyMarks=0;
    
    for(int i=1;i<=numberOfStudent;i++){
        
        System.out.println("Enter student "+i+" english marks.");
        englishMarks+=sc.nextInt();
        System.out.println("Enter student "+i+" math marks.");
        mathsMarks+=sc.nextInt();
        System.out.println("Enter student "+i+" physics marks.");
        physicsMarks+=sc.nextInt();
        System.out.println("Enter student "+i+" chemistry marks.");
        chemesryMarks+=sc.nextInt();
        System.out.println("Enter student "+i+" bioloogy marks.");
        biologyMarks+=sc.nextInt();
        
    }
       System.out.println("Class average of Science subject "+ ((physicsMarks+chemesryMarks+biologyMarks)/3)/numberOfStudent);
       System.out.println("Class average of English subject "+ englishMarks/numberOfStudent);
       System.out.println("Class average of Maths subject "+mathsMarks/numberOfStudent);
    
    
       
   }
}
