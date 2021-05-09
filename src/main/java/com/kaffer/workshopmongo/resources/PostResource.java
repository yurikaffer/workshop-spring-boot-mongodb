package com.kaffer.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kaffer.workshopmongo.domain.Post;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Post>> findAll() {
		

		List<Post> list = new ArrayList<>();
		list.addAll(Arrays.asList());
		return ResponseEntity.ok().body(list);
	}

}
