package javaOOP.knowledge;

public class Topic_01_Class_Object {
	private int studentID;
	private String studentName;
	private Float knowledgePoint;
	private Float practicePoint;

	private int getStudentID() {
		return studentID;
	}


	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	private String getStudentName() {
		return studentName;
	}


	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	private Float getKnowledgePoint() {
		return knowledgePoint;
	}


	private void setKnowledgePoint(Float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}


	private Float getPracticePoint() {
		return practicePoint;
	}


	private void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	private Float getAveragePoint() {
		return (this.knowledgePoint + this.practicePoint *2)/3;
	}
	
	private void showStudentInfo() {
		System.out.println("**********");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student name = " + getStudentName());
		System.out.println("Student knowledge point = " + getKnowledgePoint());
		System.out.println("Student practice point = " + getPracticePoint());
		System.out.println("Student average point = " + getAveragePoint());
		System.out.println("**********");
		
	}

	public static void main(String[] args) {
		Topic_01_Class_Object firstStudent = new Topic_01_Class_Object();
		firstStudent.setStudentID(001);
		firstStudent.setStudentName("Min Trinh");
		firstStudent.setKnowledgePoint(8.0f);
		firstStudent.setPracticePoint(8.5f);
		firstStudent.showStudentInfo();

	}

}
