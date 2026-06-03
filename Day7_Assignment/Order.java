package com.sevenprog;
import java.util.*;
public class Order {
private int orderld;
private String customerName;
private String productName;
private int quantity;
private double pricePerItem;
public Order(int orderld,String customerName,String productName,int quantity,double pricePerItem)
{
	this.orderld=orderld;
	this.customerName=customerName;
	this.productName=productName;
	this.quantity=quantity;
	this.pricePerItem=pricePerItem;
}
public double calculateTotal()
{
return quantity*pricePerItem;	
}
public double applyDiscount()
{
	double total=calculateTotal();
	if(total>1000)
	{
		total=total-(total*0.20);
		
	}
	else if(total>5000)
	{
		total=total-(total*0.10);
	}
	return total;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter order Id");
		int n;
		n=sc.nextInt();
		System.out.println("Enter customer name");
		String m,b;
		m=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter product name");
         b=sc.nextLine();
         System.out.println("Enter quantity");
         int y,a;
         y=sc.nextInt();
         System.out.println("Enter price per item");
         a=sc.nextInt();
         Order order=new Order(n,m,b,y,a);
         System.out.println("Total amount:"+order.calculateTotal());
         System.out.println("Final amount after discount:"+order.applyDiscount());
	}

}
