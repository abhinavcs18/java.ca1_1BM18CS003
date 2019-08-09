import java.util.*;
class Quadratic
{
public static  void main(String args[])
{
int a,b,c,d;
double r1,r2;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the value of a");
a = obj.nextInt();
System.out.print("Enter the value of b");
b = obj.nextInt();
System.out.println("Enter the value of c");
c = obj.nextInt();
d = (b*b-(4*a*c));
if(d==0)
{
r1 = (-b/(2*a));
r2 = r1;
System.out.println("Roots are equal and value="+r1);
}
else if(d>=0)
{
r1 = ((-b+(Math.sqrt(d)))/(2*a));
r2 = ((-b-(Math.sqrt(d)))/(2*a));
System.out.println("Roots are distinct and are as root1 = "+r1+"and root2 = "+r2);
}
else
{
System.out.print("There are no real roots");
}
}
}
