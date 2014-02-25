import java.util.ArrayList;
import java.util.Iterator;


public class Student {
private String email;
private String name;
private String username;
private Time prefer=Time.EITHER;
private ArrayList<Day> canNotMeetDays = new ArrayList<Day>(); 
	public Student(String _name,String _email, String _username) {
		name=_name;
		email=_email;
		username=_username;
	}

	public void printInfo(){
		System.out.println("name:"+name);
		System.out.println("email:"+email);
		System.out.println("username:"+username);
		System.out.print("Cannot Meet:");
		Iterator<Day> i=this.canNotMeetDays.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+":");
		}
		System.out.println();
		System.out.println("Prefer to Meet(Day/Night): " +prefer);
		System.out.println("-----------------");
	}
	
	public void canNotMeet(Day d){
		canNotMeetDays.add(d);
	}
	public void preferTimeToMeet(Time t){
		prefer=t;
	}
}
