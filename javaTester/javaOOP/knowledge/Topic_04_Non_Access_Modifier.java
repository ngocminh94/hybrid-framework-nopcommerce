package javaOOP.knowledge;

public class Topic_04_Non_Access_Modifier {

	// Static: variable/ method
	// Dùng cho tất cả các instance/ object
	// Phạm vi cho toàn bộ system sử dụng nó
	// Có thể override đc
	static String browserName = "Chrome";
		
	// Non static
	String serverName = "Testing";
		
	public static void main(String[] args) {
	System.out.println(browserName);
		
	Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
	System.out.println(topic.serverName);

	}

}
