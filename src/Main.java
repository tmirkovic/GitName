import java.util.ArrayList;
import java.util.Iterator;


public class Main {
private ArrayList<Student> students= new ArrayList<Student>();
private ArrayList<Team> teams= new ArrayList<Team>();
	public Main() {
		//ADD YOURSELF HERE with your github email and username
		Student nathan = new Student("Nathan Green", "github@nathangreen.com", "ndgreen");
		nathan.canNotMeet(Day.SATURDAY);//Choose only the days you cannot meet
		nathan.canNotMeet(Day.SUNDAY);
		nathan.preferTimeToMeet(Time.DAY); // Choose Day/Night/Either
		addStudent(nathan);
		
		//Add yourself below here
		
		Student tina = new Student("Septina Dian Larasati", "septina.larasati@gmail.com", "slarasati");
		tina.canNotMeet(Day.SATURDAY);//Choose only the days you cannot meet
		tina.canNotMeet(Day.SUNDAY);
		tina.preferTimeToMeet(Time.DAY); // Choose Day/Night/Either
		addStudent(tina);
		
		Student tim = new Student("Tim Green", "github@nathangreen.com", "ndgreen");
		tim.canNotMeet(Day.THURSDAY);//Choose only the days you cannot meet
		tim.canNotMeet(Day.FRIDAY);
		tim.preferTimeToMeet(Time.EITHER); // Choose Day/Night/Either
		addStudent(tim);
		
		
		
		
		//finish add 
		printAllStudents();
	}

	public static void main(String[] args) {
      new Main();
	}
	
	private void addStudent(Student s){
		students.add(s);		
	}
	private void addStudentToTeam(Student s, int team){
		teams.get(team).addStudent(s);
	}

	private void printAllStudents(){
		Iterator<Student> i=students.iterator();
		while(i.hasNext()){
			i.next().printInfo();
		}
	}
}
