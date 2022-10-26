/*Print Taggline
 * @Author: Ankit patel
@Date: 26/10/22*/

package com.ques2;

//importing packages
import java.util.Scanner;

//creating class
public class Taglines {
	
			//Method for Tagline
			static void PrintTagline(String BrandName)
			{
				//Switch case
				switch(BrandName)
				{
					case "ADIDAS": System.out.println("Impossible is nothing");
					break;
					case "NIKE": System.out.println("JUST DO IT");
					break;
					case "PUMA": System.out.println("FOREVER FASTER");
					break;
					case "ONITSUKA TIGER": System.out.println("SOUND MIND, SOUND BODY");
					break;
					case "FILA": System.out.println("ONE WORLD, ONE FILA");
					break;
				}//end of switch
					
			}//end of method tagline
	


		
		//main method
		public static void main(String args[])
		{
			//creating scanner object
			Scanner sc = new Scanner(System.in);
			
			//taking input
			System.out.println("Enter the Brand Name: ");
			String BrandName= sc.next().toUpperCase();
			PrintTagline(BrandName);
			
		}//end of main
		
		
	

}//end of class
