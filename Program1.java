import java.util.*;

/**
 * 
 * Write a program to input name and marks in Physics, Chemistry and Biology of
 * a single student. Display the name, total, average marks and the grades
 *  obtained.
 *
 */
public class Program1
{
   public static void main(String[] args){
       String studentName="";
       int physicsMarks;
       int chemistryMarks;
       int biologyMarks;
       int totalMarks;
       double averageMarks;
       String grade;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter student name.");
       studentName=sc.next();
       System.out.println("Enter physics marks.");
       physicsMarks=sc.nextInt();
       System.out.println("Enter chemistry marks.");
       chemistryMarks=sc.nextInt();
       System.out.println("Enter biology marks.");
       biologyMarks=sc.nextInt();
       
       // Total marks obtained
       
       totalMarks= physicsMarks+chemistryMarks+biologyMarks;
       
       //Average marks
       
       averageMarks=totalMarks/3;
       
       
       if(averageMarks>=75)
         grade="Distinction";
       else if( averageMarks>=60 && averageMarks<75)
       grade="First Division";
       else if( averageMarks>=45 && averageMarks<60)
         grade="Second Division";
       else if( averageMarks>=40 && averageMarks<45)
         grade="Second Division";
         else
         grade="Promotion not granted";
         
         
         
         System.out.println("Student name : "+ studentName);
         System.out.println("Total marks obtained: "+ totalMarks);
         System.out.println("Average marks : "+ averageMarks);
         System.out.println("Grade : "+ grade);
                
   }
}
