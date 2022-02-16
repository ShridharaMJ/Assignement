import java.util.*;

/**
 * A publisher is selling a particular book to the book stores. Write a program to input a customer’s name and the quantity purchased. 
 * Calculate the total amount and print the bill as shown below after applying a discount based on the table given below. 
 * Quantity Discount on the total amount Less than or equal to 2 books 3%
 *  More than 2 books and less than or equal to 5 books 7% 
 *  More than 5 books and less than or equal to 10 books 10% 
 *  Print the bill as follows: 
 *  Customer’s Name : xxxx 
 *  Quantity : xxxx 
 *  Total amount : xxxx 
 *  Discounted amount : xxxx 
 *  Amount payable : xxxx
 */
public class Program3
{
    public static void main(String[] args){
        
        String customerName;
        int quantity;
        final double PRICE=100.00; 
        double totalAmount;
        double dscountAmount=0;
        double amountPayable=0;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name.");
        customerName=sc.next();
        System.out.println("Enter quantity purchased.");
        quantity=sc.nextInt();
        
        totalAmount=PRICE*quantity;
        
        
        if(quantity<=2)
        dscountAmount=totalAmount*0.03;
        else if(quantity>2 && quantity<=5)
        dscountAmount=totalAmount*0.07;
        else if(quantity>5 && quantity<=10)
        dscountAmount=totalAmount*0.1;
        
        amountPayable=totalAmount-dscountAmount;
        
        System.out.println("**************************************");
        System.out.println("Customer’s Name   : "+customerName);
        System.out.println("Quantity          : "+quantity);
        System.out.println("Total amount      : "+totalAmount);
        System.out.println("Discounted amount : "+dscountAmount);
        System.out.println("Amount payable    : "+amountPayable);
        System.out.println("**************************************");
        
    }
}
