package lab21;
import java.util.Scanner;
 class Employeenew 

	
		{
			String name,address,phoneNum;
			int age;
			double salary;
			void PrintSalary()
			{
			System.out.println("OFFICER DETAILS: ");
			System.out.println("NAME:"+name);
			System.out.println("AGE:"+age);
			System.out.println("ADDRESS:"+address);
			System.out.println("PHONE NUMBER:"+phoneNum);
			System.out.println("SALARY:"+salary);
			}

			}
			class Officer extends Employeenew
			{
			String specialization;
			void officer()
			{
			System.out.println("OFFICER DETAILS: ");
			System.out.println("NAME:"+name);
			System.out.println("AGE:"+age);
			System.out.println("ADDRESS:"+address);
			System.out.println("Specialization:"+specialization);
			}
			

			class Manager extends Officer
			{
			String department;
			void manager()
			{
			System.out.println("OFFICER DETAILS: ");
			System.out.println("NAME:"+name);
			System.out.println("AGE:"+age);
			System.out.println("ADDRESS:"+address);
			System.out.println("Department"+department);
			}
			}
			public class EmployeeDetails {

			public static void main(String[] args)
			{
			      Scanner sc = new Scanner(System.in);
			      Employee e= new Employee();
			      Manager m =new Manager();
			      Officer o=new Officer();
			      System.out.println("Enter the name: ");
			      m.name = sc.next();
			      System.out.println("Enter the Age: ");
			      m.age =sc.nextInt();
			      System.out.println("Enter the Address: ");
			      m.address = sc.next();
			 System.out.println("Enter the Phone number: ");
			 e.phoneNum = sc.next();
			      System.out.println("Enter the Department: ");
			      m.department=sc.next();
			     
			      System.out.println("Enter the Specialization: ");
			      o.specialization=sc.next();
			     
			     
			      sc.close();
			}
			}
			}
			



	


