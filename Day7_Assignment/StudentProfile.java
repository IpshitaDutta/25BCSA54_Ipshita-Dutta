package com.sevenprog;
import java.util.Scanner;
class Student {
    String name;
    int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println();
    }



    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter name,age and marks of 1st student respectively");
     String n;int a;double b;
     n=sc.nextLine();
     a=sc.nextInt();
     b=sc.nextDouble();
        Student s1 = new Student(n,a,b);
        sc.nextLine();
        System.out.println("Enter name,age and marks of 2nd student respectively");
        String x;int m;double y;
        x=sc.nextLine();
        m=sc.nextInt();
        y=sc.nextDouble();
        Student s2 = new Student(x,m,y);

        s1.displayDetails();
        s2.displayDetails();
    }

}
