package br.store.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Produt {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nameProduct;
	private float priceProduct;
	//@ManyToOne
	//@JoinColumn(name ="idcategory")
	private int category_ID;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public float getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}
	public int getCategory_ID() {
		return category_ID;
	}
	public void setCategory_ID(int category_ID) {
		this.category_ID = category_ID;
	}
	
	public Produt(String nameProduct, float priceProduct, int category_ID) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.category_ID = category_ID;
	}
	public Produt() {
	
	}
	
	
}
