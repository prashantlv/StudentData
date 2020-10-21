import java.util.*;

public class Student
 {
	int rollno;
	String name;
	
	Scanner sc=new Scanner(System.in);
	double[] marks=new double[3];
  public void input()
{
	  System.out.println("Enter name");
	  name=sc.nextLine();
	  System.out.println("Enter roll no.");
	  rollno=Integer.parseInt(sc.nextLine());
	  System.out.println("Enter Phy. Chem. & Maths Marks res.");
	  for(int j=0;j<3;j++)
	  marks[j]= Double.parseDouble(sc.nextLine());
}
  public void display()
  {
	  System.out.println("Name : "+name);
	  System.out.println("Roll no : "+rollno);
	 // for(int k=0;k<3;k++)
	 // System.out.println("Marks :"+marks[k]);
	  System.out.println("Physics Marks :"+marks[0]);
	  System.out.println("Chemistry Marks :"+marks[1]);
	  System.out.println("Maths Marks :"+marks[2]);
	  System.out.println("\n");
  }
}
