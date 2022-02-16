import java.util.*;

/**
 * Write a program to input the Customer’s name and the number of units
 * consumed and generate an electricity bill 
 *
 */
public class Program7
{
    public static void main(String[] args){
        
        String name;
        int numOfUnit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name");
        name=sc.next();
        System.out.println("Enter number of unit  consuer");
        numOfUnit=sc.nextInt();
        
        double totalBill=0;
        
        if(numOfUnit<=100)
        totalBill=numOfUnit*2;
        else if(numOfUnit>100 && numOfUnit<=300)
        totalBill=(100*2)+(numOfUnit-100)*3;
        else{
        totalBill=((100*2)+(200*3)+(numOfUnit-300)*5);
        //System.out.println("Total bill before surge"+ totalBill);
        totalBill=totalBill+totalBill*(2.5/100);
    }
        
        System.out.println("Total Bill : "+totalBill);
        
        
        
        
        
        
    }
}
