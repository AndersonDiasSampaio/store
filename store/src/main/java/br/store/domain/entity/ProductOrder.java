package br.store.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productOrder")
public class ProductOrder {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProductOrder;
	@ManyToOne
	@JoinColumn(name ="idproduct")
	private Produt product;
	@ManyToOne
	@JoinColumn(name ="idorder")
	private Order order;
	private Integer quantity;

	public Integer getIdProductOrder() {
		return idProductOrder;
	}

	public void setIdProductOrder(Integer idProductOrder) {
		this.idProductOrder = idProductOrder;
	}

	public Produt getProduct() {
		return product;
	}

	public void setProduct(Produt product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
