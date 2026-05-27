package com.firstprog;
import java.util.Scanner;
public class atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int b,w;
    	System.out.println("Enter name of account holder");
    	name=sc.nextLine();
    	System.out.println("Enter account balance");
    	b=sc.nextInt();
    	System.out.println("Enter withdrawal amount");
    	w=sc.nextInt();
        	System.out.println("Name:"+name);
           System.out.println("Remaining amount:"+(b-w));
           
            sc.close();	
    	
	}

}
