import java.util.*;
class Book
{
	String name,author;
	double price;
	int num_pages;
	Book()
	{
		name="\0";
		author="\0";
		num_pages=0;
		price=0;
	}
	void set(int j)
	{
		j=j+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the book"+j);
		name = sc.next();
		System.out.println("enter the name of the author of the book"+j);
		author = sc.next();
		System.out.println("enter the price of the book"+j);
		price = sc.nextDouble();
		System.out.println("enter the no. of pages"+j);
		num_pages = sc.nextInt();
	}
	public String toString()
	{
		String s=" name:"+name+"\n author:"+author+"\n Price:"+price+"\n No. of pages"+num_pages;
		return s;
	}
	void get()
	{
		System.out.println(toString());
	}
}
class BookDemo
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no. of book objects");
		int n = obj.nextInt();
		Book arr[] = new Book[n];
		for (int i=0;i<n;i++)
		{
			arr[i] = new Book();
		}
		for(int i=0;i<n;i++)
		{
			arr[i].set(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of book"+(i+1));
			arr[i].get();
		}
	}
}

/*
Enter the no. of book objects
2
enter the name of the book1
LIFE
enter the name of the author of the book1
Abhinav
enter the price of the book1
499.99
enter the no. of pages1
376 
enter the name of the book2
PHYSICS
enter the name of the author of the book2
HC_Verma
enter the price of the book2
699.99
enter the no. of pages2
795
Details of book1
 name:LIFE
 author:Abhinav
 Price:499.99
 No. of pages376
Details of book2
 name:PHYSICS
 author:HC_Verma
 Price:699.99
 No. of pages795
 */

