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

