

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to  University Management System");
		System.out.println("1.Student Details");
		System.out.println("2.Employee Details");
		
		int ch;
		System.out.println("Enter your Choice :");
		ch = sc.nextInt();
		UMS ob1 = new UMS();
		switch(ch)
		{
		case 1: ob1.details(null, null, ch, null, ch, ch);
		break;
		case 2: ob1.details(null, null, ch, null, null, ch);
		}
		sc.close();
		

	}

}