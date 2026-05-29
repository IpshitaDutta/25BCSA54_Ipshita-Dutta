package com.secondprog;
import java.util.Scanner;
public class electricity {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice;
	System.out.println("Enter 1:Domestic"+"\n"+"2:Commercial"+"\n"+"3:Industrial");
	choice=sc.nextInt();
	int p;double c=0.0;
	switch(choice)
	{
	case 1:
		System.out.println("Enter number of electricity units consumed");
		p=sc.nextInt();
		if(p<=100)
			c=0.0;
		else if(p>=101&&p<=300)
			c=5.0*p;
		else
			c=5*200.0+8*(p-300.0);
		System.out.println("Bill="+"Rs"+c);
		break;
	case 2:
		System.out.println("Enter number of electricity units consumed");
		p=sc.nextInt();
		if(p<=200)
			c=10.0*p;
		else
			c=10*200.0+15*(p-200.0);
		System.out.println("Bill="+"Rs"+c);
		break;
	case 3:
		System.out.println("Enter number of electricity units consumed");
		p=sc.nextInt();
		System.out.println("Is power factor good\n"+"Enter true or false");
		boolean pf;
		pf=sc.nextBoolean();
		if(p>500&&pf==true)
			c=20*0.9*p;
		else
			c=20.0*p;
		System.out.println("Bill="+"Rs"+c);
		break;
		default:
			System.out.println("Invalid connection entered");
	}
}
}
