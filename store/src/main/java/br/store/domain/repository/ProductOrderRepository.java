package br.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.store.domain.entity.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer>{

}
