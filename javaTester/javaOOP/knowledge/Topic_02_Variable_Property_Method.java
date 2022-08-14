package javaOOP.knowledge;

public class Topic_02_Variable_Property_Method {
	// Access Modifier
	// Data Type
	// Variable name
	// Variable value
	private String studentName = "Automation FC"; // Global variable
	
	// Static variable
	public static String studentAddress = "HCM";
	public static String studentPhone = "0989800998";
	
	// Final variable
	final String country = "VN";
	
	// Static final variable 
	static final float PI_NUMBER = 3.1415f;
	
	// Access modifier: default
	int studentID = 1008;

	// Hàm (method) - static
	public static void main(String[] args) {
		// Local variable - biến cục bộ: hàm
		String studentName = "Automation FC";
		
		if (studentName.startsWith("Automation")) {
			// Local variable - biến cục bộ: block code
			int number = 100;
		}

	}
	
	public void display() {
		// Local variable
		String studentName = "Automation FC";
	}

}
