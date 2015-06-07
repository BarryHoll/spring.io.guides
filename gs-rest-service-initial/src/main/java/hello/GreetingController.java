package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * In Spring RESTful web services, HTTP requests are handled
 * by a controller and these can be identified by the
 * @RestController annotation.
 */
@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="Life") String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));		
	}
	
	@RequestMapping("/greetingList")
	public List<Greeting> greetingList(@RequestParam(value="name", defaultValue="The Universe") String name) {
		return getTestGreetingList(name);
	}
	
	@RequestMapping("/greetings")
	public Greetings greetings(@RequestParam(value="name", defaultValue="Everything") String name) {
		Greetings greetings = new Greetings(getTestGreetingList(name));	
		return greetings;
	}
	
	private List<Greeting> getTestGreetingList(String name) {
		List<Greeting> greetingList = new ArrayList<Greeting>();
		greetingList.add(new Greeting(counter.incrementAndGet(), String.format(template, name)));
		greetingList.add(new Greeting(counter.incrementAndGet(), String.format(template, name)));
		greetingList.add(new Greeting(counter.incrementAndGet(), String.format(template, name)));
		return greetingList;
	}
}
