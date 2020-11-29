package com.joaolummertz.workshopspringmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaolummertz.workshopspringmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
