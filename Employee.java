package com.secondprog;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int yr,p;double x;
		System.out.println("Enter years of experience of employee");
		yr=sc.nextInt();
		System.out.println("Enter attendance %");
		x=sc.nextDouble();
		System.out.println("Enter performance rating(1-5)");
		p=sc.nextInt();int b=0;
		if(x<60)
		{
			System.out.println("Not Eligible"+"\n"+"Bonus rejected due to low attendance");
		}
		else if(yr>3&&x>85)
		{
			if(p==5)
				b=50000;
			if(p==4)
				b=30000;
			if(p==3)
				b=10000;
			else
				b=0;
		}
		else
			b=0;
		if(b!=0)
		{
			System.out.println("Eligible"+"\n"+"Bonus="+"Rs"+b);
		}
		else
			System.out.println("Not Eligible");
	}

}
