/*
Q1. WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
@author: Ankit patel
@Date: 20 oct 2022  
*/
import java.util.*;

// create a discount class //

class Discount
{
    public static void main(String args[])
    {
        double quantity,price,amount,discount;
 	Scanner sc=new Scanner(System.in);
	
	
	// asking the price  //
	
	
	System.out.println("Enter The Price Of The Product:");
	price=sc.nextDouble();
	
	
	// asking the quantity //
	
	
        System.out.println("Enter The No Of Quantity:"); 
	quantity=sc.nextDouble(); 
	
	
	// set the amount //
	
	
	amount=quantity*price;

// set the condition of if stetament //


	if(amount>2000)

	{

// set the discount //


		discount=amount*0.1;

		amount=amount-discount;

	}
	// total amount 
	
	System.out.println("The Total Amount is:"+amount);
	

   }
}