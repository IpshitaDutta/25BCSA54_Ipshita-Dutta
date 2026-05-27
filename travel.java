package com.firstprog;
import java.util.Scanner;
public class travel {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int km;double p;
		System.out.println("Enter distance in km");
		km=sc.nextInt();
		System.out.println("Enter price per litre in RS");
		p=sc.nextDouble();
		int v;
		System.out.println("Enter vehicle mileage in km/L");
		v=sc.nextInt();
		System.out.println("Petrol needed:"+(km/v));
		System.out.println("Total travel cost:"+(km/v*p));
		
		
		
		
	}
	

}
