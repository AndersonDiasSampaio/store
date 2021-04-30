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
	

	//@GetMapping("{id}")
	public User getUserId(@PathVariable Integer id) {
		return users.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
	}

	@GetMapping("{order}")//GetOrder Está no lugar errado
	public List<Order> listOrders(@PathVariable Integer order) {
		List<User> listaUser = users.findAll();
		User user1 = new User();
		for (int a1 = 0; listaUser.size() > a1; a1++) {
			if(listaUser.get(a1).getId()==order) {
				user1.setId(listaUser.get(a1).getId());
				user1.setUserName(listaUser.get(a1).getUserName());
				user1.setUserPassword(listaUser.get(a1).getUserPassword());
				System.out.println(user1);
			}
		}
		System.out.println(user1);

		List<Order> listaOrder = order1.findAll();
		System.out.println(listaOrder);

		Order P = new Order();
		System.out.println(user1);

		List<Order> listadeOrderUser = order1.findAll();
		System.out.println(user1);

		listadeOrderUser.clear();
		for (int a1 = 0; listaOrder.size() > a1; a1++) {
			P.setUserID(listaOrder.get(a1).getUserID());
			P.setId(listaOrder.get(a1).getId());
			System.out.println("Primeiro");

			if ((P.getUserID()) == user1.getId()) {

				listadeOrderUser.add(P);
			} else {

			}

		}
		System.out.println(listaOrder);
		return listaOrder;

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody User cliente) {
		return users.save(cliente);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		users.findById(id).map(cliente -> {
			users.delete(cliente);
			return cliente;
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

	@GetMapping
	public List<User> find(User filtro) {
		ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
				.withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

		Example example = Example.of(filtro, matcher);
		return users.findAll(example);
	}
}
