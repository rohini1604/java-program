package encapsulation;

public class student {
	private int rollnumber;
	private String name;
	boolean isAttended;
	
	public student(int rollnumber) {
		this.rollnumber=rollnumber;
	}
    
	public void setstudentAttendence(boolean flag) {
		if(! isAttended)
		isAttended=flag;
		System.out.println("teacher assigned  attedence to student");
	}
	
	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getstudentAttendence() {
		System.out.println("teacher accessed attedence to student");
		return isAttended;
	}
}
