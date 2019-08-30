import java.util.*;
class StudentMatrix
{
	float m[][];
	int n,s;
	int i,j;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students and subjects respectively");
		n = sc.nextInt();
		s = sc.nextInt();
		m = new float[n+2][s+2];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of the student"+(i+1));
			for(j=0;j<s;j++)
			{
				System.out.println("Enter the marks of subject"+(j+1));
				m[i][j] = sc.nextFloat();
			}
		}
	}
	void sum_and_avg()
	{
		float sum = 0;
		float avg =0 ;
		 for(i=0;i<n;i++)
		{
			for(j=0;j<s;j++)
			{
				sum=sum+m[i][j];
			}
				m[i][s] = sum;
				avg = sum/s;
				m[i][s+1]=avg;
				sum = 0;
		}
			 for(j=0;j<s;i++)
			{
				for(i=0;i<n;i++)
				{
					sum = sum + m[i][j];
				}
					m[n][j] = sum;
					avg = sum/s;
					m[n+1][j] = avg;
					sum = 0;
			}
		
	}
	void display()
	{
		System.out.print("the coressponding details are\n");
		for(i=0;i<n+2;i++)
		{
			for(j=0;j<s+2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
class StudentMarks
{
	public static void main(String args[])
	{
		StudentMatrix m1 = new StudentMatrix();
		m1.input();
		m1.sum_and_avg();
		m1.display();
	}
}		



