package br.store.rest.controller;

import org.springframework.web.bind.annotation.*;
import br.store.domain.entity.*;
import br.store.domain.repository.OrderRepository;
import br.store.domain.repository.ProdutRepository;
import br.store.domain.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserRepository users;
	private OrderRepository order1;

	public UserController(UserRepository users, OrderRepository order) {
		this.users = users;
		this.order1 = order;
	}
	

	@GetMapping("{id}")
	public User getUserId(@PathVariable Integer id) {
		return users.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
	}


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody User user) {
		return users.save(user);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		users.findById(id).map(user -> {
			users.delete(user);
			return user;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));

	}

	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable Integer id, @RequestBody User cliente) {
		users.findById(id).map(clienteExistente -> {
			cliente.setId(clienteExistente.getId());
			users.save(cliente);
			return clienteExistente;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
	}

	
}
