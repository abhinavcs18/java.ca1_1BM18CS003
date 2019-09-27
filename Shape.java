/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method printArea( ) that prints the area of the given shape*/

import java.util.*;
abstract class Shape
{
	int a,b;
	abstract void printArea();
	}
class Rectangle extends Shape
{
	public void printArea()
	{
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		a = sc.nextInt();
		b = sc.nextInt();
		area = (a*b);
		System.out.println("Area of rectangle = "+area);
	}
}
class Circle extends Shape
{
	public void printArea()
	{
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the area");
		a = sc.nextInt();
		area = (3.14*(a*a));
		System.out.println("Area of circle = "+area);
	}
}
class Triangle extends Shape
{
	public void printArea()
	{
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height of triangle");
		a = sc.nextInt();
		b = sc.nextInt();
		area = (0.5*(a*b));
		System.out.println("Area of triangle "+area);
	}
}
class Main
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1: Rectangle \n2: Circle \n3: Triangle");
		ch = sc.nextInt();
		Shape ref = null;
		switch(ch)
		{
			case 1: ref = new Rectangle();
				  break;
			case 2: ref = new Circle();
				  break;	
			case 3: ref = new Triangle();
				  break;
		}
		ref.printArea();
	}
}

/* output:
ENTER YOUR CHOICE
1: Rectangle 
2: Circle 
3: Triangle
1
Enter length and breadth
2
3
Area of rectangle = 6
ENTER YOUR CHOICE
1: Rectangle 
2: Circle 
3: Triangle
3
Enter the base and height of triangle
3
4
Area of triangle 6.0
ENTER YOUR CHOICE
1: Rectangle 
2: Circle 
3: Triangle
2
Enter the radius of the area
2
Area of circle = 12.56
