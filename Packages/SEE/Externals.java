package SEE;
import java.util.*;
import CIE.*;

public class Externals extends Student
{
	public int s[] = new int[5];
	Scanner sc = new Scanner(System.in);
	public void getData()
	{	super.getData();
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the SEE marks of subject"+(i+1));
		s[i] = sc.nextInt();
		}
	}
	public void putData()
	{
		super.putData();
		for(int i=0;i<5;i++)
		{	System.out.println("SEE marks of subject"+(i+1)+"are");
			System.out.println(s[i]);
		
		}
	}
}
