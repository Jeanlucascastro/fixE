package entities;

public class OrderItem {
	Integer quantidade;
	Double preco;
	
	private Product product;
	
	public OrderItem(Integer quantidade, Double preco, Product product) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.product = product;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantidade * preco;
	}

	
}
