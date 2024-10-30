package Encapsulamento;

public class Produto {
private String nome;
private double preco;

public Produto (String nome,double preco) {
	this.nome=nome;
	setPreco (preco);
}
public String getNome () {
	return nome;
}
public void setNome (String nome) {
	this.nome = nome;
}
public double getPreco() {
	return preco;
}
public void setPreco (double preco) {
	if (preco >= 0 ) {
		this.preco = preco;
	}else {
		System.out.println("Preço invalido não pode ser negativo");
	}
}
public void exibirinformacoes () {
	System.out.println("Produtos:" + nome + " , Preco: " + preco);
}
}