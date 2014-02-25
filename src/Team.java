import java.util.ArrayList;
import java.util.Iterator;


public class Team {
ArrayList<Student> members = new ArrayList<Student>();
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public void addStudent(Student s){
		members.add(s);
	}
	public void printTeam(){
		Iterator<Student> i=members.iterator();
		
		while (i.hasNext()){
		i.next().printInfo();
		}
		
	}

}
