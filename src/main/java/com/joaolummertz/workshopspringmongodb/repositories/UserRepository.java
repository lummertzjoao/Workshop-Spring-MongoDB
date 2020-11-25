package com.joaolummertz.workshopspringmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaolummertz.workshopspringmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
