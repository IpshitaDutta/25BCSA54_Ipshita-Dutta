package com.secondprog;
import java.util.Scanner;
public class college {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter marks in Maths,Physics and Chemistry respectively");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
        if(a<35||b<35||c<35)
        {
        	System.out.println("Not eligible for admission");
        }
        else
        {
        	if(a>90&&b>90&&c>90)
        		System.out.println("Eligible for scholarship and allowed for admission");
        	else
        	{
        		if((a>=70&&b>=60&&c>=60)||(a+b+c)/3.0>=80.0)
        			System.out.println("Eligible for admission but no scholarship");
        		else
        			System.out.println("Not eligible for admission");
        			
        	}
        }
        	
	}

}
