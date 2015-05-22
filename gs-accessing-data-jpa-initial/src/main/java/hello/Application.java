package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	CustomerRepository repository;

	@Override
	public void run(String... arg0) throws Exception {
		// save some customers
		repository.save(new Customer("Bill", "Frendly"));
		repository.save(new Customer("Andrew", "Watson"));
		repository.save(new Customer("Sarah", "Evil"));
		repository.save(new Customer("May", "Notson"));
		repository.save(new Customer("Susan", "Life"));
		repository.save(new Customer("Graham", "Presley"));
		
		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
		
		// fetch an individual customer by ID
		Customer customer = repository.findOne(1L);
		System.out.println("Customer found with findOne(1L):");
		System.out.println("--------------------------------");
		System.out.println(customer);
		System.out.println();
		
		// fetch customers by last name
		System.out.println("Customer found with findByLastName('Watson':");
		System.out.println("--------------------------------------------");
		for(Customer watson : repository.findByLastName("Watson")) {
			System.out.println(watson);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
