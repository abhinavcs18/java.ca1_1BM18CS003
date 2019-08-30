import java.util.*;
class Matrices
{
  public static void main(String args[])
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. of rows and coloumn of matrix A respectivly");
     int ra = sc.nextInt();
     int ca = sc.nextInt();
     System.out.println("Enter the no. of rows and coloumn of matrix B respectively");
     int rb = sc.nextInt();
     int cb = sc.nextInt();
     int a[][] = new int[ra][ca];
     int b[][] = new int[rb][cb];
	int diff[][]=new int[ra][cb];
	int sum[][]=new int[ra][cb];
	int i;
int j;
     if(ra == rb && ca == cb)
     {
           System.out.println("Enter the elements of matrix A");
           for(i=0;i<ra;i++)
           {
                for(j=0;j<ca;j++)
                a[i][j] = sc.nextInt();
            }
           System.out.println("enter the elements of array B");
           for(i=0;i<rb;i++)
           {
                for(j=0;j<cb;j++)
                b[i][j] = sc.nextInt();
            }
            for(i=0;i<ra;i++)
            {
                for(j=0;j<ca;j++)
                {
                   sum[i][j] = a[i][j] + b[i][j];
                  diff[i][j] = a[i][j] - b[i][j];
                 }
            }
            System.out.println("The sum of the array A and B is");    
            for(i=0;i<ra;i++)
            {
                for(j=0;j<ca;j++) 
                System.out.println(sum[i][j]+" ");
             }
            System.out.println("The difference of the array A and B is"); 
            for(i=0;i<ra;i++)
            {
                for(j=0;j<ca;j++) 
                System.out.println(diff[i][j]+" ");
             }
      }
       else
System.out.println(" The two matrix have different order");
}
}




/*
Enter the no. of book objects
2
enter the name of the book1
LIFe
enter the name of the author of the book1
Av
enter the price of the book1
8970.67
enter the no. of pages1
2344 
enter the name of the book2
WHOOO
enter the name of the author of the book2
Abhizz
enter the price of the book2
1499.99
enter the no. of pages2
1043 
Details of book1
name:LIFe
 author:Av
 Price:8970.67
 No. of pages2344
Details of book2
name:WHOOO
 author:Abhizz
 Price:1499.99
 No. of pages1043
*/
