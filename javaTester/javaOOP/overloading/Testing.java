package javaOOP.overloading;

import javaOOP.knowledge.Topic_06_Getter_Setter;

public class Testing {

	public static void main(String[] args) {
		Topic_06_Getter_Setter topic = new Topic_06_Getter_Setter();
		
		// Happy case
		topic.setPersonName("Min");
		System.out.println(topic.getPersonName());

		// Unhappy case		
		topic.setPersonName("");
		System.out.println(topic.getPersonName());
		
	}

}
