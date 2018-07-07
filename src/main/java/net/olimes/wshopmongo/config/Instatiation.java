package net.olimes.wshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import net.olimes.wshopmongo.domain.User;
import net.olimes.wshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User du = new User(null, "Du", "du@gmail.com");
		User dudu = new User(null, "Dudu", "dudu@gmail.com");
		User edu = new User(null, "Edu", "edu@gmail.com");

		userRepository.saveAll(Arrays.asList(du, dudu, edu));
		
	}

}
