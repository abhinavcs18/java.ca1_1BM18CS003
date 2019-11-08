

package CIE;
import java.util.*;
public class Internals
{
	public int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	public void getData()
	{	
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the CIE marks of subject"+(i+1));
		a[i] = sc.nextInt();
		}
	}
	public void putData()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("CIE marks of subject"+(i+1)+"are");
			System.out.println(a[i]);
		}
	}
}
