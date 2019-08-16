import java.util.*;
class Ascend
{
public static void main(String args[])
{
int size;
int i,j;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the size of the array");
size = obj.nextInt();
int a[] = new int[size];
System.out.println("Enter the elements of array");
for(i=0;i<size;i++)
{
a[i] = obj.nextInt();
}
for(i=0;i<size;i++)
{
for(j=1;j<size;j++)
{
if(a[j-1]>a[j])
{
int  t = a[j-1];
a[j-1] = a[j];
a[j] = t;
}
}
}
System.out.println("array in asscending order is");
for(int x1:a)
{
System.out.println(x1);
}
}
}
