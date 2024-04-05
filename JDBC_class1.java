package JDBC_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import new_package.Student;
import new_package.StudentDao;

public class JDBC_class1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
System.out.println("Welcome");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
	System.out.println("PRESS 1 to ADD student");
	System.out.println("PRESS 2 to DELETE student");
	System.out.println("PRESS 3 to DISPLAY student");
	System.out.println("PRESS 4 to EXIT app");
	int c=Integer.parseInt(br.readLine());

	if(c==1)
	{
		//add
		System.out.println("Enter user name:");
	String name=br.readLine();
	
	System.out.println("Enter user phone:");
	String phone=br.readLine();
	
	System.out.println("Enter user city:");
	String city=br.readLine();
	
	//create student object to store
	Student st=new Student(name,phone,city);
	boolean answer=StudentDao.insertstudentToDB(st);
	if(answer) {
		System.out.println("Student is added successfully.....");
	}
	else
	{
		System.out.println("Something went wrong...");
	}
	
	System.out.println(st);
	
	
	
	}
	else if(c==2)
	{
		//delete
	}
	else if(c==3)
	{
		//display student
	}
	else if(c==4)
	{
		//exit
		break;
	}
	else
	{
		
	}
System.out.println("Thankyou for using my application....");
System.out.println("See you soon...bye");
}

	}

}
