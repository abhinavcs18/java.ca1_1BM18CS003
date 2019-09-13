import java.util.*;
class Person
{
	String name;
	int age;
	String address;
	Scanner sc = new Scanner(System.in);
	void  getdata()
	{
		System.out.println("Enter the name, age and address");
		name = sc.next();
		age = sc.nextInt();
		address = sc.next();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
}
class Student extends Person
{
 	int roll_no,sem;
 	void getdata1()
 	{
 	 	System.out.println("Enter the roll no and sem");
 		roll_no = sc.nextInt();
 		sem = sc.nextInt();
	}
	void display1()
	{
		System.out.println("roll no:"+roll_no);
		System.out.println("sem:"+sem);
	}
}
class Exam extends Student
{
	int marks1;
	int marks2;
	float avg;
	void getdata2()
	{
		System.out.println("Enter the marks of both the subjects");
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
	}
	double compute()
	{
	avg = (marks1+marks2)/2;
	return avg;
	}
	void display2()
	{
			System.out.println("Marks 1:"+marks1);
			System.out.println("Marks 2:"+marks2);
			System.out.println("Average:"+avg);
	}
}
class PersonDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students");
		int n = sc.nextInt();
		Exam e[] = new Exam[n];
		for(int i=0;i<n;i++)
		{
			e[i] = new Exam();
			System.out.println("Enter the details of the student"+(i+1));
			e[i].getdata();
			e[i].getdata1();
			e[i].getdata2();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("Details of student"+(i+1)+" are:");
			e[i].display();
			e[i].display1();
			e[i].display2();
		}
		int top = 0;
		double val = e[0].compute();
		for(int i=0;i<n;i++)
			{
				if(e[i].compute()> val)
					{
						val = e[i].compute();
						top = i;
					}
			}
			System.out.println("The details of topper are:");
			e[top].display();
			e[top].display1();
			e[top].display2();
	}
} 			
			
