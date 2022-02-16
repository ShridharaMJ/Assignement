import java.util.*;

/**
 * Write a program to input the number of employees in the marketing company. Accept the employee id, 
 * name and basic salary of each employee and calculate his/her total salary as follows: 
 * HRA= 12% of the basic salary
 * DA = 15% of the basic salary 
 * PF Deduction = Rs.1800 Total
 * salary= Basic + HRA +DA - PF
 *
 * 
 */
public class Program8
{
    public static void main(String[] args){
        
        int numOfEmployee;
        int empID;
        String empName;
        double basicSalary;
        double hra,da;
        final int PF=1800;
        double netSalary,grossSalary;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employee.");
        numOfEmployee=sc.nextInt();
        System.out.println("---------------------------------------");
        for(int i=1;i<=numOfEmployee;i++){
            System.out.println("Enter employee id.");
            empID=sc.nextInt();
            System.out.println("Enter "+empID+"'s name.");
            empName=sc.next();
            System.out.println("Enter "+empName+"'s basic salary");
            basicSalary=sc.nextDouble();
            
            hra=basicSalary*0.12;
            da=basicSalary*0.15;
            grossSalary=(basicSalary+hra+da);
            netSalary=grossSalary-PF;
            
            System.out.println("************************************"); 
            System.out.println("Employee Id : "+ empID); 
            System.out.println("Name        : "+empName);
            System.out.println("Basic       : "+basicSalary);
            System.out.println("HRA         : "+hra);
            System.out.println("DA          : "+da); 
            System.out.println("Gross Salary: "+ grossSalary);
            System.out.println("PF Deduction: "+ PF);
            System.out.println("Net Salary  : "+ netSalary);
            System.out.println("************************************"); 
             
            
            
            
        }
        
        
        
    }
}
