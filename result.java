package com.firstprog;
import java.util.Scanner;
public class result {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    String name;
    int p1,p2,p3;
    System.out.println("Enter student name:");
    name=sc.nextLine();
    System.out.println("Enter marks of 3 subjects:");
    p1=sc.nextInt();
    p2=sc.nextInt();
    p3=sc.nextInt();
    int total=0;
    total=p1+p2+p3;
    double avg=0.0;
    avg=(p1+p2+p3)/3.0;
    System.out.println("Student name:"+name);
    System.out.println("Total marks:"+total);
    System.out.println("Average:"+avg);
    boolean p=avg>50.0;
    	System.out.println("Average greater than 50"+p);
    

    
	}

}
