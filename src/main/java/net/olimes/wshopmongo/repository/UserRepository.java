package net.olimes.wshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.olimes.wshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
