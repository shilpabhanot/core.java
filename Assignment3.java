//Assignment 3
//question 1: Encapsulation
//Encapsulation is a mechanism through which we can wrapping the data members and member methods of class in a single unit called encapsulation.It is the mechanism that binds together code and the data it manipulates.
// *Declare the class variables as a private.
// *Declare the class methods as a public.
//program of encapsulation
/*import java.util.Scanner;
class Encapsulation {
public static void main(String args[]) {
System.out.println("this is Encapsulation");
Scanner sc=new Scanner(System.in);
System.out.println("enter password");
String password=sc.nextLine();
UserData objUD=new UserData();
System.out.println("value of id in UserData=" + objUD.getID(password));
objUD.setID(password, 2);
System.out.println("value of id in UserData after updation="+objUD.getID(password));
}
}
class UserData {
private String password="shilpa";
private int id=10;
int getID(String password) {
if (checkPassword(password)) {
return id;
}
return 0;
}
void setID(String password,int id) {
if (checkPassword(password)) {
this.id=id;
}
}
private boolean checkPassword(String password) {
return this.password.equals(password);
}
} */
//	Question 2
//Polymorphism
//It is a concept by which we can perform a single action in different ways.Polymorphism is the ability of a message to be displayed in more than one form.
//program of polymorphism
/*class Bird {
	public void sing() {
		System.out.println("tweet tweet");
	 
}
}
class sparrow extends Bird {
	public void sing() {
		System.out.println("tweeddledee");
}
}
class parrot extends Bird {
	public void sing() {
		System.out.println("tarreeee");
	}
}

public class Polymorphism {
	public static void main(String args[]) {
		parrot	b=new parrot();
		b.sing();
	}
} */
		
	

//Question 3
//1.Access Specifiers 
//Access specifiers help us to restrict the scope or visibility of a package,class,constructor,methods,variables,or other data members.By using the access specifiers a particular class method or variable can be restricted to access or hidden from other classes.we have four types of access specifiers 1.Default   2.Public    3.Protected   4.Private

//2.Packages
//A package as the name suggests is a pack or group of classes ,interfaces and other packages.In java we use packages to organise our classes and interfaces

//3.Final keyword
//The final keyword means once the variable is assigned a value it can never be changed.It is a non access modifier which makes them impossible to inherit or override.


//question 5
/*class Assignment3 {
	public static void main(String args[]) {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}*/
//Question 4
class Rectangle {
	static void area(int length) {
		
		 int length=2;
	}
	void circumference() {
		int breadth;
		System.out.println(breadth );
	}
}
	
class Shape extends Rectangle{
	public static void main (String args[]) {
		area();
		Rectangle obj=new Rectangle();
		obj.breadth;
	}
}
	
		