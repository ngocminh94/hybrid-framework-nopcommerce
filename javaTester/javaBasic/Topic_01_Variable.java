package javaBasic;

public class Topic_01_Variable {
	
	  static int studentNumber; 
	  static boolean status; 
	  static final String
	  browserName = "Chrome"; 
	  static int studentPrice;
	
	String studentName = "Min Trinh";
	
	public static void main(String[] args) {
		int studentPrice = 5;
		
		System.out.println(studentPrice);
		
		System.out.println(studentNumber);
		System.out.println(status);
		
		Topic_01_Variable topic = new Topic_01_Variable();
		
		System.out.println(topic.studentName);
		
	}
	
	// Getter: getCurrentUrl/ getText/ getAttribute/ getCssValue/ getSize/ getLocation/ getPosition/... 
	public String getStudentNumber() {
		return this.studentName;	
	}
	
	// Setter: click/ sendkey/ clear/ select/ back/ forward/ refresh/ get/...
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}
	

}
