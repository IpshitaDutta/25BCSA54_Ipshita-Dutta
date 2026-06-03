1) Difference between a Class and an Object in Java. Why can't we directly execute a class without creating an object?
Class: A class is a blueprint or template that defines the properties (variables) and behaviors (methods) of an object.
Object: An object is an instance of a class that occupies memory and can use the properties and methods defined in the class.
Example:
Class: Car
Object: car1, car2
Java
class Car {
    String brand;
}

Car car1 = new Car();
Here, Car is the class and car1 is the object.
Why can't we directly use non-static members without creating an object?
Variables and methods belong to an object. Until an object is created, memory is not allocated for those members. Therefore, we need an object to access them.
2) What are access modifiers in Java? Difference between public and private. Why is it not safe to make all variables public?
Access Modifiers control the visibility of variables, methods, and classes.
Modifier
Accessible From
public
Everywhere
private
Only within the same class
Example:
Java
class Student {
    public String name;
    private int marks;
}
name can be accessed from anywhere.
marks can only be accessed inside the Student class.
Why not make all variables public?
If variables are public, anyone can modify them directly, which may lead to incorrect or invalid data.
Java
student.marks = -50;
This violates data security and integrity. Therefore, sensitive data should be kept private.
3) How is encapsulation achieved using private variables and public methods? Give a real-life example.
Encapsulation is the process of hiding data and allowing controlled access through methods.
It is achieved by:
Making variables private.
Providing public getter and setter methods.
Example:
Java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
Real-life Ex: ATM
When using an ATM, you cannot directly access the bank's database. You interact through options like Deposit, Withdraw, and Balance Inquiry. The internal data remains hidden, which is encapsulation.
Advantages:
Data security
Better control over data
Easier maintenance
4) What is a constructor in Java? How is the this keyword used? Why do we use constructors?
A constructor is a special method that is automatically called when an object is created.
Characteristics:
Constructor name must be the same as the class name.
It has no return type.
Used to initialize object values.
Example:
Java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
Use of this keyword
this refers to the current object.
It is used to differentiate instance variables from local variables.
Java
this.name = name;
this.age = age;
Here:
this.name refers to the instance variable.
name refers to the constructor parameter.
Why do we use constructors?
To initialize object values automatically.
To avoid writing separate initialization methods.
To ensure every object starts with proper values.
Example:
Java
Student s1 = new Student("Ipshita", 20);
When the object is created, the constructor automatically assigns the values "Ipshita" and 20 to the object's variables.s
