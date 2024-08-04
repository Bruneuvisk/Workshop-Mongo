package com.brunohenrique.workshopmongo.resources;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunohenrique.workshopmongo.domain.User;

@Repository
public interface UserResource extends MongoRepository<User, String> {
	
}
