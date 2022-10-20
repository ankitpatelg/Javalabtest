/*Q3. "Q3)WAP to find the 1.square
2. cube 
3. check number is even or odd using switch case."
@Author: ankit patel 
@Date: 20.10.22*/

//importing packages
import java.util.Scanner;
//Creating class
class Evenodd1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");// taking input
		int num = sc.nextInt();
		
		//menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even/Odd");
		
		int choice= sc.nextInt();
		
		//Switch case
		switch(choice)
		{
			case '1': square(int n1);
			break;
			case '2': cube(int n1);
			break;
			case '3': EvenOdd(int n1);
			break;
		}
		
	}
	//Method for Square
	static void square(int n1)
	{
		int sq = num*num;
		System.out.println("Square of number is : "+sq);
	}
	
	//Method for Cube
	static void cube(int n1)
	{
		int cub = num*num*num;
		System.out.println("Square of number is : "+cub);
	}
	
	//Method for Even/Odd
	static void EvenOdd(int n1)
	{
		if(n1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	
	
}