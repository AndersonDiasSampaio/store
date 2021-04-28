package br.store.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcategory;
	private String categoryName;
	private float categoryDesconto;

	public Integer getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(Integer idcategory) {
		this.idcategory = idcategory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public float getCategoryDesconto() {
		return categoryDesconto;
	}

	public void setCategoryDesconto(float categoryDesconto) {
		this.categoryDesconto = categoryDesconto;
	}

}
