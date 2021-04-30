package br.store.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.store.domain.entity.Order;
import br.store.domain.entity.User;
import br.store.domain.repository.OrderRepository;
import br.store.domain.repository.UserRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	private UserRepository users;
	private OrderRepository order1;
	
	
	public OrderController(UserRepository users, OrderRepository order1) {
		this.users = users;
		this.order1 = order1;
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
		return listadeOrderUser;

	}
}
