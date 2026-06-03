package com.sevenprog;
import java.util.Scanner;
class Mobile {
    String brand;
    private double price;
    int storage;

    public Mobile(String brand, double price, int storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage + " GB");
        System.out.println();
    }



    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter brand,price and storage of 1st mobile respectively");
      String a;int b,c;
      a=sc.next();
      b=sc.nextInt();
      c=sc.nextInt();
        Mobile m1 = new Mobile(a,b,c);
        System.out.println("Enter brand,price and storage of 2nd mobile respectively");
        String m;int x,y;
        m=sc.next();
        x=sc.nextInt();
        y=sc.nextInt();
        Mobile m2 = new Mobile(m,x,y);

        m1.displayDetails();
        m2.displayDetails();
    }
}

