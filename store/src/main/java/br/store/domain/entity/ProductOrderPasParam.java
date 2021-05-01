package br.store.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class ProductOrderPasParam {

	
	private Integer idProductOrder;
	
	private Integer product;
	
	private Integer order;
	private Integer quantity;

	public Integer getIdProductOrder() {
		return idProductOrder;
	}

	public void setIdProductOrder(Integer idProductOrder) {
		this.idProductOrder = idProductOrder;
	}

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
