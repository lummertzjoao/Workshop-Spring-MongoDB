package com.joaolummertz.workshopspringmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaolummertz.workshopspringmongodb.domain.Post;
import com.joaolummertz.workshopspringmongodb.repositories.PostRepository;
import com.joaolummertz.workshopspringmongodb.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
