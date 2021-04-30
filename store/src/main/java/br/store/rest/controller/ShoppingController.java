package br.store.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.store.domain.entity.*;
import br.store.domain.repository.*;

@RestController
@RequestMapping("/api/shoppings")
public class ShoppingController {
	private UserRepository users;
	private OrderRepository order1;
	private CategoryRepository category;
	private ProdutRepository produt;
	private ProductOrderRepository productOrder;

	public ShoppingController(UserRepository users, OrderRepository order1, CategoryRepository category,
			ProdutRepository produt, ProductOrderRepository productOrder) {
		this.users = users;
		this.order1 = order1;
		this.category = category;
		this.produt = produt;
		this.productOrder = productOrder;
	}

	@GetMapping("{order}") // GetOrder Está no lugar errado
	public List<ProductOrder> listOrders(@PathVariable Integer order) {
		List<User> listaUser = users.findAll();
		List<ProductOrder> productOrderList = productOrder.findAll();
		List<ProductOrder> productOrderListSave = productOrder.findAll();
		productOrderListSave.clear();
		ProductOrder POrder = new ProductOrder();
		User user1 = new User();
		for (int a1 = 0; listaUser.size() > a1; a1++) {
			if (listaUser.get(a1).getId() == order) {
				user1.setId(listaUser.get(a1).getId());
				user1.setUserName(listaUser.get(a1).getUserName());
				user1.setUserPassword(listaUser.get(a1).getUserPassword());
			}
		}

		List<Order> listaOrder = order1.findAll();
		List<Order> listaP = order1.findAll();
		listaP.clear();
		Order p = new Order();

		for (int a1 = 0; listaOrder.size() > a1; a1++) {
			p = listaOrder.get(a1);

			if ((p.getUserID()) == (user1.getId())) {

				listaP.add(p);
				for (int a2 = 0; productOrderList.size() > a2; a2++) {
					POrder = productOrderList.get(a2);
					if ((p.getId()) == (POrder.getIdProductOrder())) {

						productOrderListSave.add(POrder);
					}

				}
			} else {

			}

		}
		return productOrderListSave;

	}

}
