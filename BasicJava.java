/*This program is dedicated for the practice of Exam
*@author RJ
*/
//package 
import java.util.Scanner;

public class ExamPrac {
	public static void main(String[] args) {
		//Initialisation
		double a = 34;
		double b = 49;
		double c = 78;
		double x = 7.64;
		boolean y = true;
		char z = 'R';
		String s = "This is a program for studying for CSC exam";
		int o; // For Scanner part - Increment 
		int r; // For Scanner part - post-decrement 
		
		// Mathematical operators
		System.out.println("The sum of these three numbers are : " +(a+b)+c);
		System.out.println("The difference of these three numbers are : "+(b-(c-a)));
		System.out.println("The product of the three numbers are : "+(a*b*c));
		System.out.println("The quotient of the three numbers are : "+(c/a/b));
		
		//Relational operators
		if(c/a>=x) {
			System.out.println("The number greater than : 7.64");
		}
		else {
			System.out.println("The number is lesser than 7.64");
		}
		if(b+a<=c) {
			System.out.println("The number is lesser");
		}
		else {
			System.out.println("The number is greater");
		}
		if((a+b)==c) {
			System.out.println("The number is equal");
		}
		else {
			System.out.println("The number is not equal to");
		}
		
		//Logical operators
		System.out.println("Check for OR Statement : "+(a<b || c>b)); // 34<49 || 78>49 Both true
		System.out.println("Check for AND statement working : "+(a<b && b>c)); // 34<49 && 49>78 True
		System.out.println("NOT statement working check : "+ !(a<b && b<c || a<b && c>b)); // !(34<49 && 49<78 || 34<49 && 78>49) 
		
		/*Increment and decrement operators Starts*/
		
		/*Increment Starts*/
		
		// Pre-Increment 
		System.out.println("Pre-Increment Operation : "+(++x));
		
		// Post-Increment
		System.out.println("Post-Increment Operation : "+(x++));
		
		/*Increment Ends*/
		
		/*Decrement Starts*/
		
		// Pre-Decrement  
		System.out.println("Pre-Decrement Operation : "+(--a));
		
		// Post-Decrement 
		System.out.println("Post-Decrement Operation : "+(a--));
		
		/*Decrement Ends*/

		
		/*Increment and decrement operators Ends*/
		
		// Conditional  Operators
		 System.out.println("Is it correct : " +((x>a)?x:a));
	     System.out.println("Is it correct : " +((a>b)?a:b));
		
		//Simply Rough 
		System.out.println("Boolean : "+y);
		System.out.println("Charecter : "+z);
		System.out.println("String : "+s);
		
		// Scanner - pre-Increment 
		
		@SuppressWarnings("resource")
		Scanner sky = new Scanner(System.in);
		System.out.println("Enter the value to be incrimented : ");
		o = sky.nextInt();
		
		++o;
		System.out.println("The value after pre-incrementing is : "+o);
		
		//Post-decrement 
		System.out.println("Enter the value to be post-decremented : ");
		r = sky.nextInt();
		
		r--;
		System.out.println("The value after pre-incrementing is : "+r);
		
		/*---------THEORY--------*/
		
		// Assignment Operator -------> "="
		// Precedence of Operators -------> BODMAS {
				// () [] .
				// ++ -- !
				//  * /  %
				// > >= < <=
				// ==
				// & ---------> Difference=? "ask mam"
				// ^
				// &&
				// ||
				// ?:
				// =
	
	//}
		// Father of Java language --------> James Goslin
		// Literals ---------> int, Float, Char, String, Boolean, 
		
	}
}
