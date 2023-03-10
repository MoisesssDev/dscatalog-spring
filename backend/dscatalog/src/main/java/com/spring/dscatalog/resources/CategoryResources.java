package com.spring.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		
		list.add(new Category(1L, "books"));
		list.add(new Category(2L, "electronics"));
		
		return ResponseEntity.ok().body(list);
	}
	
}
