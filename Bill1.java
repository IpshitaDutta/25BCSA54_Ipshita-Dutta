package com.firstprog;
import java.util.Scanner;
public class Bill1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name,prod;
	int pp,q;
	System.out.println("Enter customer name:");
	name=sc.nextLine();
	System.out.println("Enter product name:");
	prod=sc.next();
	System.out.println("Enter price and quantity");
	pp=sc.nextInt();
	q=sc.nextInt();
	
	System.out.println("Customer name:"+name);
	System.out.println("Product name:"+prod);
	System.out.println("Price:"+pp);
	System.out.println("Quantity:"+q);
System.out.println("Total Bill:"+(pp*q));
}
}
