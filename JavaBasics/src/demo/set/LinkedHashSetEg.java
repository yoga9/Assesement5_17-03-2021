package demo.set;
import java.util.*;

public class LinkedHashSetEg {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> l = new LinkedHashSet<Employee>();
		
		Employee e1 = new Employee(101, "Yoga", "Ravi", "Analytics&IT", "IT Intern", "15K" );
		Employee e2 = new Employee(102, "Ragul", "Ravi", "Analytics&IT", "IT Intern", "15K" );
		Employee e3 = new Employee(103, "Luxmi", "Ravi", "Analytics&IT", "IT Intern", "15K" );
		Employee e4 = new Employee(104, "Karnan", "Ravi", "Analytics&IT", "IT Intern", "15K" );
		Employee e5 = new Employee(101, "Saran", "Ravi", "Analytics&IT", "IT Intern", "15K" ); //allow duplication
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		Iterator<Employee> i = l.iterator();        //Hashcode Generate
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		                                     
		for(Employee emp : l) {
			System.out.println(emp.EmpID + " " + emp.EmpName + " " + emp.ManagerName + " " + emp.Department + " " + emp.Designaton + " " + emp.Salary);
		
	}

}}


class Employee{
	
	int EmpID;
	String EmpName, ManagerName, Department, Designaton;
	String Salary ;

	   
	public Employee(int EmpID, String EmpName, String ManagerName, String Department, String Designaton, String Salary) {
		super();
		this.EmpID = EmpID;
		this.EmpName = EmpName;
		this.ManagerName = ManagerName;
		this.Department = Department;
		this.Designaton = Designaton;
		this.Salary = Salary;
	}
}
	

