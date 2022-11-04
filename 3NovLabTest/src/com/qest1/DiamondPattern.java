/* Question 1: Print Diamond Pattern
 @Author: ankit patel
 @Date: 3 Nov 2022
 */

//package
package com.qest1;

//importing scanner
import java.util.Scanner;

//Creating class
public class DiamondPattern {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variable
				int i, j , n;
				
				//taking Input
				System.out.println("Enter the number or rows of Diamond: ");
				n = sc.nextInt();
				
				//upper Pyramid
				for(i=0; i<n;i++)//printing rows
				{
					for(j=5; j>i; j--)//printing spaces
					{
						System.out.print(" ");
					}
					for(j=0; j<=i; j++)//printing stars
					{
						System.out.print(" *");
					}
					
					System.out.println();//printing next line
				}
				
				//For lower Pyramid
				for(i=0; i<n;i++)//printing rows
				{
					for(j=0; j<=i; j++)//printing spaces
					{
						System.out.print(" ");
					}
					for(j=4; j>i; j--)//printing stars
					{
						System.out.print(" *");
					}
					
					System.out.println();//printing next line
				}

	}//end of main

}//end of class
