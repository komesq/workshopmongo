package net.olimes.wshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.olimes.wshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User ze = new User("1", "Ze", "ze@email.com");
		User edu = new User("2", "Edu", "edu@email.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(ze,edu));
		
		return ResponseEntity.ok().body(list);
	}
}
