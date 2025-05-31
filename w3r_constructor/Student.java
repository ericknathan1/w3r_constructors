package w3r_constructor;

public class Student {
	private int studentId;
	private String studentName;
	private String grade;
	
	public Student() {
		this(0,"Unknown","None");
	}
	
	public Student(int studentId,String studentName, String grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
}	
