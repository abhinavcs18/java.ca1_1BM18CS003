import java.util.*;
class Maximum
{
public static void main(String Args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the row and coloumn siza of the 2d array");
        int r = sc.nextInt();
	int c = sc.nextInt();
	int a[][] = new int[r][c];
	System.out.println("Enter the elements of the 2d array");
       	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		a[i][j]=sc.nextInt();
	}
	int l=a[0][0];
	for(int y[]:a)
	{
		for(int x:y)
         	{
			if(x>l)
			l=x;
		}
}
System.out.println("The maximum element of the array is"+l);
}
}           
