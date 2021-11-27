package javaAccModFirst;

public class Computer {
	// Property
	private int ssdSize;
	
	// Method
	private void setSsdSize(int ssd_size) {
		ssdSize = ssd_size;
	}
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.ssdSize = 500;
		
	}

}
