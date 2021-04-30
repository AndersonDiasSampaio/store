package br.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.store.domain.entity.Order;
import br.store.domain.entity.User;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
