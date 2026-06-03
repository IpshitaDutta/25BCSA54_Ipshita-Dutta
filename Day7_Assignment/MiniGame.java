package com.sevenprog;
import java.util.Scanner;
public class GameCharacter {
private String name;
private int health;
private int attackPower;
public GameCharacter(String name,int health,int attackPower)
{
	this.name=name;
	this.health=health;
	this.attackPower=attackPower;
}
public void attack(GameCharacter enemy)
{
	enemy.health=enemy.health-this.attackPower;
	if(enemy.health<0)
		enemy.health=0;
	System.out.println(this.name+" attacked "+enemy.name+" and reduced health by"+this.attackPower);
}
public void heal()
{
health=health+20;
System.out.println(name+"healed and gained 20 health");

}
public void showStats()
{
	System.out.println("Name:"+name+"\n"+"Health"+health+"\n"+"Attack Power:"+attackPower+"\n");
	System.out.println();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name,health status and attacking power status respectively of 1st player\n");
				String n;int a,b;
				n=sc.nextLine();
				
				a=sc.nextInt();
				b=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name,health status and attacking power status respectively of 2nd player");
				String m;int x,y;
				m=sc.nextLine();
				
				x=sc.nextInt();
				y=sc.nextInt();
				GameCharacter player1=new GameCharacter(n,a,b);
				GameCharacter player2=new GameCharacter(m,x,y);
				player1.showStats();
				player2.showStats();
				player1.attack(player2);
				player2.heal();
				System.out.println("\nAfter actions:\n");
				player1.showStats();
				player2.showStats();
				
				
				

	}
}

