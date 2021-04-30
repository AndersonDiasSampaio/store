package br.store.domain.entity;

public class Shopping {
	Integer notafiscal;
	Integer quantity;
	float preco;
	float disconto;
	String category;
	String nomeProduct;
	
	public Shopping(Integer notafiscal, Integer quantity, float preco, String category, String nomeProduct) {
		this.notafiscal = notafiscal;
		this.quantity = quantity;
		this.preco = preco;
		this.category = category;
		this.nomeProduct = nomeProduct;
	}
	public Shopping() {
		
	}
	public Integer getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(Integer notafiscal) {
		this.notafiscal = notafiscal;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNomeProduct() {
		return nomeProduct;
	}
	public void setNomeProduct(String nomeProduct) {
		this.nomeProduct = nomeProduct;
	}	
	
	
}
