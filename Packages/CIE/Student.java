/*Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Student. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/

package CIE;
import java.util.*;

public class Student
{
	String name,usn;
	int sem;
	Scanner sc = new Scanner(System.in);
	public void getData()
	{
		System.out.println("Enter the name,usn and sem of the student");
		name = sc.next();
		usn = sc.next();
		sem = sc.nextInt();
	}
	public void putData()
	{
		System.out.println("NAME = "+name+"\tusn = "+usn+"\tSEM = "+sem);
	}
}



	
