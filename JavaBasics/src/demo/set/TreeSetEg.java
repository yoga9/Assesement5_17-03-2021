package demo.set;
import java.util.*;

public class TreeSetEg {
	
	public static void main(String[] args) {
		
		TreeSet<Student> T = new TreeSet<Student>();
		
		Student s1 = new Student(101, "Priya", "Maths-Biology", 1);
		Student s2 = new Student(201, "Ravi", "Maths-Computer", 2);
		Student s3 = new Student(301, "Nithya", "Maths-Biology", 1);
		Student s4 = new Student(101, "Nithya", "Maths-Biology", 3);
		Student s5= new Student(201, "Saravanan", "Maths-Biology", 1);     //Duplicate id - removed
		
		T.add(s1);
		T.add(s2);
		T.add(s3);
		T.add(s4);
		T.add(s5);
		                             
		for(Student s : T) {                      
			System.out.println(s.id+ " " +s.Name+ " " +s.Specialization+ " " +s.Rank);
		}
		
		Iterator<Student> i = T.iterator();        //Hashcode Generate
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}

 class Student implements Comparable<Student> {
	
	
	int id;
	String Name, Specialization;
	int Rank;
	
	public Student (int id, String Name, String Specialization, int Rank ) {
		this.id = id;
		this.Name = Name;
		this.Specialization = Specialization;
		this.Rank = Rank;
	}
	
	public int compareTo(Student s) {
		if(id>s.id) {
			return 1;
		}
			
			else if(id<s.id) {
				return -1; }
				
		     else {
				return 0;
			}
		}
	}
	
	

