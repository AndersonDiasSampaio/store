package br.store.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.store.domain.entity.ProductOrder;
import br.store.domain.entity.User;
import br.store.domain.repository.ProductOrderRepository;

@RestController
@RequestMapping("/api/ProductOrderController")
public class ProductOrderControlller {
private ProductOrderRepository productOrder;

public ProductOrderControlller(ProductOrderRepository productOrder) {
	this.productOrder = productOrder;
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public ProductOrder save(@RequestBody ProductOrder user) {
	return productOrder.save(user);
}
}
