
import java.util.*;
import CIE.*;
import SEE.*;
class Main
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students");
		int n = sc.nextInt();
		Internals A[] = new Internals[n];
		Externals E[] = new Externals[n];
		double f[] = new double[5];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the student"+(i+1));
			A[i] = new Internals();
			E[i] = new Externals();
			
			E[i].getData();
			A[i].getData();
			for(int j=0;j<5;j++)
			{
				f[j] = A[i].a[j] + (E[i].s[j]*0.5);
				System.out.println(f[j]);
			}
 			System.out.println("The details of student"+(i+1));
 			
 			E[i].putData();
 			A[i].putData();
 			for(int k=0;k<5;k++)
 			{
				System.out.println("Total marks in subject"+(k+1)+" are "+f[k]);
			}
		}
	}
}
				
