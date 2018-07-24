package net.olimes.wshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.olimes.wshopmongo.domain.User;
import net.olimes.wshopmongo.repository.UserRepository;
import net.olimes.wshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow( () -> new ObjectNotFoundException("Usuário não encontrado") );
		
	}
}
