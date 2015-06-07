package hello;

import java.util.List;

public class Greetings {
	
	private final List<Greeting> greetingList;
	
	public Greetings(List<Greeting> greetingList) {
		this.greetingList = greetingList;
	}
	
	public List<Greeting> getGreetingList() {
		return greetingList;
	}

}
