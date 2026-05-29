package com.secondprog;
import java.util.Scanner;
public class hotel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter 1:Veg menu\n2:Non-veg menu");
		choice=sc.nextInt();int p=0;double disc=0.0;double di=0.0;
		System.out.println("Enter member status\n1:Gold\n2:Silver\n3:Normal");
		int x;
		x=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("1:Fried rice-Rs 240\n2:Noodles-Rs 175");
			int q,m;
			System.out.println("Enter quantity of fried rice and noodles respectively");
			q=sc.nextInt();
			m=sc.nextInt();
			p=q*240+m*175;
			System.out.println("Food items    Quantity\nFried rice  "+q+"\nNoodles   "+m);
			if(p>2000&&x==1)
			{
				System.out.println("Free dessert");
				di=0.2*p;
				disc=0.8*p;
			}
			else
			{
				if(x==1)
				{
					di=0.2*p;
				disc=0.8*p;
				}
				if(x==2)
				{
					di=0.1*p;
					disc=0.9*p;
			}
				else
				{
					di=0.0;
					disc=p;
				}
		}
			System.out.println("Bill="+p+"\nDiscount="+di+"\nDiscounted price="+disc);
			break;
		case 2:
			System.out.println("1:Chicken Biryani-Rs 300\n2:Grill Chicken-Rs 500");
			int u,v;
			System.out.println("Enter quantity of chicken biryani and grill chicken respectively");
			u=sc.nextInt();
			v=sc.nextInt();
			p=u*240+v*175;
			System.out.println("Food items    Quantity\nChicken Biryani  "+u+"\nGrill Chicken   "+v);
			if(p>2000&&x==1)
			{
				System.out.println("Free dessert");
				di=0.2*p;
				disc=0.8*p;
			}
			else
			{
				if(x==1)
				{
					di=0.2*p;
				disc=0.8*p;
				}
				if(x==2)
				{
					di=0.1*p;
					disc=0.9*p;
			}
				else
				{
					di=0.0;
					disc=p;
				}
		}
			System.out.println("Bill="+p+"\nDiscount="+di+"\nDiscounted price="+disc);
			break;
			default:
				System.out.println("Invalid choice entered");
		}
	}	
}

