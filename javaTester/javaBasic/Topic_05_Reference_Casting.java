package javaBasic;

public class Topic_05_Reference_Casting {
	protected String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showStudentName() {
		System.out.println("Student Name= " + studentName);
	}
	
	public static void main(String[] args) {
		Topic_05_Reference_Casting firstStudent = new Topic_05_Reference_Casting();
		Topic_05_Reference_Casting secondStudent = new Topic_05_Reference_Casting();
		
		firstStudent.setStudentName("Nguyen Van A");
		secondStudent.setStudentName("Tran Van B");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		// Ép kiểu
		firstStudent = secondStudent;
		
		secondStudent.setStudentName("Le Thi C");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
	}

}
