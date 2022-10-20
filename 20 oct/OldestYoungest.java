/*
Q2.)Take input of age of 3 people by user and determine oldest and youngest among them.
@author: Ankit patel
@Date: 20 oct 2022  

*/

/*Take input of age of 3 people by user and 

 *determine oldest and youngest among them.
 i take random three name 
 1 name - ankit patel 
 2 name - vivek patel
 3 name - raja patel
 
 */



import java.util.Scanner;

import java.util.Random;

// oldestyouget is class name //


class OldestYoungest {

// start the class //

    public static void main(String[]args){

       Random rn = new Random();

        Scanner sc= new Scanner(System.in);

     
// start enter the age //

System.out.print("   Enter Ankit's age  = ");

 int a=sc.nextInt();

System.out.print("   Enter vivek's age  = ");

 int b=sc.nextInt();

System.out.print("   Enter raja's age  = ");

// end the enter the age //

 int c=sc.nextInt();
 
 /* using if condition 
 
 start the using if else condition 
 */
 

        if(a>b && b>c)

System.out.print("   Ankit is older& raja is younger ");

 else if(a>b && c>a)

System.out.print("   raja  is older& vivek is younger ");

 else if(b>a && a>c)

System.out.print("   vivek is older& raja is younger ");

 else if(a>c && c>b)

System.out.print("   Ankit is older& vivek is younger ");

 else if(c>b && b>a)

System.out.print("   raja is older& Ankit is younger ");

        else if(b>c && c>a)
			
		//end the condition //

System.out.print("   vivek is older& ankit is younger ");

// end the class

 }}