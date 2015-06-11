package com.bchollywood.movies;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	
	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
						MovieRepository movieRepository) {
		return (evt) -> Arrays.asList(
						"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
						.forEach(
								a -> {
									Account account = accountRepository.save(new Account(a,	"password"));
									movieRepository.save(new Movie(account, "Chinatown", "Polanski", "1974", 131));
									movieRepository.save(new Movie(account, "The Shining", "Kubrick", "1980", 146));
								});
	}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
