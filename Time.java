import java.util.*;
class Time
{
	int h,m,s;	
	Time()
	{
		h=0;m=0;s=0;
	}
	Time(int a, int b, int c)
	{
		h = a;
		m = b;
		s = c;
	}
	void currentTime(int a,int b, int c)
	{
		h=a;m=b;s=c;
	}
	void advance(int a,int b,int c)
	{
		s = s+c;
		m = m+b+(s/60);
		s = s%60;
		h = h+a+(m/60);
		m = m%60;
		h = h%24;
	}
	void print()
	{
		System.out.println("Hour = "+n);
		System.out.println("Minute = "+m);
		System.out.println("Second = "+s);
	}
	class TimeDemo
	{
		public static void main(strings args[])
		{
			Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter your choice");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					Time a = new Time();
					System.out.println("Enter hour,minute and second");
					int hh = sc.nextInt();
					int mm = sc.nextInt();
					INT ss = sc.nextInt();
					a.currentTime(hh,mm,ss);
					a.print();
					break;
				case 2:
					Time ob = new Time(hh,mm,ss);
					break;
	}
}
















