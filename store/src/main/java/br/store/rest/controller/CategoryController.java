package br.store.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.store.domain.entity.Category;
import br.store.domain.entity.User;
import br.store.domain.repository.CategoryRepository;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	private CategoryRepository category;

	public CategoryController(CategoryRepository category) {
		this.category = category;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Category save(@RequestBody Category category1) {
		return category.save(category1);
	}
	
	
}
